package com.example.starbucks.Order;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.starbucks.Adapter.PaymentViewPagerAdapter;
import com.example.starbucks.Adapter.ViewPagerAdapter;
import com.example.starbucks.R;
import com.google.android.material.tabs.TabLayout;

public class Payment_Activity extends AppCompatActivity {

    private ImageView btn_back, imgView_filter;
    private com.google.android.material.tabs.TabLayout payment_tabLayout;
    private androidx.viewpager2.widget.ViewPager2 payment_viewPager;
    PaymentViewPagerAdapter paymentViewPagerAdapter;

    Intent intent;

    //Variable to store intent and activity values
    private String orderName, totalCost, orderTemp, orderSize;
    private int orderPic, orderQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        intent = getIntent();

        initWidget();

        getIntentTransferredData();

        initUI();

        pageDirectories();
    }

    private void getIntentTransferredData() {

        orderName = intent.getStringExtra("Order Name");
        orderQuantity = intent.getIntExtra("Order Quantity", 0);
        totalCost = intent.getStringExtra("Order Cost");
        orderPic = intent.getIntExtra("Order Pic", 0);
        orderTemp = intent.getStringExtra("Order Temp");
        orderSize = intent.getStringExtra("Order Size");

        System.out.println(orderName);
        System.out.println(orderQuantity);

    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });
    }

    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Discard changes?");
        builder.setMessage("Are you sure you want to discard your changes?");
        builder.setPositiveButton("Discard", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                onBackPressed();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void initUI() {

        paymentViewPagerAdapter = new PaymentViewPagerAdapter(this);
        payment_viewPager.setAdapter(paymentViewPagerAdapter);

        payment_tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();

                Bundle bundle = new Bundle();
                bundle.putString("key", orderName);
                Delivery fragmentOne = new Delivery();
                fragmentOne.setArguments(bundle);

                payment_viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Bundle bundle = new Bundle();
                bundle.putString("key", orderName);
                Delivery fragmentOne = new Delivery();
                fragmentOne.setArguments(bundle);
            }
        });

        payment_viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                payment_tabLayout.getTabAt(position).select();
            }
        });
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);
        imgView_filter = findViewById(R.id.imgView_filter);

        //com.google.android.material.tabs.TabLayout
        payment_tabLayout = findViewById(R.id.payment_tabLayout);

        //androidx.viewpager2.widget.ViewPager2
        payment_viewPager = findViewById(R.id.payment_viewPager);
    }
}