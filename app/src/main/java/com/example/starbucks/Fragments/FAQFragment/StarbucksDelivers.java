package com.example.starbucks.Fragments.FAQFragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.starbucks.R;


public class StarbucksDelivers extends Fragment {

    private LinearLayout ll_starbucksDeliveryOrder, ll_selectLocation, ll_redeemRewardOnline, ll_doINeedToBeAMember,
            ll_minOrderDelivery, ll_deliveryFee, ll_paymentModesDelivery, ll_multiplePaymentDelivery,
            ll_cashOnDelivery, ll_cancelledOrder, ll_amendOrders, ll_orderCancelled, ll_refundIfOrderCancelled;

    private LinearLayout ll_starbucksDeliveryOrderDetail, ll_selectLocationDetail, ll_scheduleDeliveryTimeDetail,
            ll_doINeedToBeAMemberDetail, ll_minOrderDeliveryDetails, ll_deliveryFeeDetail, ll_paymentModesDeliveryDetail,
            ll_multiplePaymentDeliveryDetail, ll_cashOnDeliveryDetail, ll_cancelledOrderDetail, ll_amendOrdersDetail,
            ll_orderCancelledDetail, ll_refundIfOrderCancelledDetail;

    private ImageView imgView_starbucksDeliveryOrder, imgView_selectLocation, imgView_scheduleDeliveryTime, imgView_doINeedToBeAMember,
            imgView_minOrderDelivery, imgView_deliveryFee, imgView_paymentModesDelivery, imgView_multiplePaymentDelivery,
            imgView_cashOnDelivery, imgView_cancelledOrder, imgView_amendOrders, imgView_orderCancelled, imgView_refundIfOrderCancelled;

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_starbucks_delivers, container, false);

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

    }
}