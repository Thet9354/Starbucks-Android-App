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

public class StarbucksReward extends Fragment {

    private LinearLayout ll_starbucksRewardProgram, ll_starbucksRewardProgramWork, ll_upgradeGoldLevel, ll_maintainGoldLevelStatus, ll_participatingRewardProgram,
            ll_registerAccIfNotMember, ll_multipleRenewalInOneYear, ll_whatAreStars, ll_howStarsUsed, ll_rewardsToRedeemWithStars, ll_drinksICanRedeem,
            ll_whatIsStar, ll_doStarsExpire;

    private LinearLayout ll_starbucksRewardProgramDetail, ll_starbucksRewardProgramWorkDetail, ll_upgradeGoldLevelDetail, ll_maintainGoldLevelStatusDetail,
            ll_participatingRewardProgramDetails, ll_registerAccIfNotMemberDetail, ll_multipleRenewalInOneYearDetail, ll_whatAreStarsDetail, ll_howStarsUsedDetail,
            ll_rewardsToRedeemWithStarsDetail, ll_drinksICanRedeemDetail, ll_whatIsStarDetail, ll_doStarsExpireDetail;

    private ImageView imgView_starbucksRewardProgram, imgView_starbucksRewardProgramWork, imgView_upgradeGoldLevel, imgView_maintainGoldLevelStatus,
            imgView_participatingRewardProgram, imgView_registerAccIfNotMember, imgView_multipleRenewalInOneYear, imgView_whatAreStars, imgView_howStarsUsed,
            imgView_rewardsToRedeemWithStars, imgView_drinksICanRedeem, imgView_whatIsStar, imgView_doStarsExpire;

    private Context mContext;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_starbucks_reward, container, false);

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
        ll_starbucksRewardProgram = v.findViewById(R.id.ll_starbucksRewardProgram);
        ll_starbucksRewardProgramWork = v.findViewById(R.id.ll_starbucksRewardProgramWork);
        ll_upgradeGoldLevel = v.findViewById(R.id.ll_upgradeGoldLevel);
        ll_maintainGoldLevelStatus = v.findViewById(R.id.ll_maintainGoldLevelStatus);
        ll_participatingRewardProgram = v.findViewById(R.id.ll_participatingRewardProgram);
        ll_registerAccIfNotMember = v.findViewById(R.id.ll_registerAccIfNotMember);
        ll_multipleRenewalInOneYear = v.findViewById(R.id.ll_multipleRenewalInOneYear);
        ll_whatAreStars = v.findViewById(R.id.ll_whatAreStars);
        ll_howStarsUsed = v.findViewById(R.id.ll_howStarsUsed);
        ll_rewardsToRedeemWithStars = v.findViewById(R.id.ll_rewardsToRedeemWithStars);
        ll_drinksICanRedeem = v.findViewById(R.id.ll_drinksICanRedeem);
        ll_whatIsStar = v.findViewById(R.id.ll_whatIsStar);
        ll_doStarsExpire = v.findViewById(R.id.ll_doStarsExpire);

        //LinearLayout2
        ll_starbucksRewardProgramDetail = v.findViewById(R.id.ll_starbucksRewardProgramDetail);
        ll_starbucksRewardProgramWorkDetail = v.findViewById(R.id.ll_starbucksRewardProgramWorkDetail);
        ll_upgradeGoldLevelDetail = v.findViewById(R.id.ll_upgradeGoldLevelDetail);
        ll_maintainGoldLevelStatusDetail = v.findViewById(R.id.ll_maintainGoldLevelStatusDetail);
        ll_participatingRewardProgramDetails = v.findViewById(R.id.ll_participatingRewardProgramDetails);
        ll_registerAccIfNotMemberDetail = v.findViewById(R.id.ll_registerAccIfNotMemberDetail);
        ll_multipleRenewalInOneYearDetail = v.findViewById(R.id.ll_multipleRenewalInOneYearDetail);
        ll_whatAreStarsDetail = v.findViewById(R.id.ll_whatAreStarsDetail);
        ll_howStarsUsedDetail = v.findViewById(R.id.ll_howStarsUsedDetail);
        ll_rewardsToRedeemWithStarsDetail = v.findViewById(R.id.ll_rewardsToRedeemWithStarsDetail);
        ll_drinksICanRedeemDetail = v.findViewById(R.id.ll_drinksICanRedeemDetail);
        ll_whatIsStarDetail = v.findViewById(R.id.ll_whatIsStarDetail);
        ll_doStarsExpireDetail = v.findViewById(R.id.ll_doStarsExpireDetail);

        //ImageView
        imgView_starbucksRewardProgram = v.findViewById(R.id.imgView_starbucksRewardProgram);
        imgView_starbucksRewardProgramWork = v.findViewById(R.id.imgView_starbucksRewardProgramWork);
        imgView_upgradeGoldLevel = v.findViewById(R.id.imgView_upgradeGoldLevel);
        imgView_maintainGoldLevelStatus = v.findViewById(R.id.imgView_maintainGoldLevelStatus);
        imgView_participatingRewardProgram = v.findViewById(R.id.imgView_participatingRewardProgram);
        imgView_registerAccIfNotMember = v.findViewById(R.id.imgView_registerAccIfNotMember);
        imgView_multipleRenewalInOneYear = v.findViewById(R.id.imgView_multipleRenewalInOneYear);
        imgView_whatAreStars = v.findViewById(R.id.imgView_whatAreStars);
        imgView_howStarsUsed = v.findViewById(R.id.imgView_howStarsUsed);
        imgView_rewardsToRedeemWithStars = v.findViewById(R.id.imgView_rewardsToRedeemWithStars);
        imgView_drinksICanRedeem = v.findViewById(R.id.imgView_drinksICanRedeem);
        imgView_whatIsStar = v.findViewById(R.id.imgView_whatIsStar);
        imgView_doStarsExpire = v.findViewById(R.id.imgView_doStarsExpire);

        pageDirectories();
    }

    private void pageDirectories() {

        ll_doStarsExpire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDoStarsExpire();
            }
        });

        ll_whatIsStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhatIsStar();
            }
        });

        ll_drinksICanRedeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandDrinksICanRedeem();
            }
        });

        ll_rewardsToRedeemWithStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRewardsToRedeemWithStars();
            }
        });

        ll_howStarsUsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandHowStarsUsed();
            }
        });

        ll_whatAreStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandWhatAreStars();
            }
        });

        ll_multipleRenewalInOneYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMultipleRenewalInOneYear();
            }
        });

        ll_registerAccIfNotMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandRegisterAccIfNotMember();
            }
        });

        ll_participatingRewardProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandParticipateRewardProgram();
            }
        });

        ll_maintainGoldLevelStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandMaintainGoldLevelStatus();
            }
        });

        ll_starbucksRewardProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStarbucksRewardProgram();
            }
        });

        ll_starbucksRewardProgramWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandStarbucksRewardProgramWork();
            }
        });

        ll_upgradeGoldLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandUpgradeToGold();
            }
        });
    }

    private void expandDoStarsExpire() {
        int v = (ll_doStarsExpireDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_doStarsExpireDetail, new AutoTransition());
        ll_doStarsExpireDetail.setVisibility(v);

        if (ll_doStarsExpireDetail.getVisibility() == View.VISIBLE)
            imgView_doStarsExpire.setImageResource(R.drawable.arrow_up);
        else
            imgView_doStarsExpire.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhatIsStar() {
        int v = (ll_whatIsStarDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whatIsStarDetail, new AutoTransition());
        ll_whatIsStarDetail.setVisibility(v);

        if (ll_whatIsStarDetail.getVisibility() == View.VISIBLE)
            imgView_whatIsStar.setImageResource(R.drawable.arrow_up);
        else
            imgView_whatIsStar.setImageResource(R.drawable.arrow_down);
    }

    private void expandDrinksICanRedeem() {
        int v = (ll_drinksICanRedeemDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_drinksICanRedeemDetail, new AutoTransition());
        ll_drinksICanRedeemDetail.setVisibility(v);

        if (ll_drinksICanRedeemDetail.getVisibility() == View.VISIBLE)
            imgView_drinksICanRedeem.setImageResource(R.drawable.arrow_up);
        else
            imgView_drinksICanRedeem.setImageResource(R.drawable.arrow_down);
    }

    private void expandRewardsToRedeemWithStars() {
        int v = (ll_rewardsToRedeemWithStarsDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_rewardsToRedeemWithStarsDetail, new AutoTransition());
        ll_rewardsToRedeemWithStarsDetail.setVisibility(v);

        if (ll_rewardsToRedeemWithStarsDetail.getVisibility() == View.VISIBLE)
            imgView_rewardsToRedeemWithStars.setImageResource(R.drawable.arrow_up);
        else
            imgView_rewardsToRedeemWithStars.setImageResource(R.drawable.arrow_down);
    }

    private void expandHowStarsUsed() {
        int v = (ll_howStarsUsedDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_howStarsUsedDetail, new AutoTransition());
        ll_howStarsUsedDetail.setVisibility(v);

        if (ll_howStarsUsedDetail.getVisibility() == View.VISIBLE)
            imgView_howStarsUsed.setImageResource(R.drawable.arrow_up);
        else
            imgView_howStarsUsed.setImageResource(R.drawable.arrow_down);
    }

    private void expandWhatAreStars() {
        int v = (ll_whatAreStarsDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_whatAreStarsDetail, new AutoTransition());
        ll_whatAreStarsDetail.setVisibility(v);

        if (ll_whatAreStarsDetail.getVisibility() == View.VISIBLE)
            imgView_whatAreStars.setImageResource(R.drawable.arrow_up);
        else
            imgView_whatAreStars.setImageResource(R.drawable.arrow_down);
    }

    private void expandMultipleRenewalInOneYear() {
        int v = (ll_multipleRenewalInOneYearDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_multipleRenewalInOneYearDetail, new AutoTransition());
        ll_multipleRenewalInOneYearDetail.setVisibility(v);

        if (ll_multipleRenewalInOneYearDetail.getVisibility() == View.VISIBLE)
            imgView_multipleRenewalInOneYear.setImageResource(R.drawable.arrow_up);
        else
            imgView_multipleRenewalInOneYear.setImageResource(R.drawable.arrow_down);
    }

    private void expandRegisterAccIfNotMember() {
        int v = (ll_registerAccIfNotMemberDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_registerAccIfNotMemberDetail, new AutoTransition());
        ll_registerAccIfNotMemberDetail.setVisibility(v);

        if (ll_registerAccIfNotMemberDetail.getVisibility() == View.VISIBLE)
            imgView_registerAccIfNotMember.setImageResource(R.drawable.arrow_up);
        else
            imgView_registerAccIfNotMember.setImageResource(R.drawable.arrow_down);
    }

    private void expandParticipateRewardProgram() {
        int v = (ll_participatingRewardProgramDetails.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_participatingRewardProgramDetails, new AutoTransition());
        ll_participatingRewardProgramDetails.setVisibility(v);

        if (ll_participatingRewardProgramDetails.getVisibility() == View.VISIBLE)
            imgView_participatingRewardProgram.setImageResource(R.drawable.arrow_up);
        else
            imgView_participatingRewardProgram.setImageResource(R.drawable.arrow_down);
    }

    private void expandMaintainGoldLevelStatus() {
        int v = (ll_maintainGoldLevelStatusDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_maintainGoldLevelStatusDetail, new AutoTransition());
        ll_maintainGoldLevelStatusDetail.setVisibility(v);

        if (ll_maintainGoldLevelStatusDetail.getVisibility() == View.VISIBLE)
            imgView_maintainGoldLevelStatus.setImageResource(R.drawable.arrow_up);
        else
            imgView_maintainGoldLevelStatus.setImageResource(R.drawable.arrow_down);
    }

    private void expandUpgradeToGold() {
        int v = (ll_upgradeGoldLevelDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_upgradeGoldLevelDetail, new AutoTransition());
        ll_upgradeGoldLevelDetail.setVisibility(v);

        if (ll_upgradeGoldLevelDetail.getVisibility() == View.VISIBLE)
            imgView_upgradeGoldLevel.setImageResource(R.drawable.arrow_up);
        else
            imgView_upgradeGoldLevel.setImageResource(R.drawable.arrow_down);
    }

    private void expandStarbucksRewardProgramWork() {
        int v = (ll_starbucksRewardProgramWorkDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_starbucksRewardProgramWorkDetail, new AutoTransition());
        ll_starbucksRewardProgramWorkDetail.setVisibility(v);

        if (ll_starbucksRewardProgramWorkDetail.getVisibility() == View.VISIBLE)
            imgView_starbucksRewardProgramWork.setImageResource(R.drawable.arrow_up);
        else
            imgView_starbucksRewardProgramWork.setImageResource(R.drawable.arrow_down);
    }

    private void expandStarbucksRewardProgram() {
        int v = (ll_starbucksRewardProgramDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_starbucksRewardProgramDetail, new AutoTransition());
        ll_starbucksRewardProgramDetail.setVisibility(v);

        if (ll_starbucksRewardProgramDetail.getVisibility() == View.VISIBLE)
            imgView_starbucksRewardProgram.setImageResource(R.drawable.arrow_up);
        else
            imgView_starbucksRewardProgram.setImageResource(R.drawable.arrow_down);
    }


}