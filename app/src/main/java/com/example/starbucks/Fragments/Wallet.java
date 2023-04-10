package com.example.starbucks.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starbucks.Adapter.CardDetailAdapter;
import com.example.starbucks.Adapter.PromotionAdapter;
import com.example.starbucks.Model.CardDetails;
import com.example.starbucks.Model.Promotions;
import com.example.starbucks.R;
import com.example.starbucks.Wallet.PortfolioActivity;
import com.example.starbucks.Wallet.StatisticActivity;
import com.example.starbucks.Wallet.TopUpActivity;

import java.util.ArrayList;

public class Wallet extends Fragment {

    private ImageView btn_back, imgView_pfp, imgView_notification, imgView_customTopUp;

    private androidx.recyclerview.widget.RecyclerView rv_cardDetails;

    private TextView txtView_balance, txtView_rewardPoints;

    private LinearLayout ll_topUp, ll_statistic, ll_portfolio, ll_stake;
    private Context mContext;

    CardDetailAdapter cardDetailAdapter;

    private ArrayList<CardDetails> cardDetailsArrayList = new ArrayList<>();

    int[] cardDetailPic = {R.drawable.card1, R.drawable.card2, R.drawable.card3};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_wallet, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews(view);
    }

    private void findViews(View v) {

        //ImageView
        btn_back = v.findViewById(R.id.btn_back);
        imgView_pfp = v.findViewById(R.id.imgView_pfp);
        imgView_notification = v.findViewById(R.id.imgView_notification);
        imgView_customTopUp = v.findViewById(R.id.imgView_customTopUp);

        //RecyclerView
        rv_cardDetails = v.findViewById(R.id.rv_cardDetails);

        //TextView
        txtView_balance = v.findViewById(R.id.txtView_balance);
        txtView_rewardPoints = v.findViewById(R.id.txtView_rewardPoints);

        //LinearLayout
        ll_topUp = v.findViewById(R.id.ll_topUp);
        ll_statistic = v.findViewById(R.id.ll_statistic);
        ll_portfolio = v.findViewById(R.id.ll_portfolio);
        ll_stake = v.findViewById(R.id.ll_stake);

        initUI();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        ll_statistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, StatisticActivity.class));
            }
        });

        ll_portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, PortfolioActivity.class));
            }
        });

        ll_topUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(mContext, TopUpActivity.class));
            }
        });
    }

    private void initUI() {
        
        initCardRecView();
    }

    private void initCardRecView() {

        //for better performance of recyclerview.

        rv_cardDetails.setHasFixedSize(true);

        cardDetailAdapter = new CardDetailAdapter(getContext(), cardDetailsArrayList);
        rv_cardDetails.setAdapter(cardDetailAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_cardDetails.setLayoutManager(llm);

        new LoadCardDetails().execute();
    }

    CardDetails cardDetails;

    class LoadCardDetails extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                int cardNumber = 3;

                for (int i = 0 ; i < cardNumber; i++)
                {
                    cardDetails = new CardDetails();

                    cardDetails.setCardPic(cardDetailPic[i]);

                    cardDetailsArrayList.add(cardDetails);
                    cardDetails = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (cardDetailsArrayList != null && cardDetailsArrayList.size() > 0) {
                cardDetailAdapter = new CardDetailAdapter(mContext, cardDetailsArrayList);
                rv_cardDetails.setAdapter(cardDetailAdapter);
                cardDetailAdapter.notifyDataSetChanged();
            }
        }
    }

}