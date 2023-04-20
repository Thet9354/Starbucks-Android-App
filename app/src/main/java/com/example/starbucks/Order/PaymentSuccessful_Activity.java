package com.example.starbucks.Order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starbucks.Fragments.History;
import com.example.starbucks.MainActivity;
import com.example.starbucks.R;
import com.example.starbucks.Wallet.PortfolioActivity;

public class PaymentSuccessful_Activity extends AppCompatActivity {

    private TextView txtView_stars;
    private androidx.appcompat.widget.AppCompatButton btn_history, btn_home;
    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_successful);

        initWidget();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PortfolioActivity.class);
                startActivity(intent);
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initWidget() {

        //TextView
        txtView_stars = findViewById(R.id.txtView_stars);

        //AppCompatButton
        btn_history = findViewById(R.id.btn_history);
        btn_home = findViewById(R.id.btn_home);

        container = findViewById(R.id.container);

    }
}