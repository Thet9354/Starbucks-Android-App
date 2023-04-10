package com.example.starbucks.Wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.Adapter.ViewPagerAdapter;
import com.example.starbucks.R;
import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class PortfolioActivity extends AppCompatActivity {

    private ImageView btn_back;
    private TextView txtView_balance, txtView_rewardPoints;
    private com.google.android.material.tabs.TabLayout tabLayout;
    private androidx.viewpager2.widget.ViewPager2 viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        initWidget();

        initUI();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initUI() {

        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);

        //TextView
        txtView_balance = findViewById(R.id.txtView_balance);
        txtView_rewardPoints = findViewById(R.id.txtView_rewardPoints);

        //com.google.android.material.tabs.TabLayout
        tabLayout = findViewById(R.id.tabLayout);

        //androidx.viewpager2.widget.ViewPager2
        viewPager = findViewById(R.id.viewPager);
    }
}