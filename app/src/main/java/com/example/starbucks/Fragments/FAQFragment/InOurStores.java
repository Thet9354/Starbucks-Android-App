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


public class InOurStores extends Fragment {

    private LinearLayout ll_drinkSizes, ll_serviceFeedback, ll_starbucksWifi, ll_wifiIssues,
            ll_storesNearMe, ll_storeOperatingHours, ll_customerDiscount, ll_coffeeRefillPolicy,
            ll_milkOptionCharges, ll_foodOptionCalories, ll_wholeCake, ll_deliveries, ll_furnitureDesignElement;

    private LinearLayout ll_drinkSizesDetail, ll_serviceFeedbackDetail, ll_starbucksWifiDetail,
            ll_wifiIssuesDetail, ll_storesNearMeDetails, ll_storeOperatingHoursDetail, ll_customerDiscountDetail,
            ll_coffeeRefillPolicyDetail, ll_milkOptionChargesDetail, ll_foodOptionCaloriesDetail,
            ll_wholeCakeDetail, ll_deliveriesDetail, ll_furnitureDesignElementDetail;

    private ImageView imgView_drinkSizes, imgView_serviceFeedback, imgView_starbucksWifi, imgView_wifiIssues,
            imgView_storesNearMe, imgView_storeOperatingHours, imgView_customerDiscount, imgView_coffeeRefillPolicy,
            imgView_milkOptionCharges, imgView_foodOptionCalories, imgView_wholeCake, imgView_deliveries, imgView_furnitureDesignElement;

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_in_our_stores, container, false);

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

        //LinearLayout2
        ll_drinkSizesDetail = v.findViewById(R.id.ll_drinkSizesDetail);
        ll_serviceFeedbackDetail = v.findViewById(R.id.ll_serviceFeedbackDetail);
        ll_starbucksWifiDetail = v.findViewById(R.id.ll_starbucksWifiDetail);
        ll_wifiIssuesDetail = v.findViewById(R.id.ll_wifiIssuesDetail);
        ll_storesNearMeDetails = v.findViewById(R.id.ll_storesNearMeDetails);
        ll_storeOperatingHoursDetail = v.findViewById(R.id.ll_storeOperatingHoursDetail);
        ll_customerDiscountDetail = v.findViewById(R.id.ll_customerDiscountDetail);
        ll_coffeeRefillPolicyDetail = v.findViewById(R.id.ll_coffeeRefillPolicyDetail);
        ll_milkOptionChargesDetail = v.findViewById(R.id.ll_milkOptionChargesDetail);
        ll_foodOptionCaloriesDetail = v.findViewById(R.id.ll_foodOptionCaloriesDetail);
        ll_wholeCakeDetail = v.findViewById(R.id.ll_wholeCakeDetail);
        ll_deliveriesDetail = v.findViewById(R.id.ll_deliveriesDetail);
        ll_furnitureDesignElementDetail = v.findViewById(R.id.ll_furnitureDesignElementDetail);

        //ImageView
        imgView_drinkSizes = v.findViewById(R.id.imgView_drinkSizes);
        imgView_serviceFeedback = v.findViewById(R.id.imgView_serviceFeedback);
        imgView_starbucksWifi = v.findViewById(R.id.imgView_starbucksWifi);
        imgView_wifiIssues = v.findViewById(R.id.imgView_wifiIssues);
        imgView_storesNearMe = v.findViewById(R.id.imgView_storesNearMe);
        imgView_storeOperatingHours = v.findViewById(R.id.imgView_storeOperatingHours);
        imgView_customerDiscount = v.findViewById(R.id.imgView_customerDiscount);
        imgView_coffeeRefillPolicy = v.findViewById(R.id.imgView_coffeeRefillPolicy);
        imgView_milkOptionCharges = v.findViewById(R.id.imgView_milkOptionCharges);
        imgView_foodOptionCalories = v.findViewById(R.id.imgView_foodOptionCalories);
        imgView_wholeCake = v.findViewById(R.id.imgView_wholeCake);
        imgView_deliveries = v.findViewById(R.id.imgView_deliveries);
        imgView_furnitureDesignElement = v.findViewById(R.id.imgView_furnitureDesignElement);

        //LinearLayout
        ll_drinkSizes = v.findViewById(R.id.ll_drinkSizes);
        ll_serviceFeedback = v.findViewById(R.id.ll_serviceFeedback);
        ll_starbucksWifi = v.findViewById(R.id.ll_starbucksWifi);
        ll_wifiIssues = v.findViewById(R.id.ll_wifiIssues);
        ll_storesNearMe = v.findViewById(R.id.ll_storesNearMe);
        ll_storeOperatingHours = v.findViewById(R.id.ll_storeOperatingHours);
        ll_customerDiscount = v.findViewById(R.id.ll_customerDiscount);
        ll_coffeeRefillPolicy = v.findViewById(R.id.ll_coffeeRefillPolicy);
        ll_milkOptionCharges = v.findViewById(R.id.ll_milkOptionCharges);
        ll_foodOptionCalories = v.findViewById(R.id.ll_foodOptionCalories);
        ll_wholeCake = v.findViewById(R.id.ll_wholeCake);
        ll_deliveries = v.findViewById(R.id.ll_deliveries);
        ll_furnitureDesignElement = v.findViewById(R.id.ll_furnitureDesignElement);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_furnitureDesignElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandFurnitureDesignElement();
            }
        });

        ll_deliveries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDeliveries();
            }
        });

        ll_wholeCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWholeCake();
            }
        });

        ll_foodOptionCalories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandFoodOptionCalories();
            }
        });

        ll_milkOptionCharges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMilkOptionCharges();
            }
        });

        ll_coffeeRefillPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCoffeeRefillPolicy();
            }
        });

        ll_customerDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCustomerDiscount();
            }
        });

        ll_storeOperatingHours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStoreOperatingHours();
            }
        });

        ll_storesNearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStoreNearMe();
            }
        });

        ll_wifiIssues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWifiIssue();
            }
        });

        ll_starbucksWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStarbucksWifi();
            }
        });

        ll_serviceFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandServiceFeedback();
            }
        });

        ll_drinkSizes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDrinkSizes();
            }
        });
    }

    private void expandFurnitureDesignElement() {
        int v = (ll_furnitureDesignElementDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_furnitureDesignElementDetail, new AutoTransition());
        ll_furnitureDesignElementDetail.setVisibility(v);

        if (ll_furnitureDesignElementDetail.getVisibility() == View.VISIBLE)
            imgView_furnitureDesignElement.setImageResource(R.drawable.arrow_up);
        else
            imgView_furnitureDesignElement.setImageResource(R.drawable.arrow_down);
    }

    private void expandDeliveries() {
        int v = (ll_deliveriesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_deliveriesDetail, new AutoTransition());
        ll_deliveriesDetail.setVisibility(v);

        if (ll_deliveriesDetail.getVisibility() == View.VISIBLE)
            imgView_deliveries.setImageResource(R.drawable.arrow_up);
        else
            imgView_deliveries.setImageResource(R.drawable.arrow_down);
    }

    private void expandWholeCake() {
        int v = (ll_wholeCakeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_wholeCakeDetail, new AutoTransition());
        ll_wholeCakeDetail.setVisibility(v);

        if (ll_wholeCakeDetail.getVisibility() == View.VISIBLE)
            imgView_wholeCake.setImageResource(R.drawable.arrow_up);
        else
            imgView_wholeCake.setImageResource(R.drawable.arrow_down);
    }

    private void expandFoodOptionCalories() {
        int v = (ll_foodOptionCaloriesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_foodOptionCaloriesDetail, new AutoTransition());
        ll_foodOptionCaloriesDetail.setVisibility(v);

        if (ll_foodOptionCaloriesDetail.getVisibility() == View.VISIBLE)
            imgView_foodOptionCalories.setImageResource(R.drawable.arrow_up);
        else
            imgView_foodOptionCalories.setImageResource(R.drawable.arrow_down);
    }

    private void expandMilkOptionCharges() {
        int v = (ll_milkOptionChargesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_milkOptionChargesDetail, new AutoTransition());
        ll_milkOptionChargesDetail.setVisibility(v);

        if (ll_milkOptionChargesDetail.getVisibility() == View.VISIBLE)
            imgView_milkOptionCharges.setImageResource(R.drawable.arrow_up);
        else
            imgView_milkOptionCharges.setImageResource(R.drawable.arrow_down);
    }

    private void expandCoffeeRefillPolicy() {
        int v = (ll_coffeeRefillPolicyDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_coffeeRefillPolicyDetail, new AutoTransition());
        ll_coffeeRefillPolicyDetail.setVisibility(v);

        if (ll_coffeeRefillPolicyDetail.getVisibility() == View.VISIBLE)
            imgView_coffeeRefillPolicy.setImageResource(R.drawable.arrow_up);
        else
            imgView_coffeeRefillPolicy.setImageResource(R.drawable.arrow_down);
    }

    private void expandCustomerDiscount() {
        int v = (ll_customerDiscountDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_customerDiscountDetail, new AutoTransition());
        ll_customerDiscountDetail.setVisibility(v);

        if (ll_customerDiscountDetail.getVisibility() == View.VISIBLE)
            imgView_customerDiscount.setImageResource(R.drawable.arrow_up);
        else
            imgView_customerDiscount.setImageResource(R.drawable.arrow_down);
    }

    private void expandStoreOperatingHours() {
        int v = (ll_storeOperatingHoursDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_storeOperatingHoursDetail, new AutoTransition());
        ll_storeOperatingHoursDetail.setVisibility(v);

        if (ll_storeOperatingHoursDetail.getVisibility() == View.VISIBLE)
            imgView_storeOperatingHours.setImageResource(R.drawable.arrow_up);
        else
            imgView_storeOperatingHours.setImageResource(R.drawable.arrow_down);
    }

    private void expandStoreNearMe() {
        int v = (ll_storesNearMeDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_storesNearMeDetails, new AutoTransition());
        ll_storesNearMeDetails.setVisibility(v);

        if (ll_storesNearMeDetails.getVisibility() == View.VISIBLE)
            imgView_storesNearMe.setImageResource(R.drawable.arrow_up);
        else
            imgView_storesNearMe.setImageResource(R.drawable.arrow_down);
    }

    private void expandWifiIssue() {
        int v = (ll_wifiIssuesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_wifiIssuesDetail, new AutoTransition());
        ll_wifiIssuesDetail.setVisibility(v);

        if (ll_wifiIssuesDetail.getVisibility() == View.VISIBLE)
            imgView_wifiIssues.setImageResource(R.drawable.arrow_up);
        else
            imgView_wifiIssues.setImageResource(R.drawable.arrow_down);
    }

    private void expandStarbucksWifi() {
        int v = (ll_starbucksWifiDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_starbucksWifiDetail, new AutoTransition());
        ll_starbucksWifiDetail.setVisibility(v);

        if (ll_starbucksWifiDetail.getVisibility() == View.VISIBLE)
            imgView_starbucksWifi.setImageResource(R.drawable.arrow_up);
        else
            imgView_starbucksWifi.setImageResource(R.drawable.arrow_down);
    }

    private void expandServiceFeedback() {
        int v = (ll_serviceFeedbackDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_serviceFeedbackDetail, new AutoTransition());
        ll_serviceFeedbackDetail.setVisibility(v);

        if (ll_serviceFeedbackDetail.getVisibility() == View.VISIBLE)
            imgView_serviceFeedback.setImageResource(R.drawable.arrow_up);
        else
            imgView_serviceFeedback.setImageResource(R.drawable.arrow_down);
    }

    private void expandDrinkSizes() {
        int v = (ll_drinkSizesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_drinkSizesDetail, new AutoTransition());
        ll_drinkSizesDetail.setVisibility(v);

        if (ll_drinkSizesDetail.getVisibility() == View.VISIBLE)
            imgView_drinkSizes.setImageResource(R.drawable.arrow_up);
        else
            imgView_drinkSizes.setImageResource(R.drawable.arrow_down);
    }
}