package com.example.starbucks.Order;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.R;

public class Delivery extends Fragment {

    private TextView txtView_startPointName, txtView_endPointName, txtView_startPointAddress, txtView_endPointAddress, txtView_addMore, txtView_orderName, txtView_orderDesc, txtView_orderCost,
            txtView_orderQuantity, txtView_orderSize, txtView_starbucksCardNumber, txtView_cardName, txtView_cardBalance, txtView_chooseVoucher, txtView_shippingCost, txtView_price, txtView_shippingCharge,
            txtView_totalCost;

    private ImageView imgView_startingPointEdit, imgView_endPointEdit, imgView_order, imgView_bookMarked, imgView_paymentCard, imgView_changeCard;

    private androidx.appcompat.widget.AppCompatButton btn_payNow, btn_points;

    private Context mContext;


    //Variables to store Intent Data



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_delivery, container, false);

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

        //TextView
        txtView_startPointName = v.findViewById(R.id.txtView_startPointName);
        txtView_endPointName = v.findViewById(R.id.txtView_endPointName);
        txtView_startPointAddress = v.findViewById(R.id.txtView_startPointAddress);
        txtView_endPointAddress = v.findViewById(R.id.txtView_endPointAddress);
        txtView_addMore = v.findViewById(R.id.txtView_addMore);
        txtView_orderName = v.findViewById(R.id.txtView_orderName);
        txtView_orderDesc = v.findViewById(R.id.txtView_orderDesc);
        txtView_orderCost = v.findViewById(R.id.txtView_orderCost);
        txtView_orderQuantity = v.findViewById(R.id.txtView_orderQuantity);
        txtView_orderSize = v.findViewById(R.id.txtView_orderSize);
        txtView_starbucksCardNumber = v.findViewById(R.id.txtView_starbucksCardNumber);
        txtView_cardName = v.findViewById(R.id.txtView_cardName);
        txtView_cardBalance = v.findViewById(R.id.txtView_cardBalance);
        txtView_chooseVoucher = v.findViewById(R.id.txtView_chooseVoucher);
        txtView_shippingCost = v.findViewById(R.id.txtView_shippingCost);
        txtView_price = v.findViewById(R.id.txtView_price);
        txtView_shippingCharge = v.findViewById(R.id.txtView_shippingCharge);
        txtView_totalCost = v.findViewById(R.id.txtView_totalCost);

        //ImageView
        imgView_startingPointEdit = v.findViewById(R.id.imgView_startingPointEdit);
        imgView_endPointEdit = v.findViewById(R.id.imgView_endPointEdit);
        imgView_order = v.findViewById(R.id.imgView_order);
        imgView_bookMarked = v.findViewById(R.id.imgView_bookMarked);
        imgView_paymentCard = v.findViewById(R.id.imgView_paymentCard);
        imgView_changeCard = v.findViewById(R.id.imgView_changeCard);

        //androidx.appcompat.widget.AppCompatButton
        btn_payNow = v.findViewById(R.id.btn_payNow);
        btn_points = v.findViewById(R.id.btn_points);

        getTransferredIntentData();

        initUI();

        pageDirectories();
    }

    private void getTransferredIntentData() {
        Bundle bundle = getArguments();
        if (bundle != null) {
            String value = bundle.getString("key");
            System.out.println(value);
            // Use the value here
        }
        else
            System.out.println("SHit");

    }

    private void pageDirectories() {

        btn_payNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, PinConfirmation_Activity.class);
                startActivity(intent);
            }
        });

    }

    private void initUI() {


    }
}