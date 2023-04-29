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

public class MobileOrderPay extends Fragment {

    private LinearLayout ll_whatIsMOP, ll_whereMOP, ll_updateStarbucksApp, ll_registerIfNotMember, ll_whatICanPurchase,
            ll_howToPlaceOrder, ll_howToPickUpOrder, ll_chooseWhichStore, ll_beforeStoreOpens, ll_maxNumberOfItems,
            ll_howLongWillOrderTake, ll_schedulePickUpTime, ll_scheduleAdvance;

    private LinearLayout ll_whatIsMOPDetail, ll_whereMOPDetail, ll_updateStarbucksAppDetail, ll_registerIfNotMemberDetail,
            ll_whatICanPurchaseDetails, ll_howToPlaceOrderDetail, ll_howToPickUpOrderDetail, ll_chooseWhichStoreDetail,
            ll_beforeStoreOpensDetail, ll_maxNumberOfItemsDetail, ll_howLongWillOrderTakeDetail, ll_schedulePickUpTimeDetail,
            ll_scheduleAdvanceDetail;

    private ImageView imgView_whatIsMOP, imgView_whereMOP, imgView_updateStarbucksApp, imgView_registerIfNotMember,
            imgView_whatICanPurchase, imgView_howToPlaceOrder, imgView_howToPickUpOrder, imgView_chooseWhichStore,
            imgView_beforeStoreOpens, imgView_maxNumberOfItems, imgView_howLongWillOrderTake, imgView_schedulePickUpTime,
            imgView_scheduleAdvance;

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_mobile_order_pay, container, false);

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
        ll_whatIsMOP = v.findViewById(R.id.ll_whatIsMOP);
        ll_whereMOP = v.findViewById(R.id.ll_whereMOP);
        ll_updateStarbucksApp = v.findViewById(R.id.ll_updateStarbucksApp);
        ll_registerIfNotMember = v.findViewById(R.id.ll_registerIfNotMember);
        ll_whatICanPurchase = v.findViewById(R.id.ll_whatICanPurchase);
        ll_howToPlaceOrder = v.findViewById(R.id.ll_howToPlaceOrder);
        ll_howToPickUpOrder = v.findViewById(R.id.ll_howToPickUpOrder);
        ll_chooseWhichStore = v.findViewById(R.id.ll_chooseWhichStore);
        ll_beforeStoreOpens = v.findViewById(R.id.ll_beforeStoreOpens);
        ll_maxNumberOfItems = v.findViewById(R.id.ll_maxNumberOfItems);
        ll_howLongWillOrderTake = v.findViewById(R.id.ll_howLongWillOrderTake);
        ll_schedulePickUpTime = v.findViewById(R.id.ll_schedulePickUpTime);
        ll_scheduleAdvance = v.findViewById(R.id.ll_scheduleAdvance);

        //LinearLayout2
        ll_whatIsMOPDetail = v.findViewById(R.id.ll_whatIsMOPDetail);
        ll_whereMOPDetail = v.findViewById(R.id.ll_whereMOPDetail);
        ll_updateStarbucksAppDetail = v.findViewById(R.id.ll_updateStarbucksAppDetail);
        ll_registerIfNotMemberDetail = v.findViewById(R.id.ll_registerIfNotMemberDetail);
        ll_whatICanPurchaseDetails = v.findViewById(R.id.ll_whatICanPurchaseDetails);
        ll_howToPlaceOrderDetail = v.findViewById(R.id.ll_howToPlaceOrderDetail);
        ll_howToPickUpOrderDetail = v.findViewById(R.id.ll_howToPickUpOrderDetail);
        ll_chooseWhichStoreDetail = v.findViewById(R.id.ll_chooseWhichStoreDetail);
        ll_beforeStoreOpensDetail = v.findViewById(R.id.ll_beforeStoreOpensDetail);
        ll_maxNumberOfItemsDetail = v.findViewById(R.id.ll_maxNumberOfItemsDetail);
        ll_howLongWillOrderTakeDetail = v.findViewById(R.id.ll_howLongWillOrderTakeDetail);
        ll_schedulePickUpTimeDetail = v.findViewById(R.id.ll_schedulePickUpTimeDetail);
        ll_scheduleAdvanceDetail = v.findViewById(R.id.ll_scheduleAdvanceDetail);

        //ImageView
        imgView_whatIsMOP = v.findViewById(R.id.imgView_whatIsMOP);
        imgView_whereMOP = v.findViewById(R.id.imgView_whereMOP);
        imgView_updateStarbucksApp = v.findViewById(R.id.imgView_updateStarbucksApp);
        imgView_registerIfNotMember = v.findViewById(R.id.imgView_registerIfNotMember);
        imgView_whatICanPurchase = v.findViewById(R.id.imgView_whatICanPurchase);
        imgView_howToPlaceOrder = v.findViewById(R.id.imgView_howToPlaceOrder);
        imgView_howToPickUpOrder = v.findViewById(R.id.imgView_howToPickUpOrder);
        imgView_chooseWhichStore = v.findViewById(R.id.imgView_chooseWhichStore);
        imgView_beforeStoreOpens = v.findViewById(R.id.imgView_beforeStoreOpens);
        imgView_maxNumberOfItems = v.findViewById(R.id.imgView_maxNumberOfItems);
        imgView_howLongWillOrderTake = v.findViewById(R.id.imgView_howLongWillOrderTake);
        imgView_schedulePickUpTime = v.findViewById(R.id.imgView_schedulePickUpTime);
        imgView_scheduleAdvance = v.findViewById(R.id.imgView_scheduleAdvance);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_scheduleAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandScheduleAdvance();
            }
        });

        ll_schedulePickUpTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandSchedulePickUpTime();
            }
        });

        ll_howLongWillOrderTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandHowLongWillOrderTake();
            }
        });

        ll_maxNumberOfItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMaxNumberOfItems();
            }
        });

        ll_beforeStoreOpens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandBeforeStoreOpens();
            }
        });

        ll_chooseWhichStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhichStore();
            }
        });

        ll_howToPickUpOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandHowToPickUpOrder();
            }
        });

        ll_howToPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandHowToPlaceOrder();
            }
        });

        ll_whatICanPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhatICanPurchase();
            }
        });

        ll_registerIfNotMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRegisterIfNotMember();
            }
        });

        ll_updateStarbucksApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandUpdateStarbucksApp();
            }
        });

        ll_whereMOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhereMOP();
            }
        });

        ll_whatIsMOP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhatIsMOP();
            }
        });
    }

    private void expandScheduleAdvance() {
        int v = (ll_scheduleAdvanceDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_scheduleAdvanceDetail, new AutoTransition());
        ll_scheduleAdvanceDetail.setVisibility(v);

        if (ll_scheduleAdvanceDetail.getVisibility() == View.VISIBLE)
            imgView_scheduleAdvance.setImageResource(R.drawable.arrow_up);
        else
            imgView_scheduleAdvance.setImageResource(R.drawable.arrow_down);
    }

    private void expandSchedulePickUpTime() {
        int v = (ll_schedulePickUpTimeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_schedulePickUpTimeDetail, new AutoTransition());
        ll_schedulePickUpTimeDetail.setVisibility(v);

        if (ll_schedulePickUpTimeDetail.getVisibility() == View.VISIBLE)
            imgView_schedulePickUpTime.setImageResource(R.drawable.arrow_up);
        else
            imgView_schedulePickUpTime.setImageResource(R.drawable.arrow_down);
    }

    private void expandHowLongWillOrderTake() {
        int v = (ll_howLongWillOrderTakeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_howLongWillOrderTakeDetail, new AutoTransition());
        ll_howLongWillOrderTakeDetail.setVisibility(v);

        if (ll_howLongWillOrderTakeDetail.getVisibility() == View.VISIBLE)
            imgView_howLongWillOrderTake.setImageResource(R.drawable.arrow_up);
        else
            imgView_howLongWillOrderTake.setImageResource(R.drawable.arrow_down);
    }

    private void expandMaxNumberOfItems() {
        int v = (ll_maxNumberOfItemsDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_maxNumberOfItemsDetail, new AutoTransition());
        ll_maxNumberOfItemsDetail.setVisibility(v);

        if (ll_maxNumberOfItemsDetail.getVisibility() == View.VISIBLE)
            imgView_maxNumberOfItems.setImageResource(R.drawable.arrow_up);
        else
            imgView_maxNumberOfItems.setImageResource(R.drawable.arrow_down);
    }

    private void expandBeforeStoreOpens() {
        int v = (ll_beforeStoreOpensDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_beforeStoreOpensDetail, new AutoTransition());
        ll_beforeStoreOpensDetail.setVisibility(v);

        if (ll_beforeStoreOpensDetail.getVisibility() == View.VISIBLE)
            imgView_beforeStoreOpens.setImageResource(R.drawable.arrow_up);
        else
            imgView_beforeStoreOpens.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhichStore() {
        int v = (ll_chooseWhichStoreDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_chooseWhichStoreDetail, new AutoTransition());
        ll_chooseWhichStoreDetail.setVisibility(v);

        if (ll_chooseWhichStoreDetail.getVisibility() == View.VISIBLE)
            imgView_chooseWhichStore.setImageResource(R.drawable.arrow_up);
        else
            imgView_chooseWhichStore.setImageResource(R.drawable.arrow_down);
    }

    private void expandHowToPickUpOrder() {
        int v = (ll_howToPickUpOrderDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_howToPickUpOrderDetail, new AutoTransition());
        ll_howToPickUpOrderDetail.setVisibility(v);

        if (ll_howToPickUpOrderDetail.getVisibility() == View.VISIBLE)
            imgView_howToPickUpOrder.setImageResource(R.drawable.arrow_up);
        else
            imgView_howToPickUpOrder.setImageResource(R.drawable.arrow_down);
    }

    private void expandHowToPlaceOrder() {
        int v = (ll_howToPlaceOrderDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_howToPlaceOrderDetail, new AutoTransition());
        ll_howToPlaceOrderDetail.setVisibility(v);

        if (ll_howToPlaceOrderDetail.getVisibility() == View.VISIBLE)
            imgView_howToPlaceOrder.setImageResource(R.drawable.arrow_up);
        else
            imgView_howToPlaceOrder.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhatICanPurchase() {
        int v = (ll_whatICanPurchaseDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whatICanPurchaseDetails, new AutoTransition());
        ll_whatICanPurchaseDetails.setVisibility(v);

        if (ll_whatICanPurchaseDetails.getVisibility() == View.VISIBLE)
            imgView_whatICanPurchase.setImageResource(R.drawable.arrow_up);
        else
            imgView_whatICanPurchase.setImageResource(R.drawable.arrow_down);
    }

    private void expandRegisterIfNotMember() {
        int v = (ll_registerIfNotMemberDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_registerIfNotMemberDetail, new AutoTransition());
        ll_registerIfNotMemberDetail.setVisibility(v);

        if (ll_registerIfNotMemberDetail.getVisibility() == View.VISIBLE)
            imgView_registerIfNotMember.setImageResource(R.drawable.arrow_up);
        else
            imgView_registerIfNotMember.setImageResource(R.drawable.arrow_down);
    }

    private void expandUpdateStarbucksApp() {
        int v = (ll_updateStarbucksAppDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_updateStarbucksAppDetail, new AutoTransition());
        ll_updateStarbucksAppDetail.setVisibility(v);

        if (ll_updateStarbucksAppDetail.getVisibility() == View.VISIBLE)
            imgView_updateStarbucksApp.setImageResource(R.drawable.arrow_up);
        else
            imgView_updateStarbucksApp.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhereMOP() {
        int v = (ll_whereMOPDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whereMOPDetail, new AutoTransition());
        ll_whereMOPDetail.setVisibility(v);

        if (ll_whereMOPDetail.getVisibility() == View.VISIBLE)
            imgView_whereMOP.setImageResource(R.drawable.arrow_up);
        else
            imgView_whereMOP.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhatIsMOP() {
        int v = (ll_whatIsMOP.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whatIsMOP, new AutoTransition());
        ll_whatIsMOP.setVisibility(v);

        if (ll_whatIsMOP.getVisibility() == View.VISIBLE)
            imgView_whatIsMOP.setImageResource(R.drawable.arrow_up);
        else
            imgView_whatIsMOP.setImageResource(R.drawable.arrow_down);
    }
}