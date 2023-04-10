package com.example.starbucks.Wallet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.Adapter.CardDetailAdapter;
import com.example.starbucks.Adapter.RecentTransactionAdapter;
import com.example.starbucks.Fragments.Wallet;
import com.example.starbucks.Model.CardDetails;
import com.example.starbucks.Model.RecentTransaction;
import com.example.starbucks.R;

import java.util.ArrayList;

public class StatisticActivity extends AppCompatActivity {

    private ImageView btn_back, imgView_pfp;
    private TextView txtView_balance, txtView_percentUp, txtView_percentDown;
    private androidx.recyclerview.widget.RecyclerView rv_recentTransactions;

    RecentTransactionAdapter recentTransactionAdapter;

    private ArrayList<RecentTransaction> recentTransactionArrayList = new ArrayList<>();

    int[] orderPics = {R.drawable.cheesecake_milkshake, R.drawable.coffee_latte_macchiato, R.drawable.cheesecake_milkshake, R.drawable.coffee_latte_macchiato, R.drawable.cheesecake_milkshake, R.drawable.coffee_latte_macchiato, R.drawable.cheesecake_milkshake};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

        initWidget();

        initUI();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initUI() {

        initRecentTransaction();
    }

    private void initRecentTransaction() {

        //for better performance of recyclerview.

        rv_recentTransactions.setHasFixedSize(true);

        recentTransactionAdapter = new RecentTransactionAdapter(getApplicationContext(), recentTransactionArrayList);
        rv_recentTransactions.setAdapter(recentTransactionAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_recentTransactions.setLayoutManager(llm);

        new LoadRecentTransaction().execute();
    }

    RecentTransaction recentTransaction;

    class LoadRecentTransaction extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                String[] orderName = getResources().getStringArray(R.array.recentTransaction_orderName);
                String[] orderDate = getResources().getStringArray(R.array.recentTransaction_orderDate);
                String[] orderPrice = getResources().getStringArray(R.array.recentTransaction_orderPrice);


                for (int i = 0 ; i < orderName.length; i++)
                {
                    recentTransaction = new RecentTransaction();

                    recentTransaction.setOrderName(orderName[i]);
                    recentTransaction.setOrderDate(orderDate[i]);
                    recentTransaction.setOrderAmount(orderPrice[i]);
                    recentTransaction.setOrderImage(orderPics[i]);


                    recentTransactionArrayList.add(recentTransaction);
                    recentTransaction = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (recentTransactionArrayList != null && recentTransactionArrayList.size() > 0) {
                recentTransactionAdapter = new RecentTransactionAdapter(getApplicationContext(), recentTransactionArrayList);
                rv_recentTransactions.setAdapter(recentTransactionAdapter);
                recentTransactionAdapter.notifyDataSetChanged();
            }
        }
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);
        imgView_pfp = findViewById(R.id.imgView_pfp);

        //TextView
        txtView_balance = findViewById(R.id.txtView_balance);
        txtView_percentUp = findViewById(R.id.txtView_percentUp);
        txtView_percentDown = findViewById(R.id.txtView_percentDown);

        //RecyclerView
        rv_recentTransactions = findViewById(R.id.rv_recentTransactions);

    }
}