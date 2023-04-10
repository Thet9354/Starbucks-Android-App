package com.example.starbucks.Fragments;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.example.starbucks.Adapter.CardDetailAdapter;
import com.example.starbucks.Adapter.Previous7DaysAdapter;
import com.example.starbucks.Adapter.TodayAdapter;
import com.example.starbucks.Adapter.YesterdayAdapter;
import com.example.starbucks.Model.CardDetails;
import com.example.starbucks.Model.Previous7Days;
import com.example.starbucks.Model.Today;
import com.example.starbucks.Model.Yesterday;
import com.example.starbucks.R;
import com.example.starbucks.SpaceItemDecoration;

import java.util.ArrayList;

public class History extends Fragment {

    private androidx.recyclerview.widget.RecyclerView rv_todayHistory, rv_yesterdayHistory, rv_previous7Days;
    private Context mContext;
    TodayAdapter todayAdapter;
    YesterdayAdapter yesterdayAdapter;
    Previous7DaysAdapter previous7DaysAdapter;

    private ArrayList<Today> todayArrayList = new ArrayList<>();
    private ArrayList<Yesterday> yesterdayArrayList = new ArrayList<>();
    private ArrayList<Previous7Days> previous7DaysArrayList = new ArrayList<>();


    int[] todayTypePic = {R.drawable.payment, R.drawable.reward, R.drawable.payment, R.drawable.reward, R.drawable.payment};
    int[] yestdTypePic = {R.drawable.payment, R.drawable.payment};
    int[] prevTypePic = {R.drawable.payment, R.drawable.reward, R.drawable.payment, R.drawable.reward, R.drawable.payment};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_history, container, false);

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

        //RecylerView
        rv_todayHistory = v.findViewById(R.id.rv_todayHistory);
        rv_yesterdayHistory = v.findViewById(R.id.rv_yesterdayHistory);
        rv_previous7Days = v.findViewById(R.id.rv_previous7Days);

        initUI();

        pageDirectories();
    }

    private void pageDirectories() {


    }

    private void initUI() {

        initTodayRecView();

        initYestdRecView();

        initPreviousRecView();
    }

    private void initPreviousRecView() {

        //for better performance of recyclerview.
        int spaceInPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
        rv_previous7Days.addItemDecoration(new SpaceItemDecoration(spaceInPixels));

        rv_previous7Days.setHasFixedSize(true);

        previous7DaysAdapter = new Previous7DaysAdapter(getContext(), previous7DaysArrayList);
        rv_previous7Days.setAdapter(previous7DaysAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_previous7Days.setLayoutManager(llm);

        new LoadPrev7Days().execute();
    }

    private void initYestdRecView() {

        //for better performance of recyclerview.
        int spaceInPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
        rv_yesterdayHistory.addItemDecoration(new SpaceItemDecoration(spaceInPixels));

        rv_yesterdayHistory.setHasFixedSize(true);

        yesterdayAdapter = new YesterdayAdapter(getContext(), yesterdayArrayList);
        rv_yesterdayHistory.setAdapter(yesterdayAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_yesterdayHistory.setLayoutManager(llm);

        new LoadYesterday().execute();
    }

    private void initTodayRecView() {

        //for better performance of recyclerview.
        int spaceInPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
        rv_todayHistory.addItemDecoration(new SpaceItemDecoration(spaceInPixels));

        rv_todayHistory.setHasFixedSize(true);

        todayAdapter = new TodayAdapter(getContext(), todayArrayList);
        rv_todayHistory.setAdapter(todayAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_todayHistory.setLayoutManager(llm);

        new LoadToday().execute();
    }

    Today today;
    Yesterday yesterday;
    Previous7Days previous7Days;

    class LoadPrev7Days extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                String[] type = getResources().getStringArray(R.array.prev7Days_type);
                String[] date = getResources().getStringArray(R.array.prev7Days_date);
                String[] cost = getResources().getStringArray(R.array.prev7Days_cost);
                String[] reward = getResources().getStringArray(R.array.prev7Days_reward);

                for (int i = 0 ; i < type.length; i++)
                {
                    previous7Days = new Previous7Days();

                    previous7Days.setType(type[i]);
                    previous7Days.setDate(date[i]);
                    previous7Days.setCost(cost[i]);
                    previous7Days.setRewardPoints(reward[i]);
                    previous7Days.setTypeImage(prevTypePic[i]);


                    previous7DaysArrayList.add(previous7Days);
                    previous7Days = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (previous7DaysArrayList != null && previous7DaysArrayList.size() > 0) {
                previous7DaysAdapter = new Previous7DaysAdapter(mContext, previous7DaysArrayList);
                rv_previous7Days.setAdapter(previous7DaysAdapter);
                previous7DaysAdapter.notifyDataSetChanged();
            }
        }
    }
    class LoadYesterday extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                String[] type = getResources().getStringArray(R.array.yestd_type);
                String[] date = getResources().getStringArray(R.array.yestd_date);
                String[] cost = getResources().getStringArray(R.array.yestd_cost);
                String[] reward = getResources().getStringArray(R.array.yestd_reward);

                for (int i = 0 ; i < type.length; i++)
                {
                    yesterday = new Yesterday();

                    yesterday.setType(type[i]);
                    yesterday.setDate(date[i]);
                    yesterday.setCost(cost[i]);
                    yesterday.setRewardPoints(reward[i]);
                    yesterday.setTypeImage(yestdTypePic[i]);


                    yesterdayArrayList.add(yesterday);
                    yesterday = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (yesterdayArrayList != null && yesterdayArrayList.size() > 0) {
                yesterdayAdapter = new YesterdayAdapter(mContext, yesterdayArrayList);
                rv_yesterdayHistory.setAdapter(yesterdayAdapter);
                yesterdayAdapter.notifyDataSetChanged();
            }
        }
    }
    class LoadToday extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                String[] type = getResources().getStringArray(R.array.today_type);
                String[] date = getResources().getStringArray(R.array.today_date);
                String[] cost = getResources().getStringArray(R.array.today_cost);
                String[] reward = getResources().getStringArray(R.array.today_reward);


                for (int i = 0 ; i < type.length; i++)
                {
                    today = new Today();

                    today.setType(type[i]);
                    today.setDate(date[i]);
                    today.setCost(cost[i]);
                    today.setRewardPoints(reward[i]);
                    today.setTypeImage(todayTypePic[i]);


                    todayArrayList.add(today);
                    today = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (todayArrayList != null && todayArrayList.size() > 0) {
                todayAdapter = new TodayAdapter(mContext, todayArrayList);
                rv_todayHistory.setAdapter(todayAdapter);
                todayAdapter.notifyDataSetChanged();
            }
        }
    }
}