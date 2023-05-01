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


public class Careers extends Fragment {

    private LinearLayout ll_howOldToWork, ll_applyJob, ll_notifiedOfJob;
    private LinearLayout ll_howOldToWorkDetail, ll_applyJobDetail, ll_notifiedOfJobDetail;
    private ImageView imgView_howOldToWork, imgView_notifiedOfJob, imgView_applyJob;

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_careers, container, false);

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
        ll_howOldToWork = v.findViewById(R.id.ll_howOldToWork);
        ll_applyJob = v.findViewById(R.id.ll_applyJob);
        ll_notifiedOfJob = v.findViewById(R.id.ll_notifiedOfJob);

        //LinearLayout2
        ll_howOldToWorkDetail = v.findViewById(R.id.ll_howOldToWorkDetail);
        ll_applyJobDetail = v.findViewById(R.id.ll_applyJobDetail);
        ll_notifiedOfJobDetail = v.findViewById(R.id.ll_notifiedOfJobDetail);

        //ImageView
        imgView_howOldToWork = v.findViewById(R.id.imgView_howOldToWork);
        imgView_notifiedOfJob = v.findViewById(R.id.imgView_notifiedOfJob);
        imgView_applyJob = v.findViewById(R.id.imgView_applyJob);

        pageDirectories();

    }

    private void pageDirectories() {

        ll_howOldToWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandHowOldToWork();
            }
        });

        ll_applyJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandApplyJob();
            }
        });

        ll_notifiedOfJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expandNotifiedJob();
            }
        });
    }

    private void expandNotifiedJob() {
        int v = (ll_notifiedOfJobDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_notifiedOfJobDetail, new AutoTransition());
        ll_notifiedOfJobDetail.setVisibility(v);

        if (ll_notifiedOfJobDetail.getVisibility() == View.VISIBLE)
            imgView_notifiedOfJob.setImageResource(R.drawable.arrow_up);
        else
            imgView_notifiedOfJob.setImageResource(R.drawable.arrow_down);
    }

    private void expandApplyJob() {
        int v = (ll_applyJobDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_applyJobDetail, new AutoTransition());
        ll_applyJobDetail.setVisibility(v);

        if (ll_applyJobDetail.getVisibility() == View.VISIBLE)
            imgView_applyJob.setImageResource(R.drawable.arrow_up);
        else
            imgView_applyJob.setImageResource(R.drawable.arrow_down);
    }

    private void expandHowOldToWork() {
        int v = (ll_howOldToWorkDetail.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;

        TransitionManager.beginDelayedTransition(ll_howOldToWorkDetail, new AutoTransition());
        ll_howOldToWorkDetail.setVisibility(v);

        if (ll_howOldToWorkDetail.getVisibility() == View.VISIBLE)
            imgView_howOldToWork.setImageResource(R.drawable.arrow_up);
        else
            imgView_howOldToWork.setImageResource(R.drawable.arrow_down);
    }
}