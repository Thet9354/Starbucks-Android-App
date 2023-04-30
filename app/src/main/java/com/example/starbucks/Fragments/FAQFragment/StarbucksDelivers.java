package com.example.starbucks.Fragments.FAQFragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.starbucks.R;


public class StarbucksDelivers extends Fragment {

    private LinearLayout ll_starbucksDeliveryOrder, ll_selectLocation, ll_scheduleDeliveryTime, ll_doINeedToBeAMember,
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

        //LinearLayout
        ll_starbucksDeliveryOrder = v.findViewById(R.id.ll_starbucksDeliveryOrder);
        ll_selectLocation = v.findViewById(R.id.ll_selectLocation);
        ll_scheduleDeliveryTime = v.findViewById(R.id.ll_scheduleDeliveryTime);
        ll_doINeedToBeAMember = v.findViewById(R.id.ll_doINeedToBeAMember);
        ll_minOrderDelivery = v.findViewById(R.id.ll_minOrderDelivery);
        ll_deliveryFee = v.findViewById(R.id.ll_deliveryFee);
        ll_paymentModesDelivery = v.findViewById(R.id.ll_paymentModesDelivery);
        ll_multiplePaymentDelivery = v.findViewById(R.id.ll_multiplePaymentDelivery);
        ll_cashOnDelivery = v.findViewById(R.id.ll_cashOnDelivery);
        ll_cancelledOrder = v.findViewById(R.id.ll_cancelledOrder);
        ll_amendOrders = v.findViewById(R.id.ll_amendOrders);
        ll_orderCancelled = v.findViewById(R.id.ll_orderCancelled);
        ll_refundIfOrderCancelled = v.findViewById(R.id.ll_refundIfOrderCancelled);

        //LinearLayout
        ll_starbucksDeliveryOrderDetail = v.findViewById(R.id.ll_starbucksDeliveryOrderDetail);
        ll_selectLocationDetail = v.findViewById(R.id.ll_selectLocationDetail);
        ll_scheduleDeliveryTimeDetail = v.findViewById(R.id.ll_scheduleDeliveryTimeDetail);
        ll_doINeedToBeAMemberDetail = v.findViewById(R.id.ll_doINeedToBeAMemberDetail);
        ll_minOrderDeliveryDetails = v.findViewById(R.id.ll_minOrderDeliveryDetails);
        ll_deliveryFeeDetail = v.findViewById(R.id.ll_deliveryFeeDetail);
        ll_paymentModesDeliveryDetail = v.findViewById(R.id.ll_paymentModesDeliveryDetail);
        ll_multiplePaymentDeliveryDetail = v.findViewById(R.id.ll_multiplePaymentDeliveryDetail);
        ll_cashOnDeliveryDetail = v.findViewById(R.id.ll_cashOnDeliveryDetail);
        ll_cancelledOrderDetail = v.findViewById(R.id.ll_cancelledOrderDetail);
        ll_amendOrdersDetail = v.findViewById(R.id.ll_amendOrdersDetail);
        ll_orderCancelledDetail = v.findViewById(R.id.ll_orderCancelledDetail);
        ll_refundIfOrderCancelledDetail = v.findViewById(R.id.ll_refundIfOrderCancelledDetail);

        //ImageView
        imgView_starbucksDeliveryOrder = v.findViewById(R.id.imgView_starbucksDeliveryOrder);
        imgView_selectLocation = v.findViewById(R.id.imgView_selectLocation);
        imgView_scheduleDeliveryTime = v.findViewById(R.id.imgView_scheduleDeliveryTime);
        imgView_doINeedToBeAMember = v.findViewById(R.id.imgView_doINeedToBeAMember);
        imgView_minOrderDelivery = v.findViewById(R.id.imgView_minOrderDelivery);
        imgView_deliveryFee = v.findViewById(R.id.imgView_deliveryFee);
        imgView_paymentModesDelivery = v.findViewById(R.id.imgView_paymentModesDelivery);
        imgView_multiplePaymentDelivery = v.findViewById(R.id.imgView_multiplePaymentDelivery);
        imgView_cashOnDelivery = v.findViewById(R.id.imgView_cashOnDelivery);
        imgView_cancelledOrder = v.findViewById(R.id.imgView_cancelledOrder);
        imgView_amendOrders = v.findViewById(R.id.imgView_amendOrders);
        imgView_orderCancelled = v.findViewById(R.id.imgView_orderCancelled);
        imgView_refundIfOrderCancelled = v.findViewById(R.id.imgView_refundIfOrderCancelled);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_refundIfOrderCancelled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRefundIfOrderCancelled();
            }
        });

        ll_orderCancelled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandOrdersCancelled();
            }
        });

        ll_amendOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandAmendOrders();
            }
        });

        ll_cancelledOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCancelledOrder();
            }
        });

        ll_cashOnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCashOnDelivery();
            }
        });

        ll_multiplePaymentDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMultiplePaymentDelivery();
            }
        });

        ll_paymentModesDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandPaymentModesDelivery();
            }
        });

        ll_deliveryFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDeliveryFee();
            }
        });

        ll_minOrderDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMinOrderDelivery();
            }
        });

        ll_doINeedToBeAMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDoINeedToBeMember();
            }
        });

        ll_scheduleDeliveryTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRedeemRewardOnline();
            }
        });

        ll_starbucksDeliveryOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStarbucksDeliveryOrder();
            }
        });

        ll_selectLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandSelectLocation();
            }
        });


    }

    private void expandRefundIfOrderCancelled() {
        int v = (ll_refundIfOrderCancelledDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_refundIfOrderCancelledDetail, new AutoTransition());
        ll_refundIfOrderCancelledDetail.setVisibility(v);

        if (ll_refundIfOrderCancelledDetail.getVisibility() == View.VISIBLE)
            imgView_refundIfOrderCancelled.setImageResource(R.drawable.arrow_up);
        else
            imgView_refundIfOrderCancelled.setImageResource(R.drawable.arrow_down);
    }

    private void expandOrdersCancelled() {
        int v = (ll_orderCancelledDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_orderCancelledDetail, new AutoTransition());
        ll_orderCancelledDetail.setVisibility(v);

        if (ll_orderCancelledDetail.getVisibility() == View.VISIBLE)
            imgView_orderCancelled.setImageResource(R.drawable.arrow_up);
        else
            imgView_orderCancelled.setImageResource(R.drawable.arrow_down);
    }

    private void expandAmendOrders() {
        int v = (ll_amendOrdersDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_amendOrdersDetail, new AutoTransition());
        ll_amendOrdersDetail.setVisibility(v);

        if (ll_amendOrdersDetail.getVisibility() == View.VISIBLE)
            imgView_amendOrders.setImageResource(R.drawable.arrow_up);
        else
            imgView_amendOrders.setImageResource(R.drawable.arrow_down);
    }

    private void expandCancelledOrder() {
        int v = (ll_cancelledOrderDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cancelledOrderDetail, new AutoTransition());
        ll_cancelledOrderDetail.setVisibility(v);

        if (ll_cancelledOrderDetail.getVisibility() == View.VISIBLE)
            imgView_cancelledOrder.setImageResource(R.drawable.arrow_up);
        else
            imgView_cancelledOrder.setImageResource(R.drawable.arrow_down);
    }

    private void expandCashOnDelivery() {
        int v = (ll_cashOnDeliveryDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cashOnDeliveryDetail, new AutoTransition());
        ll_cashOnDeliveryDetail.setVisibility(v);

        if (ll_cashOnDeliveryDetail.getVisibility() == View.VISIBLE)
            imgView_cashOnDelivery.setImageResource(R.drawable.arrow_up);
        else
            imgView_cashOnDelivery.setImageResource(R.drawable.arrow_down);
    }

    private void expandMultiplePaymentDelivery() {
        int v = (ll_multiplePaymentDeliveryDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_multiplePaymentDeliveryDetail, new AutoTransition());
        ll_multiplePaymentDeliveryDetail.setVisibility(v);

        if (ll_multiplePaymentDeliveryDetail.getVisibility() == View.VISIBLE)
            imgView_multiplePaymentDelivery.setImageResource(R.drawable.arrow_up);
        else
            imgView_multiplePaymentDelivery.setImageResource(R.drawable.arrow_down);
    }

    private void expandPaymentModesDelivery() {
        int v = (ll_paymentModesDeliveryDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_paymentModesDeliveryDetail, new AutoTransition());
        ll_paymentModesDeliveryDetail.setVisibility(v);

        if (ll_paymentModesDeliveryDetail.getVisibility() == View.VISIBLE)
            imgView_paymentModesDelivery.setImageResource(R.drawable.arrow_up);
        else
            imgView_paymentModesDelivery.setImageResource(R.drawable.arrow_down);
    }

    private void expandDeliveryFee() {
        int v = (ll_deliveryFeeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_deliveryFeeDetail, new AutoTransition());
        ll_deliveryFeeDetail.setVisibility(v);

        if (ll_deliveryFeeDetail.getVisibility() == View.VISIBLE)
            imgView_deliveryFee.setImageResource(R.drawable.arrow_up);
        else
            imgView_deliveryFee.setImageResource(R.drawable.arrow_down);
    }

    private void expandMinOrderDelivery() {
        int v = (ll_minOrderDeliveryDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_minOrderDeliveryDetails, new AutoTransition());
        ll_minOrderDeliveryDetails.setVisibility(v);

        if (ll_minOrderDeliveryDetails.getVisibility() == View.VISIBLE)
            imgView_minOrderDelivery.setImageResource(R.drawable.arrow_up);
        else
            imgView_minOrderDelivery.setImageResource(R.drawable.arrow_down);
    }

    private void expandDoINeedToBeMember() {
        int v = (ll_doINeedToBeAMemberDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_doINeedToBeAMemberDetail, new AutoTransition());
        ll_doINeedToBeAMemberDetail.setVisibility(v);

        if (ll_doINeedToBeAMemberDetail.getVisibility() == View.VISIBLE)
            imgView_doINeedToBeAMember.setImageResource(R.drawable.arrow_up);
        else
            imgView_doINeedToBeAMember.setImageResource(R.drawable.arrow_down);
    }

    private void expandRedeemRewardOnline() {
        int v = (ll_scheduleDeliveryTimeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_scheduleDeliveryTimeDetail, new AutoTransition());
        ll_scheduleDeliveryTimeDetail.setVisibility(v);

        if (ll_scheduleDeliveryTimeDetail.getVisibility() == View.VISIBLE)
            imgView_scheduleDeliveryTime.setImageResource(R.drawable.arrow_up);
        else
            imgView_scheduleDeliveryTime.setImageResource(R.drawable.arrow_down);
    }

    private void expandSelectLocation() {
        int v = (ll_selectLocationDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_selectLocationDetail, new AutoTransition());
        ll_selectLocationDetail.setVisibility(v);

        if (ll_selectLocationDetail.getVisibility() == View.VISIBLE)
            imgView_selectLocation.setImageResource(R.drawable.arrow_up);
        else
            imgView_selectLocation.setImageResource(R.drawable.arrow_down);
    }

    private void expandStarbucksDeliveryOrder() {
        int v = (ll_starbucksDeliveryOrderDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_starbucksDeliveryOrderDetail, new AutoTransition());
        ll_starbucksDeliveryOrderDetail.setVisibility(v);

        if (ll_starbucksDeliveryOrderDetail.getVisibility() == View.VISIBLE)
            imgView_starbucksDeliveryOrder.setImageResource(R.drawable.arrow_up);
        else
            imgView_starbucksDeliveryOrder.setImageResource(R.drawable.arrow_down);
    }
}