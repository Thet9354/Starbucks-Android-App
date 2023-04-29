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

public class StarbucksOnlineStore extends Fragment {

    private LinearLayout ll_earnRewardOnline, ll_earnStarsAsGuest, ll_redeemRewardOnline, ll_forgotApplyReward,
            ll_freeDrinksWhenBuyTumbler, ll_checkOrderStatus, ll_haveNotGottenStars, ll_memberToShopOnline,
            ll_paymentModesOnline, ll_multiplePaymentModes, ll_minMaxOrder, ll_deliveryOptionsCharges,
            ll_orderDeliveryDuration;

    private LinearLayout ll_earnRewardOnlineDetail, ll_earnStarsAsGuestDetail, ll_redeemRewardOnlineDetail,
            ll_forgotApplyRewardDetail, ll_freeDrinksWhenBuyTumblerDetails, ll_checkOrderStatusDetail,
            ll_haveNotGottenStarsDetail, ll_memberToShopOnlineDetail, ll_paymentModesOnlineDetail,
            ll_multiplePaymentModesDetail, ll_minMaxOrderDetail, ll_deliveryOptionsChargesDetail,
            ll_orderDeliveryDurationDetail;

    private ImageView imgView_earnRewardOnline, imgView_earnStarsAsGuest, imgView_redeemRewardOnline,
            imgView_forgotApplyReward, imgView_freeDrinksWhenBuyTumbler, imgView_checkOrderStatus,
            imgView_haveNotGottenStars, imgView_memberToShopOnline, imgView_paymentModesOnline,
            imgView_multiplePaymentModes, imgView_minMaxOrder, imgView_deliveryOptionsCharges,
            imgView_orderDeliveryDuration;

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_starbucks_online_store, container, false);

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

        //LinearLayout1
        ll_earnRewardOnline = v.findViewById(R.id.ll_earnRewardOnline);
        ll_earnStarsAsGuest = v.findViewById(R.id.ll_earnStarsAsGuest);
        ll_redeemRewardOnline = v.findViewById(R.id.ll_redeemRewardOnline);
        ll_forgotApplyReward = v.findViewById(R.id.ll_forgotApplyReward);
        ll_freeDrinksWhenBuyTumbler = v.findViewById(R.id.ll_freeDrinksWhenBuyTumbler);
        ll_checkOrderStatus = v.findViewById(R.id.ll_checkOrderStatus);
        ll_haveNotGottenStars = v.findViewById(R.id.ll_haveNotGottenStars);
        ll_memberToShopOnline = v.findViewById(R.id.ll_memberToShopOnline);
        ll_paymentModesOnline = v.findViewById(R.id.ll_paymentModesOnline);
        ll_multiplePaymentModes = v.findViewById(R.id.ll_multiplePaymentModes);
        ll_minMaxOrder = v.findViewById(R.id.ll_minMaxOrder);
        ll_deliveryOptionsCharges = v.findViewById(R.id.ll_deliveryOptionsCharges);
        ll_orderDeliveryDuration = v.findViewById(R.id.ll_orderDeliveryDuration);

        //LinearLayout2
        ll_earnRewardOnlineDetail = v.findViewById(R.id.ll_earnRewardOnlineDetail);
        ll_earnStarsAsGuestDetail = v.findViewById(R.id.ll_earnStarsAsGuestDetail);
        ll_redeemRewardOnlineDetail = v.findViewById(R.id.ll_redeemRewardOnlineDetail);
        ll_forgotApplyRewardDetail = v.findViewById(R.id.ll_forgotApplyRewardDetail);
        ll_freeDrinksWhenBuyTumblerDetails = v.findViewById(R.id.ll_freeDrinksWhenBuyTumblerDetails);
        ll_checkOrderStatusDetail = v.findViewById(R.id.ll_checkOrderStatusDetail);
        ll_haveNotGottenStarsDetail = v.findViewById(R.id.ll_haveNotGottenStarsDetail);
        ll_memberToShopOnlineDetail = v.findViewById(R.id.ll_memberToShopOnlineDetail);
        ll_paymentModesOnlineDetail = v.findViewById(R.id.ll_paymentModesOnlineDetail);
        ll_multiplePaymentModesDetail = v.findViewById(R.id.ll_multiplePaymentModesDetail);
        ll_minMaxOrderDetail = v.findViewById(R.id.ll_minMaxOrderDetail);
        ll_deliveryOptionsChargesDetail = v.findViewById(R.id.ll_deliveryOptionsChargesDetail);
        ll_orderDeliveryDurationDetail = v.findViewById(R.id.ll_orderDeliveryDurationDetail);

        //ImageView
        imgView_earnRewardOnline = v.findViewById(R.id.imgView_earnRewardOnline);
        imgView_earnStarsAsGuest = v.findViewById(R.id.imgView_earnStarsAsGuest);
        imgView_redeemRewardOnline = v.findViewById(R.id.imgView_redeemRewardOnline);
        imgView_forgotApplyReward = v.findViewById(R.id.imgView_forgotApplyReward);
        imgView_freeDrinksWhenBuyTumbler = v.findViewById(R.id.imgView_freeDrinksWhenBuyTumbler);
        imgView_checkOrderStatus = v.findViewById(R.id.imgView_checkOrderStatus);
        imgView_haveNotGottenStars = v.findViewById(R.id.imgView_haveNotGottenStars);
        imgView_memberToShopOnline = v.findViewById(R.id.imgView_memberToShopOnline);
        imgView_paymentModesOnline = v.findViewById(R.id.imgView_paymentModesOnline);
        imgView_multiplePaymentModes = v.findViewById(R.id.imgView_multiplePaymentModes);
        imgView_minMaxOrder = v.findViewById(R.id.imgView_minMaxOrder);
        imgView_deliveryOptionsCharges = v.findViewById(R.id.imgView_deliveryOptionsCharges);
        imgView_orderDeliveryDuration = v.findViewById(R.id.imgView_orderDeliveryDuration);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_orderDeliveryDuration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandOrderDeliveryDuration();
            }
        });

        ll_deliveryOptionsCharges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDeliveryOptionsCharges();
            }
        });

        ll_minMaxOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMinMaxOrder();
            }
        });

        ll_multiplePaymentModes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMultiplePaymentModes();
            }
        });

        ll_paymentModesOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandPaymentModesOnline();
            }
        });

        ll_memberToShopOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMemberToShopOnline();
            }
        });

        ll_haveNotGottenStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandHaveNotGottenShare();
            }
        });

        ll_checkOrderStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCheckOrderStatus();
            }
        });

        ll_freeDrinksWhenBuyTumbler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandFreeDrinksWhenBuyTumbler();
            }
        });

        ll_forgotApplyReward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandForgotApplyReward();
            }
        });

        ll_redeemRewardOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRedeemRewardOnline();
            }
        });

        ll_earnStarsAsGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandEarnStarsAsGuest();
            }
        });

        ll_earnRewardOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandEarnRewardOnline();
            }
        });
    }

    private void expandEarnRewardOnline() {
        int v = (ll_earnRewardOnlineDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_earnRewardOnlineDetail, new AutoTransition());
        ll_earnRewardOnlineDetail.setVisibility(v);

        if (ll_earnRewardOnlineDetail.getVisibility() == View.VISIBLE)
            imgView_earnRewardOnline.setImageResource(R.drawable.arrow_up);
        else
            imgView_earnRewardOnline.setImageResource(R.drawable.arrow_down);
    }

    private void expandOrderDeliveryDuration() {
        int v = (ll_orderDeliveryDurationDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_orderDeliveryDurationDetail, new AutoTransition());
        ll_orderDeliveryDurationDetail.setVisibility(v);

        if (ll_orderDeliveryDurationDetail.getVisibility() == View.VISIBLE)
            imgView_orderDeliveryDuration.setImageResource(R.drawable.arrow_up);
        else
            imgView_orderDeliveryDuration.setImageResource(R.drawable.arrow_down);
    }

    private void expandDeliveryOptionsCharges() {
        int v = (ll_deliveryOptionsChargesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_deliveryOptionsChargesDetail, new AutoTransition());
        ll_deliveryOptionsChargesDetail.setVisibility(v);

        if (ll_deliveryOptionsChargesDetail.getVisibility() == View.VISIBLE)
            imgView_minMaxOrder.setImageResource(R.drawable.arrow_up);
        else
            imgView_minMaxOrder.setImageResource(R.drawable.arrow_down);
    }

    private void expandMinMaxOrder() {
        int v = (ll_minMaxOrderDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_minMaxOrderDetail, new AutoTransition());
        ll_minMaxOrderDetail.setVisibility(v);

        if (ll_minMaxOrderDetail.getVisibility() == View.VISIBLE)
            imgView_minMaxOrder.setImageResource(R.drawable.arrow_up);
        else
            imgView_minMaxOrder.setImageResource(R.drawable.arrow_down);
    }

    private void expandMultiplePaymentModes() {
        int v = (ll_multiplePaymentModesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_multiplePaymentModesDetail, new AutoTransition());
        ll_multiplePaymentModesDetail.setVisibility(v);

        if (ll_multiplePaymentModesDetail.getVisibility() == View.VISIBLE)
            imgView_multiplePaymentModes.setImageResource(R.drawable.arrow_up);
        else
            imgView_multiplePaymentModes.setImageResource(R.drawable.arrow_down);
    }

    private void expandPaymentModesOnline() {
        int v = (ll_paymentModesOnlineDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_paymentModesOnlineDetail, new AutoTransition());
        ll_paymentModesOnlineDetail.setVisibility(v);

        if (ll_paymentModesOnlineDetail.getVisibility() == View.VISIBLE)
            imgView_paymentModesOnline.setImageResource(R.drawable.arrow_up);
        else
            imgView_paymentModesOnline.setImageResource(R.drawable.arrow_down);
    }

    private void expandMemberToShopOnline() {
        int v = (ll_memberToShopOnlineDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_memberToShopOnlineDetail, new AutoTransition());
        ll_memberToShopOnlineDetail.setVisibility(v);

        if (ll_memberToShopOnlineDetail.getVisibility() == View.VISIBLE)
            imgView_memberToShopOnline.setImageResource(R.drawable.arrow_up);
        else
            imgView_memberToShopOnline.setImageResource(R.drawable.arrow_down);
    }

    private void expandHaveNotGottenShare() {
        int v = (ll_haveNotGottenStarsDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_haveNotGottenStarsDetail, new AutoTransition());
        ll_haveNotGottenStarsDetail.setVisibility(v);

        if (ll_haveNotGottenStarsDetail.getVisibility() == View.VISIBLE)
            imgView_haveNotGottenStars.setImageResource(R.drawable.arrow_up);
        else
            imgView_haveNotGottenStars.setImageResource(R.drawable.arrow_down);
    }

    private void expandCheckOrderStatus() {
        int v = (ll_checkOrderStatusDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_checkOrderStatusDetail, new AutoTransition());
        ll_checkOrderStatusDetail.setVisibility(v);

        if (ll_checkOrderStatusDetail.getVisibility() == View.VISIBLE)
            imgView_checkOrderStatus.setImageResource(R.drawable.arrow_up);
        else
            imgView_checkOrderStatus.setImageResource(R.drawable.arrow_down);
    }

    private void expandFreeDrinksWhenBuyTumbler() {
        int v = (ll_freeDrinksWhenBuyTumblerDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_freeDrinksWhenBuyTumblerDetails, new AutoTransition());
        ll_freeDrinksWhenBuyTumblerDetails.setVisibility(v);

        if (ll_freeDrinksWhenBuyTumblerDetails.getVisibility() == View.VISIBLE)
            imgView_freeDrinksWhenBuyTumbler.setImageResource(R.drawable.arrow_up);
        else
            imgView_freeDrinksWhenBuyTumbler.setImageResource(R.drawable.arrow_down);
    }

    private void expandForgotApplyReward() {
        int v = (ll_forgotApplyRewardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_forgotApplyRewardDetail, new AutoTransition());
        ll_forgotApplyRewardDetail.setVisibility(v);

        if (ll_forgotApplyRewardDetail.getVisibility() == View.VISIBLE)
            imgView_forgotApplyReward.setImageResource(R.drawable.arrow_up);
        else
            imgView_forgotApplyReward.setImageResource(R.drawable.arrow_down);
    }

    private void expandRedeemRewardOnline() {
        int v = (ll_redeemRewardOnlineDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_redeemRewardOnlineDetail, new AutoTransition());
        ll_redeemRewardOnlineDetail.setVisibility(v);

        if (ll_redeemRewardOnlineDetail.getVisibility() == View.VISIBLE)
            imgView_redeemRewardOnline.setImageResource(R.drawable.arrow_up);
        else
            imgView_redeemRewardOnline.setImageResource(R.drawable.arrow_down);
    }

    private void expandEarnStarsAsGuest() {
        int v = (ll_earnStarsAsGuestDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_earnStarsAsGuestDetail, new AutoTransition());
        ll_earnStarsAsGuestDetail.setVisibility(v);

        if (ll_earnStarsAsGuestDetail.getVisibility() == View.VISIBLE)
            imgView_earnStarsAsGuest.setImageResource(R.drawable.arrow_up);
        else
            imgView_earnStarsAsGuest.setImageResource(R.drawable.arrow_down);
    }


}