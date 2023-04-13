package com.example.starbucks.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.starbucks.Adapter.OrderGridAdapter;
import com.example.starbucks.R;
import com.example.starbucks.Order.Siren_Order_Activity;


public class Order extends Fragment {

    private ImageView btn_back, imgView_filter, imgView_funnel;
    private GridView gridView_order;

    OrderGridAdapter orderGridAdapter;

    private Context mContext;

    String[] orderName = {"Caramel Frappucino", "Mocha Frappucino", "Twin City", "Cinnamon Doice Latte"};

    String[] orderCost = {"5.50", "4.80", "12.50", "6.50"};

    int[] orderPic = {R.drawable.caramel_frappuccino, R.drawable.mocha_frappucino, R.drawable.happy_monday, R.drawable.cinnamon_doice_latte};

    // Variables to store value
    private String order;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_order, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews(view);
    }

    private void findViews(View v) {

        //ImageView
        btn_back = v.findViewById(R.id.btn_back);
        imgView_filter = v.findViewById(R.id.imgView_filter);
        imgView_funnel = v.findViewById(R.id.imgView_funnel);

        //GridView
        gridView_order = v.findViewById(R.id.gridView_order);


        initUI();

        pageDirectories();
    }

    private void pageDirectories() {

        gridView_order.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(mContext, "You clicked on " + orderName[position], Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, Siren_Order_Activity.class);
                intent.putExtra("Order Name", orderName[position]);
                intent.putExtra("Order Cost", orderCost[position]);
                intent.putExtra("Order Pic", orderPic[position]);

                startActivity(intent);


            }
        });

        imgView_funnel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, Siren_Order_Activity.class));
            }
        });
    }

    private void initUI() {

        orderGridAdapter = new OrderGridAdapter(mContext, orderName, orderPic);
        gridView_order.setAdapter(orderGridAdapter);
    }
}