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

public class Others extends Fragment {

    private LinearLayout ll_bagCharge, ll_whyChargeBag, ll_bagChargeInStore, ll_bagAlternatives, ll_bagChargesQuestions,
            ll_exchangeReturnPolicy, ll_halalCertified, ll_deliveryWhippedCreamOption, ll_flavourLockBag,
            ll_grindBeansInStore, ll_grindToUse, ll_requestCoffeeGrounds, ll_bestWayToStoreCoffee;

    private LinearLayout ll_bagChargeDetail, ll_whyChargeBagDetail, ll_bagChargeInStoreDetail, ll_bagAlternativesDetail,
            ll_bagChargesQuestionsDetails, ll_exchangeReturnPolicyDetail, ll_halalCertifiedDetail, ll_deliveryWhippedCreamOptionDetail,
            ll_flavourLockBagDetail, ll_grindBeansInStoreDetail, ll_grindToUseDetail, ll_requestCoffeeGroundsDetail, ll_bestWayToStoreCoffeeDetail;

    private ImageView imgView_bagCharge, imgView_whyChargeBag, imgView_bagChargeInStore, imgView_bagAlternatives, imgView_bagChargesQuestions,
            imgView_exchangeReturnPolicy, imgView_halalCertified, imgView_deliveryWhippedCreamOption, imgView_flavourLockBag,
            imgView_grindBeansInStore, imgView_grindToUse, imgView_requestCoffeeGrounds, imgView_bestWayToStoreCoffee;

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_others, container, false);

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
        ll_bagChargeDetail = v.findViewById(R.id.ll_bagChargeDetail);
        ll_whyChargeBagDetail = v.findViewById(R.id.ll_whyChargeBagDetail);
        ll_bagChargeInStoreDetail = v.findViewById(R.id.ll_bagChargeInStoreDetail);
        ll_bagAlternativesDetail = v.findViewById(R.id.ll_bagAlternativesDetail);
        ll_bagChargesQuestionsDetails = v.findViewById(R.id.ll_bagChargesQuestionsDetails);
        ll_exchangeReturnPolicyDetail = v.findViewById(R.id.ll_exchangeReturnPolicyDetail);
        ll_halalCertifiedDetail = v.findViewById(R.id.ll_halalCertifiedDetail);
        ll_deliveryWhippedCreamOptionDetail = v.findViewById(R.id.ll_deliveryWhippedCreamOptionDetail);
        ll_flavourLockBagDetail = v.findViewById(R.id.ll_flavourLockBagDetail);
        ll_grindBeansInStoreDetail = v.findViewById(R.id.ll_grindBeansInStoreDetail);
        ll_grindToUseDetail = v.findViewById(R.id.ll_grindToUseDetail);
        ll_requestCoffeeGroundsDetail = v.findViewById(R.id.ll_requestCoffeeGroundsDetail);
        ll_bestWayToStoreCoffeeDetail = v.findViewById(R.id.ll_bestWayToStoreCoffeeDetail);

        //ImageView
        imgView_bagCharge = v.findViewById(R.id.imgView_bagCharge);
        imgView_whyChargeBag = v.findViewById(R.id.imgView_whyChargeBag);
        imgView_bagChargeInStore = v.findViewById(R.id.imgView_bagChargeInStore);
        imgView_bagAlternatives = v.findViewById(R.id.imgView_bagAlternatives);
        imgView_bagChargesQuestions = v.findViewById(R.id.imgView_bagChargesQuestions);
        imgView_exchangeReturnPolicy = v.findViewById(R.id.imgView_exchangeReturnPolicy);
        imgView_halalCertified = v.findViewById(R.id.imgView_halalCertified);
        imgView_deliveryWhippedCreamOption = v.findViewById(R.id.imgView_deliveryWhippedCreamOption);
        imgView_flavourLockBag = v.findViewById(R.id.imgView_flavourLockBag);
        imgView_grindBeansInStore = v.findViewById(R.id.imgView_grindBeansInStore);
        imgView_grindToUse = v.findViewById(R.id.imgView_grindToUse);
        imgView_requestCoffeeGrounds = v.findViewById(R.id.imgView_requestCoffeeGrounds);
        imgView_bestWayToStoreCoffee = v.findViewById(R.id.imgView_bestWayToStoreCoffee);

        //LinearLayout
        ll_bagCharge = v.findViewById(R.id.ll_bagCharge);
        ll_whyChargeBag = v.findViewById(R.id.ll_whyChargeBag);
        ll_bagChargeInStore = v.findViewById(R.id.ll_bagChargeInStore);
        ll_bagAlternatives = v.findViewById(R.id.ll_bagAlternatives);
        ll_bagChargesQuestions = v.findViewById(R.id.ll_bagChargesQuestions);
        ll_exchangeReturnPolicy = v.findViewById(R.id.ll_exchangeReturnPolicy);
        ll_halalCertified = v.findViewById(R.id.ll_halalCertified);
        ll_deliveryWhippedCreamOption = v.findViewById(R.id.ll_deliveryWhippedCreamOption);
        ll_flavourLockBag = v.findViewById(R.id.ll_flavourLockBag);
        ll_grindBeansInStore = v.findViewById(R.id.ll_grindBeansInStore);
        ll_grindToUse = v.findViewById(R.id.ll_grindToUse);
        ll_requestCoffeeGrounds = v.findViewById(R.id.ll_requestCoffeeGrounds);
        ll_bestWayToStoreCoffee = v.findViewById(R.id.ll_bestWayToStoreCoffee);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_bestWayToStoreCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandBestWayToStoreCoffee();
            }
        });

        ll_requestCoffeeGrounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRequestCoffeeGrounds();
            }
        });

        ll_grindToUse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandGrindToUse();
            }
        });

        ll_grindBeansInStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandGrindBeansInStore();
            }
        });

        ll_flavourLockBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandFlavourLockBag();
            }
        });

        ll_deliveryWhippedCreamOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDeliveryWhippedCreamOption();
            }
        });

        ll_halalCertified.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandHalalCertified();
            }
        });

        ll_exchangeReturnPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandExchangeReturnPolicy();
            }
        });

        ll_bagChargesQuestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandBagChargesQuestion();
            }
        });

        ll_bagAlternatives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandBagAlternatives();
            }
        });

        ll_bagChargeInStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandBagChargeInStore();
            }
        });

        ll_whyChargeBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhyChargeBag();
            }
        });

        ll_bagCharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandBagCharge();
            }
        });
    }

    private void expandBestWayToStoreCoffee() {
        int v = (ll_bestWayToStoreCoffeeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_bestWayToStoreCoffeeDetail, new AutoTransition());
        ll_bestWayToStoreCoffeeDetail.setVisibility(v);

        if (ll_bestWayToStoreCoffeeDetail.getVisibility() == View.VISIBLE)
            imgView_bestWayToStoreCoffee.setImageResource(R.drawable.arrow_up);
        else
            imgView_bestWayToStoreCoffee.setImageResource(R.drawable.arrow_down);
    }

    private void expandRequestCoffeeGrounds() {
        int v = (ll_requestCoffeeGroundsDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_requestCoffeeGroundsDetail, new AutoTransition());
        ll_requestCoffeeGroundsDetail.setVisibility(v);

        if (ll_requestCoffeeGroundsDetail.getVisibility() == View.VISIBLE)
            imgView_requestCoffeeGrounds.setImageResource(R.drawable.arrow_up);
        else
            imgView_requestCoffeeGrounds.setImageResource(R.drawable.arrow_down);
    }

    private void expandGrindToUse() {
        int v = (ll_grindToUseDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_grindToUseDetail, new AutoTransition());
        ll_grindToUseDetail.setVisibility(v);

        if (ll_grindToUseDetail.getVisibility() == View.VISIBLE)
            imgView_grindToUse.setImageResource(R.drawable.arrow_up);
        else
            imgView_grindToUse.setImageResource(R.drawable.arrow_down);
    }

    private void expandGrindBeansInStore() {
        int v = (ll_grindBeansInStoreDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_grindBeansInStoreDetail, new AutoTransition());
        ll_grindBeansInStoreDetail.setVisibility(v);

        if (ll_grindBeansInStoreDetail.getVisibility() == View.VISIBLE)
            imgView_grindBeansInStore.setImageResource(R.drawable.arrow_up);
        else
            imgView_grindBeansInStore.setImageResource(R.drawable.arrow_down);
    }

    private void expandFlavourLockBag() {
        int v = (ll_flavourLockBagDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_flavourLockBagDetail, new AutoTransition());
        ll_flavourLockBagDetail.setVisibility(v);

        if (ll_flavourLockBagDetail.getVisibility() == View.VISIBLE)
            imgView_flavourLockBag.setImageResource(R.drawable.arrow_up);
        else
            imgView_flavourLockBag.setImageResource(R.drawable.arrow_down);
    }

    private void expandDeliveryWhippedCreamOption() {
        int v = (ll_deliveryWhippedCreamOptionDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_deliveryWhippedCreamOptionDetail, new AutoTransition());
        ll_deliveryWhippedCreamOptionDetail.setVisibility(v);

        if (ll_deliveryWhippedCreamOptionDetail.getVisibility() == View.VISIBLE)
            imgView_deliveryWhippedCreamOption.setImageResource(R.drawable.arrow_up);
        else
            imgView_deliveryWhippedCreamOption.setImageResource(R.drawable.arrow_down);
    }

    private void expandHalalCertified() {
        int v = (ll_halalCertifiedDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_halalCertifiedDetail, new AutoTransition());
        ll_halalCertifiedDetail.setVisibility(v);

        if (ll_halalCertifiedDetail.getVisibility() == View.VISIBLE)
            imgView_halalCertified.setImageResource(R.drawable.arrow_up);
        else
            imgView_halalCertified.setImageResource(R.drawable.arrow_down);
    }

    private void expandExchangeReturnPolicy() {
        int v = (ll_exchangeReturnPolicyDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_exchangeReturnPolicyDetail, new AutoTransition());
        ll_exchangeReturnPolicyDetail.setVisibility(v);

        if (ll_exchangeReturnPolicyDetail.getVisibility() == View.VISIBLE)
            imgView_exchangeReturnPolicy.setImageResource(R.drawable.arrow_up);
        else
            imgView_exchangeReturnPolicy.setImageResource(R.drawable.arrow_down);
    }

    private void expandBagChargesQuestion() {
        int v = (ll_bagChargesQuestionsDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_bagChargesQuestionsDetails, new AutoTransition());
        ll_bagChargesQuestionsDetails.setVisibility(v);

        if (ll_bagChargesQuestionsDetails.getVisibility() == View.VISIBLE)
            imgView_bagChargesQuestions.setImageResource(R.drawable.arrow_up);
        else
            imgView_bagChargesQuestions.setImageResource(R.drawable.arrow_down);
    }

    private void expandBagAlternatives() {
        int v = (ll_bagAlternativesDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_bagAlternativesDetail, new AutoTransition());
        ll_bagAlternativesDetail.setVisibility(v);

        if (ll_bagAlternativesDetail.getVisibility() == View.VISIBLE)
            imgView_bagAlternatives.setImageResource(R.drawable.arrow_up);
        else
            imgView_bagAlternatives.setImageResource(R.drawable.arrow_down);
    }

    private void expandBagChargeInStore() {
        int v = (ll_bagChargeInStoreDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_bagChargeInStoreDetail, new AutoTransition());
        ll_bagChargeInStoreDetail.setVisibility(v);

        if (ll_bagChargeInStoreDetail.getVisibility() == View.VISIBLE)
            imgView_bagChargeInStore.setImageResource(R.drawable.arrow_up);
        else
            imgView_bagChargeInStore.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhyChargeBag() {
        int v = (ll_whyChargeBagDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whyChargeBagDetail, new AutoTransition());
        ll_whyChargeBagDetail.setVisibility(v);

        if (ll_whyChargeBagDetail.getVisibility() == View.VISIBLE)
            imgView_whyChargeBag.setImageResource(R.drawable.arrow_up);
        else
            imgView_whyChargeBag.setImageResource(R.drawable.arrow_down);
    }

    private void expandBagCharge() {
        int v = (ll_bagChargeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_bagChargeDetail, new AutoTransition());
        ll_bagChargeDetail.setVisibility(v);

        if (ll_bagChargeDetail.getVisibility() == View.VISIBLE)
            imgView_bagCharge.setImageResource(R.drawable.arrow_up);
        else
            imgView_bagCharge.setImageResource(R.drawable.arrow_down);
    }


}