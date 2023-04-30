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

public class eGift extends Fragment {

    private LinearLayout ll_eGiftFromFriend, ll_purchaseCardOnline, ll_mustIBeAMember,
            ll_earnStarsWitheGift, ll_eGiftMinMaxLoad, ll_sendCardGiftToFriend,
            ll_didNotReceiveGift, ll_wrongEmail, ll_accidentallyDeletedEmail,
            ll_eGiftExpiry, ll_whenToUseGift, ll_cancelRefundCard, ll_eGiftPaymentMethod;

    private LinearLayout ll_eGiftFromFriendDetail, ll_purchaseCardOnlineDetail, ll_mustIBeAMemberDetail,
            ll_earnStarsWitheGiftDetail, ll_eGiftMinMaxLoadDetails, ll_sendCardGiftToFriendDetail,
            ll_didNotReceiveGiftDetail, ll_wrongEmailDetail, ll_accidentallyDeletedEmailDetail,
            ll_eGiftExpiryDetail, ll_whenToUseGiftDetail, ll_cancelRefundCardDetail, ll_eGiftPaymentMethodDetail;

    private ImageView imgView_eGiftFromFriend, imgView_purchaseCardOnline, imgView_mustIBeAMember,
            imgView_earnStarsWitheGift, imgView_eGiftMinMaxLoad, imgView_sendCardGiftToFriend,
            imgView_didNotReceiveGift, imgView_wrongEmail, imgView_accidentallyDeletedEmail,
            imgView_eGiftExpiry, imgView_whenToUseGift, imgView_cancelRefundCard, imgView_eGiftPaymentMethod;

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_e_gift, container, false);

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
        ll_eGiftFromFriendDetail = v.findViewById(R.id.ll_eGiftFromFriendDetail);
        ll_purchaseCardOnlineDetail = v.findViewById(R.id.ll_purchaseCardOnlineDetail);
        ll_mustIBeAMemberDetail = v.findViewById(R.id.ll_mustIBeAMemberDetail);
        ll_earnStarsWitheGiftDetail = v.findViewById(R.id.ll_earnStarsWitheGiftDetail);
        ll_eGiftMinMaxLoadDetails = v.findViewById(R.id.ll_eGiftMinMaxLoadDetails);
        ll_sendCardGiftToFriendDetail = v.findViewById(R.id.ll_sendCardGiftToFriendDetail);
        ll_didNotReceiveGiftDetail = v.findViewById(R.id.ll_didNotReceiveGiftDetail);
        ll_wrongEmailDetail = v.findViewById(R.id.ll_wrongEmailDetail);
        ll_accidentallyDeletedEmailDetail = v.findViewById(R.id.ll_accidentallyDeletedEmailDetail);
        ll_eGiftExpiryDetail = v.findViewById(R.id.ll_eGiftExpiryDetail);
        ll_whenToUseGiftDetail = v.findViewById(R.id.ll_whenToUseGiftDetail);
        ll_cancelRefundCardDetail = v.findViewById(R.id.ll_cancelRefundCardDetail);
        ll_eGiftPaymentMethodDetail = v.findViewById(R.id.ll_eGiftPaymentMethodDetail);


        //ImageView
        imgView_eGiftFromFriend = v.findViewById(R.id.imgView_eGiftFromFriend);
        imgView_purchaseCardOnline = v.findViewById(R.id.imgView_purchaseCardOnline);
        imgView_mustIBeAMember = v.findViewById(R.id.imgView_mustIBeAMember);
        imgView_earnStarsWitheGift = v.findViewById(R.id.imgView_earnStarsWitheGift);
        imgView_eGiftMinMaxLoad = v.findViewById(R.id.imgView_eGiftMinMaxLoad);
        imgView_sendCardGiftToFriend = v.findViewById(R.id.imgView_sendCardGiftToFriend);
        imgView_didNotReceiveGift = v.findViewById(R.id.imgView_didNotReceiveGift);
        imgView_wrongEmail = v.findViewById(R.id.imgView_wrongEmail);
        imgView_accidentallyDeletedEmail = v.findViewById(R.id.imgView_accidentallyDeletedEmail);
        imgView_eGiftExpiry = v.findViewById(R.id.imgView_eGiftExpiry);
        imgView_whenToUseGift = v.findViewById(R.id.imgView_whenToUseGift);
        imgView_cancelRefundCard = v.findViewById(R.id.imgView_cancelRefundCard);
        imgView_eGiftPaymentMethod = v.findViewById(R.id.imgView_eGiftPaymentMethod);

        //LinearLayout
        ll_eGiftFromFriend = v.findViewById(R.id.ll_eGiftFromFriend);
        ll_purchaseCardOnline = v.findViewById(R.id.ll_purchaseCardOnline);
        ll_mustIBeAMember = v.findViewById(R.id.ll_mustIBeAMember);
        ll_earnStarsWitheGift = v.findViewById(R.id.ll_earnStarsWitheGift);
        ll_eGiftMinMaxLoad = v.findViewById(R.id.ll_eGiftMinMaxLoad);
        ll_sendCardGiftToFriend = v.findViewById(R.id.ll_sendCardGiftToFriend);
        ll_didNotReceiveGift = v.findViewById(R.id.ll_didNotReceiveGift);
        ll_wrongEmail = v.findViewById(R.id.ll_wrongEmail);
        ll_accidentallyDeletedEmail = v.findViewById(R.id.ll_accidentallyDeletedEmail);
        ll_eGiftExpiry = v.findViewById(R.id.ll_eGiftExpiry);
        ll_whenToUseGift = v.findViewById(R.id.ll_whenToUseGift);
        ll_cancelRefundCard = v.findViewById(R.id.ll_cancelRefundCard);
        ll_eGiftPaymentMethod = v.findViewById(R.id.ll_eGiftPaymentMethod);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_eGiftPaymentMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandeGiftPaymentMethod();
            }
        });

        ll_cancelRefundCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandCancelRefundCard();
            }
        });

        ll_whenToUseGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhenToUseGift();
            }
        });

        ll_eGiftExpiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandeGiftExpiry();
            }
        });

        ll_accidentallyDeletedEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandAccidentallyDeletedEmail();
            }
        });

        ll_wrongEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWrongEmail();
            }
        });

        ll_didNotReceiveGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDidNotReceiveGift();
            }
        });

        ll_sendCardGiftToFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandSendCardGiftToFriend();
            }
        });

        ll_eGiftMinMaxLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMinMaxLoad();
            }
        });

        ll_earnStarsWitheGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandEarnStarsWithGift();
            }
        });

        ll_mustIBeAMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMustIBeAMember();
            }
        });

        ll_purchaseCardOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandPurchaseCardOnline();
            }
        });

        ll_eGiftFromFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandeGiftFromFriend();
            }
        });

    }

    private void expandeGiftPaymentMethod() {
        int v = (ll_eGiftPaymentMethodDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_eGiftPaymentMethodDetail, new AutoTransition());
        ll_eGiftPaymentMethodDetail.setVisibility(v);

        if (ll_eGiftPaymentMethodDetail.getVisibility() == View.VISIBLE)
            imgView_eGiftPaymentMethod.setImageResource(R.drawable.arrow_up);
        else
            imgView_eGiftPaymentMethod.setImageResource(R.drawable.arrow_down);
    }

    private void expandCancelRefundCard() {
        int v = (ll_cancelRefundCardDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_cancelRefundCardDetail, new AutoTransition());
        ll_cancelRefundCardDetail.setVisibility(v);

        if (ll_cancelRefundCardDetail.getVisibility() == View.VISIBLE)
            imgView_cancelRefundCard.setImageResource(R.drawable.arrow_up);
        else
            imgView_cancelRefundCard.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhenToUseGift() {
        int v = (ll_whenToUseGiftDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whenToUseGiftDetail, new AutoTransition());
        ll_whenToUseGiftDetail.setVisibility(v);

        if (ll_whenToUseGiftDetail.getVisibility() == View.VISIBLE)
            imgView_whenToUseGift.setImageResource(R.drawable.arrow_up);
        else
            imgView_whenToUseGift.setImageResource(R.drawable.arrow_down);
    }

    private void expandeGiftExpiry() {
        int v = (ll_eGiftExpiryDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_eGiftExpiryDetail, new AutoTransition());
        ll_eGiftExpiryDetail.setVisibility(v);

        if (ll_eGiftExpiryDetail.getVisibility() == View.VISIBLE)
            imgView_eGiftExpiry.setImageResource(R.drawable.arrow_up);
        else
            imgView_eGiftExpiry.setImageResource(R.drawable.arrow_down);
    }

    private void expandAccidentallyDeletedEmail() {
        int v = (ll_accidentallyDeletedEmailDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_accidentallyDeletedEmailDetail, new AutoTransition());
        ll_accidentallyDeletedEmailDetail.setVisibility(v);

        if (ll_accidentallyDeletedEmailDetail.getVisibility() == View.VISIBLE)
            imgView_accidentallyDeletedEmail.setImageResource(R.drawable.arrow_up);
        else
            imgView_accidentallyDeletedEmail.setImageResource(R.drawable.arrow_down);
    }

    private void expandWrongEmail() {
        int v = (ll_wrongEmailDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_wrongEmailDetail, new AutoTransition());
        ll_wrongEmailDetail.setVisibility(v);

        if (ll_wrongEmailDetail.getVisibility() == View.VISIBLE)
            imgView_wrongEmail.setImageResource(R.drawable.arrow_up);
        else
            imgView_wrongEmail.setImageResource(R.drawable.arrow_down);
    }

    private void expandDidNotReceiveGift() {
        int v = (ll_didNotReceiveGiftDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_didNotReceiveGiftDetail, new AutoTransition());
        ll_didNotReceiveGiftDetail.setVisibility(v);

        if (ll_didNotReceiveGiftDetail.getVisibility() == View.VISIBLE)
            imgView_didNotReceiveGift.setImageResource(R.drawable.arrow_up);
        else
            imgView_didNotReceiveGift.setImageResource(R.drawable.arrow_down);
    }

    private void expandSendCardGiftToFriend() {
        int v = (ll_sendCardGiftToFriendDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_sendCardGiftToFriendDetail, new AutoTransition());
        ll_sendCardGiftToFriendDetail.setVisibility(v);

        if (ll_sendCardGiftToFriendDetail.getVisibility() == View.VISIBLE)
            imgView_sendCardGiftToFriend.setImageResource(R.drawable.arrow_up);
        else
            imgView_sendCardGiftToFriend.setImageResource(R.drawable.arrow_down);
    }

    private void expandMinMaxLoad() {
        int v = (ll_eGiftMinMaxLoadDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_eGiftMinMaxLoadDetails, new AutoTransition());
        ll_eGiftMinMaxLoadDetails.setVisibility(v);

        if (ll_eGiftMinMaxLoadDetails.getVisibility() == View.VISIBLE)
            imgView_eGiftMinMaxLoad.setImageResource(R.drawable.arrow_up);
        else
            imgView_eGiftMinMaxLoad.setImageResource(R.drawable.arrow_down);
    }

    private void expandEarnStarsWithGift() {
        int v = (ll_earnStarsWitheGiftDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_earnStarsWitheGiftDetail, new AutoTransition());
        ll_earnStarsWitheGiftDetail.setVisibility(v);

        if (ll_earnStarsWitheGiftDetail.getVisibility() == View.VISIBLE)
            imgView_earnStarsWitheGift.setImageResource(R.drawable.arrow_up);
        else
            imgView_earnStarsWitheGift.setImageResource(R.drawable.arrow_down);
    }

    private void expandMustIBeAMember() {
        int v = (ll_mustIBeAMemberDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_mustIBeAMemberDetail, new AutoTransition());
        ll_mustIBeAMemberDetail.setVisibility(v);

        if (ll_mustIBeAMemberDetail.getVisibility() == View.VISIBLE)
            imgView_mustIBeAMember.setImageResource(R.drawable.arrow_up);
        else
            imgView_mustIBeAMember.setImageResource(R.drawable.arrow_down);
    }

    private void expandPurchaseCardOnline() {
        int v = (ll_purchaseCardOnlineDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_purchaseCardOnlineDetail, new AutoTransition());
        ll_purchaseCardOnlineDetail.setVisibility(v);

        if (ll_purchaseCardOnlineDetail.getVisibility() == View.VISIBLE)
            imgView_purchaseCardOnline.setImageResource(R.drawable.arrow_up);
        else
            imgView_purchaseCardOnline.setImageResource(R.drawable.arrow_down);
    }

    private void expandeGiftFromFriend() {
        int v = (ll_eGiftFromFriendDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_eGiftFromFriendDetail, new AutoTransition());
        ll_eGiftFromFriendDetail.setVisibility(v);

        if (ll_eGiftFromFriendDetail.getVisibility() == View.VISIBLE)
            imgView_eGiftFromFriend.setImageResource(R.drawable.arrow_up);
        else
            imgView_eGiftFromFriend.setImageResource(R.drawable.arrow_down);
    }
}