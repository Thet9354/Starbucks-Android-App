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

public class StarbucksCard extends Fragment {

    private LinearLayout ll_registerStarbucksCard, ll_registerEmailAddress, ll_changePassword,
            ll_wrongBDMonth, ll_starbucksCardPrivacy, ll_reloadStarbucksCard, ll_starbucksCardReloadItself,
            ll_minimumActAmount, ll_maxActAmount, ll_whereToUseCard, ll_viewAndManageCard, ll_cardReceipt,
            ll_cardServiceFee, ll_reloadCard, ll_travelStarbucksCard, ll_stolenCard, ll_refundCard,
            ll_cardRemainingValue, ll_transactionHistoryStars, ll_rewardList;


    private LinearLayout ll_registerStarbucksCardExplanation, ll_registerEmailAddressExplanation,
            ll_changePasswordDetail, ll_wrongBDMonthDetail, ll_cardPrivacyDetails,
            ll_reloadCardDetail, ll_cardReloadItselfDetail, ll_minActAmountDetail,
            ll_maxActAmountDetail, ll_whereToUseCardDetail, ll_viewAndManageCardDetail,
            ll_cardReceiptDetail, ll_cardServiceFeeDetail, ll_cardReloadDetail,
            ll_travelStarbucksCardDetail, ll_stolenCardDetail, ll_refundCardDetail,
            ll_cardRemainingValueDetail, ll_transactionHistoryStarsDetails, ll_rewardListDetails;

    private ImageView imgView_registerStarbucksCard, imgView_registerEmailAddress, imgView_changePassword,
            imgView_wrongBDMonth, imgView_starbucksCardPrivacy, imgView_reloadStarbucksCard, imgView_starbucksCardReloadItself,
            imgView_minimumActAmount, imgView_maxActAmount, imgView_whereToUseCard, imgView_viewAndManageCard,
            imgView_cardReceipt, imgView_cardServiceFee, imgView_reloadCard, imgView_travelStarbucksCard,
            imgView_stolenCard, imgView_refundCard, imgView_cardRemainingValue, imgView_transactionHistoryStars, imgView_rewardList;



    private Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_starbucks_card, container, false);

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
        imgView_registerStarbucksCard = v.findViewById(R.id.imgView_registerStarbucksCard);
        imgView_registerEmailAddress = v.findViewById(R.id.imgView_registerEmailAddress);
        imgView_changePassword = v.findViewById(R.id.imgView_changePassword);
        imgView_wrongBDMonth = v.findViewById(R.id.imgView_wrongBDMonth);
        imgView_starbucksCardPrivacy = v.findViewById(R.id.imgView_starbucksCardPrivacy);
        imgView_reloadStarbucksCard = v.findViewById(R.id.imgView_reloadStarbucksCard);
        imgView_starbucksCardReloadItself = v.findViewById(R.id.imgView_starbucksCardReloadItself);
        imgView_minimumActAmount = v.findViewById(R.id.imgView_minimumActAmount);
        imgView_maxActAmount = v.findViewById(R.id.imgView_maxActAmount);
        imgView_whereToUseCard = v.findViewById(R.id.imgView_whereToUseCard);
        imgView_viewAndManageCard = v.findViewById(R.id.imgView_viewAndManageCard);
        imgView_cardReceipt = v.findViewById(R.id.imgView_cardReceipt);
        imgView_cardServiceFee = v.findViewById(R.id.imgView_cardServiceFee);
        imgView_reloadCard = v.findViewById(R.id.imgView_reloadCard);
        imgView_travelStarbucksCard = v.findViewById(R.id.imgView_travelStarbucksCard);
        imgView_stolenCard = v.findViewById(R.id.imgView_stolenCard);
        imgView_refundCard = v.findViewById(R.id.imgView_refundCard);
        imgView_cardRemainingValue = v.findViewById(R.id.imgView_cardRemainingValue);
        imgView_transactionHistoryStars = v.findViewById(R.id.imgView_transactionHistoryStars);
        imgView_rewardList = v.findViewById(R.id.imgView_rewardList);
        imgView_registerStarbucksCard = v.findViewById(R.id.imgView_registerStarbucksCard);


        //LinearLayout 1
        ll_registerStarbucksCard = v.findViewById(R.id.ll_registerStarbucksCard);
        ll_registerEmailAddress = v.findViewById(R.id.ll_registerEmailAddress);
        ll_changePassword = v.findViewById(R.id.ll_changePassword);
        ll_wrongBDMonth = v.findViewById(R.id.ll_wrongBDMonth);
        ll_starbucksCardPrivacy = v.findViewById(R.id.ll_starbucksCardPrivacy);
        ll_reloadStarbucksCard = v.findViewById(R.id.ll_reloadStarbucksCard);
        ll_starbucksCardReloadItself = v.findViewById(R.id.ll_starbucksCardReloadItself);
        ll_minimumActAmount = v.findViewById(R.id.ll_minimumActAmount);
        ll_maxActAmount = v.findViewById(R.id.ll_maxActAmount);
        ll_whereToUseCard = v.findViewById(R.id.ll_whereToUseCard);
        ll_viewAndManageCard = v.findViewById(R.id.ll_viewAndManageCard);
        ll_cardReceipt = v.findViewById(R.id.ll_cardReceipt);
        ll_cardServiceFee = v.findViewById(R.id.ll_cardServiceFee);
        ll_reloadCard = v.findViewById(R.id.ll_reloadCard);
        ll_travelStarbucksCard = v.findViewById(R.id.ll_travelStarbucksCard);
        ll_stolenCard = v.findViewById(R.id.ll_stolenCard);
        ll_refundCard = v.findViewById(R.id.ll_refundCard);
        ll_cardRemainingValue = v.findViewById(R.id.ll_cardRemainingValue);
        ll_transactionHistoryStars = v.findViewById(R.id.ll_transactionHistoryStars);
        ll_rewardList = v.findViewById(R.id.ll_rewardList);

        //LinearLayout 2
        ll_registerStarbucksCardExplanation = v.findViewById(R.id.ll_registerStarbucksCardExplanation);
        ll_registerEmailAddressExplanation = v.findViewById(R.id.ll_registerEmailAddressExplanation);
        ll_changePasswordDetail = v.findViewById(R.id.ll_changePasswordDetail);
        ll_wrongBDMonthDetail = v.findViewById(R.id.ll_wrongBDMonthDetail);
        ll_cardPrivacyDetails = v.findViewById(R.id.ll_cardPrivacyDetails);
        ll_reloadCardDetail = v.findViewById(R.id.ll_reloadCardDetail);
        ll_cardReloadItselfDetail = v.findViewById(R.id.ll_cardReloadItselfDetail);
        ll_minActAmountDetail = v.findViewById(R.id.ll_minActAmountDetail);
        ll_maxActAmountDetail = v.findViewById(R.id.ll_maxActAmountDetail);
        ll_whereToUseCardDetail = v.findViewById(R.id.ll_whereToUseCardDetail);
        ll_viewAndManageCardDetail = v.findViewById(R.id.ll_viewAndManageCardDetail);
        ll_cardReceiptDetail = v.findViewById(R.id.ll_cardReceiptDetail);
        ll_cardServiceFeeDetail = v.findViewById(R.id.ll_cardServiceFeeDetail);
        ll_cardReloadDetail = v.findViewById(R.id.ll_cardReloadDetail);
        ll_travelStarbucksCardDetail = v.findViewById(R.id.ll_travelStarbucksCardDetail);
        ll_stolenCardDetail = v.findViewById(R.id.ll_stolenCardDetail);
        ll_refundCardDetail = v.findViewById(R.id.ll_refundCardDetail);
        ll_cardRemainingValueDetail = v.findViewById(R.id.ll_cardRemainingValueDetail);
        ll_transactionHistoryStarsDetails = v.findViewById(R.id.ll_transactionHistoryStarsDetails);
        ll_rewardListDetails = v.findViewById(R.id.ll_rewardListDetails);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_rewardList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRewardList();
            }
        });

        ll_transactionHistoryStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandTransitionHistoryStars();
            }
        });

        ll_cardRemainingValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCardRemainingValue();
            }
        });

        ll_refundCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRefundCard();
            }
        });

        ll_stolenCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStolenCard();
            }
        });

        ll_travelStarbucksCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandTravelCard();
            }
        });

        ll_reloadCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandReloadCard();
            }
        });

        ll_cardServiceFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCardServiceFee();
            }
        });

        ll_cardReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCardReceipt();
            }
        });

        ll_viewAndManageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandViewManageCard();
            }
        });

        ll_whereToUseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhereToUseCard();
            }
        });

        ll_maxActAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMaxAmount();
            }
        });

        ll_minimumActAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMinActAmount();
            }
        });

        ll_registerStarbucksCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRegisterStarbucksCard();
            }
        });

        ll_registerEmailAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandEmailAddress();
            }
        });

        ll_changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandChangePassword();
            }
        });

        ll_wrongBDMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWrongMonth();
            }
        });

        ll_starbucksCardPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStarbucksCardPrivacy();
            }
        });

        ll_reloadStarbucksCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandReloadStarbucksCard();
            }
        });

        ll_starbucksCardReloadItself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStarbucksCardReloadItself();
            }
        });
    }

    private void expandRewardList() {
        int v = (ll_rewardListDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_rewardListDetails, new AutoTransition());
        ll_rewardListDetails .setVisibility(v);

        if (ll_rewardListDetails.getVisibility() == View.VISIBLE)
            imgView_rewardList.setImageResource(R.drawable.arrow_up);
        else
            imgView_rewardList.setImageResource(R.drawable.arrow_down);
    }

    private void expandTransitionHistoryStars() {
        int v = (ll_transactionHistoryStarsDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_transactionHistoryStarsDetails, new AutoTransition());
        ll_transactionHistoryStarsDetails.setVisibility(v);

        if (ll_transactionHistoryStarsDetails.getVisibility() == View.VISIBLE)
            imgView_transactionHistoryStars.setImageResource(R.drawable.arrow_up);
        else
            imgView_transactionHistoryStars.setImageResource(R.drawable.arrow_down);
    }

    private void expandCardRemainingValue() {
        int v = (ll_cardRemainingValueDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cardRemainingValueDetail, new AutoTransition());
        ll_cardRemainingValueDetail.setVisibility(v);

        if (ll_cardRemainingValueDetail.getVisibility() == View.VISIBLE)
            imgView_cardRemainingValue.setImageResource(R.drawable.arrow_up);
        else
            imgView_cardRemainingValue.setImageResource(R.drawable.arrow_down);
    }

    private void expandRefundCard() {
        int v = (ll_refundCardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_refundCardDetail, new AutoTransition());
        ll_refundCardDetail.setVisibility(v);

        if (ll_refundCardDetail.getVisibility() == View.VISIBLE)
            imgView_refundCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_refundCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandStolenCard() {
        int v = (ll_stolenCardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_stolenCardDetail, new AutoTransition());
        ll_stolenCardDetail.setVisibility(v);

        if (ll_stolenCardDetail.getVisibility() == View.VISIBLE)
            imgView_stolenCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_stolenCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandTravelCard() {
        int v = (ll_travelStarbucksCardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_travelStarbucksCardDetail, new AutoTransition());
        ll_travelStarbucksCardDetail.setVisibility(v);

        if (ll_travelStarbucksCardDetail.getVisibility() == View.VISIBLE)
            imgView_travelStarbucksCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_travelStarbucksCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandReloadCard() {
        int v = (ll_cardReloadDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cardReloadDetail, new AutoTransition());
        ll_cardReloadDetail.setVisibility(v);

        if (ll_cardReloadDetail.getVisibility() == View.VISIBLE)
            imgView_reloadCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_reloadCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandCardServiceFee() {
        int v = (ll_cardServiceFeeDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cardServiceFeeDetail, new AutoTransition());
        ll_cardServiceFeeDetail.setVisibility(v);

        if (ll_cardServiceFeeDetail.getVisibility() == View.VISIBLE)
            imgView_cardServiceFee.setImageResource(R.drawable.arrow_up);
        else
            imgView_cardServiceFee.setImageResource(R.drawable.arrow_down);
    }

    private void expandCardReceipt() {
        int v = (ll_cardReceiptDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cardReceiptDetail, new AutoTransition());
        ll_cardReceiptDetail.setVisibility(v);

        if (ll_cardReceiptDetail.getVisibility() == View.VISIBLE)
            imgView_cardReceipt.setImageResource(R.drawable.arrow_up);
        else
            imgView_cardReceipt.setImageResource(R.drawable.arrow_down);
    }

    private void expandViewManageCard() {
        int v = (ll_viewAndManageCardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_viewAndManageCardDetail, new AutoTransition());
        ll_viewAndManageCardDetail.setVisibility(v);

        if (ll_viewAndManageCardDetail.getVisibility() == View.VISIBLE)
            imgView_viewAndManageCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_viewAndManageCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhereToUseCard() {
        int v = (ll_whereToUseCardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whereToUseCardDetail, new AutoTransition());
        ll_whereToUseCardDetail.setVisibility(v);

        if (ll_whereToUseCardDetail.getVisibility() == View.VISIBLE)
            imgView_whereToUseCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_whereToUseCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandMaxAmount() {
        int v = (ll_maxActAmountDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_maxActAmountDetail, new AutoTransition());
        ll_maxActAmountDetail.setVisibility(v);

        if (ll_maxActAmountDetail.getVisibility() == View.VISIBLE)
            imgView_maxActAmount.setImageResource(R.drawable.arrow_up);
        else
            imgView_maxActAmount.setImageResource(R.drawable.arrow_down);
    }

    private void expandMinActAmount() {
        int v = (ll_minActAmountDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_minActAmountDetail, new AutoTransition());
        ll_minActAmountDetail.setVisibility(v);

        if (ll_minActAmountDetail.getVisibility() == View.VISIBLE)
            imgView_minimumActAmount.setImageResource(R.drawable.arrow_up);
        else
            imgView_minimumActAmount.setImageResource(R.drawable.arrow_down);
    }

    private void expandStarbucksCardReloadItself() {
        int v = (ll_cardReloadItselfDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cardReloadItselfDetail, new AutoTransition());
        ll_cardReloadItselfDetail.setVisibility(v);

        if (ll_cardReloadItselfDetail.getVisibility() == View.VISIBLE)
            imgView_starbucksCardReloadItself.setImageResource(R.drawable.arrow_up);
        else
            imgView_starbucksCardReloadItself.setImageResource(R.drawable.arrow_down);
    }

    private void expandReloadStarbucksCard() {
        int v = (ll_reloadCardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_reloadCardDetail, new AutoTransition());
        ll_reloadCardDetail.setVisibility(v);

        if (ll_reloadCardDetail.getVisibility() == View.VISIBLE)
            imgView_reloadStarbucksCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_reloadStarbucksCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandStarbucksCardPrivacy() {
        int v = (ll_cardPrivacyDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cardPrivacyDetails, new AutoTransition());
        ll_cardPrivacyDetails.setVisibility(v);

        if (ll_cardPrivacyDetails.getVisibility() == View.VISIBLE)
            imgView_starbucksCardPrivacy.setImageResource(R.drawable.arrow_up);
        else
            imgView_starbucksCardPrivacy.setImageResource(R.drawable.arrow_down);
    }

    private void expandWrongMonth() {
        int v = (ll_wrongBDMonthDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_wrongBDMonthDetail, new AutoTransition());
        ll_wrongBDMonthDetail.setVisibility(v);

        if (ll_wrongBDMonthDetail.getVisibility() == View.VISIBLE)
            imgView_wrongBDMonth.setImageResource(R.drawable.arrow_up);
        else
            imgView_wrongBDMonth.setImageResource(R.drawable.arrow_down);
    }

    private void expandChangePassword() {
        int v = (ll_changePasswordDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_changePasswordDetail, new AutoTransition());
        ll_changePasswordDetail.setVisibility(v);

        if (ll_changePasswordDetail.getVisibility() == View.VISIBLE)
            imgView_changePassword.setImageResource(R.drawable.arrow_up);
        else
            imgView_changePassword.setImageResource(R.drawable.arrow_down);
    }

    private void expandEmailAddress() {
        int v = (ll_registerEmailAddressExplanation.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_registerEmailAddressExplanation, new AutoTransition());
        ll_registerEmailAddressExplanation.setVisibility(v);

        if (ll_registerEmailAddressExplanation.getVisibility() == View.VISIBLE)
            imgView_registerEmailAddress.setImageResource(R.drawable.arrow_up);
        else
            imgView_registerEmailAddress.setImageResource(R.drawable.arrow_down);
    }

    private void expandRegisterStarbucksCard() {
        int v = (ll_registerStarbucksCardExplanation.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_registerStarbucksCardExplanation, new AutoTransition());
        ll_registerStarbucksCardExplanation.setVisibility(v);


        if (ll_registerStarbucksCardExplanation.getVisibility() == View.VISIBLE)
            imgView_registerStarbucksCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_registerStarbucksCard.setImageResource(R.drawable.arrow_down);

    }
}