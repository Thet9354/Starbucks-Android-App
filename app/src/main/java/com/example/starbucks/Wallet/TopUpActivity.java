package com.example.starbucks.Wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.starbucks.R;

public class TopUpActivity extends AppCompatActivity {

    private ImageView btn_back, imgView_masterCard, imgView_amex, imgView_applePay;

    private TextView txtView_balanceDate, txtView_balanceAmount, txtView_percentUp, txtView_percentDown, txtView_topUp200, txtView_topUp100, txtView_topUp50, txtView_topUp20;

    private EditText editTxt_customValue;

    private androidx.appcompat.widget.AppCompatButton btn_topUp;

    private String paymentType, topUpAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up);

        initWidget();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        imgView_masterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paymentType = "Mastercard";
            }
        });

        imgView_amex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paymentType = "Amex";
            }
        });

        imgView_applePay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paymentType = "ApplePay";
            }
        });

        txtView_topUp200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topUpAmount = "200";
            }
        });

        txtView_topUp100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topUpAmount = "100";
            }
        });

        txtView_topUp50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topUpAmount = "50";
            }
        });

        txtView_topUp20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topUpAmount = "20";
            }
        });

        btn_topUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                topUpAmount = editTxt_customValue.getText().toString();

                validatePaymentType();
                validateTopUpAmount();
                validateInput();

            }
        });

    }

    private void validateInput() {

        if (!validatePaymentType() | !validateTopUpAmount())
        {
            return;
        }
        else
        {
            //TODO: Lead to different pages base on the payment type
        }
    }

    private boolean validateTopUpAmount() {

        if (topUpAmount.isEmpty())
        {
            Toast.makeText(this, "Please input an amount to top up", Toast.LENGTH_SHORT).show();
            return false;
        }
        else
            return true;
    }

    private boolean validatePaymentType() {
        // Check if a payment method is selected

        if (paymentType.isEmpty())
        {
            Toast.makeText(this, "Please select a payment type", Toast.LENGTH_SHORT).show();
            return false;
        }
        else
            return  true;
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);
        imgView_masterCard = findViewById(R.id.imgView_masterCard);
        imgView_amex = findViewById(R.id.imgView_amex);
        imgView_applePay = findViewById(R.id.imgView_applePay);

        txtView_balanceDate = findViewById(R.id.txtView_balanceDate);
        txtView_balanceAmount = findViewById(R.id.txtView_balanceAmount);
        txtView_percentUp = findViewById(R.id.txtView_percentUp);
        txtView_percentDown = findViewById(R.id.txtView_percentDown);
        txtView_topUp200 = findViewById(R.id.txtView_topUp200);
        txtView_topUp100 = findViewById(R.id.txtView_topUp100);
        txtView_topUp50 = findViewById(R.id.txtView_topUp50);
        txtView_topUp20 = findViewById(R.id.txtView_topUp20);

        editTxt_customValue = findViewById(R.id.editTxt_customValue);

        btn_topUp = findViewById(R.id.btn_topUp);

        initUI();

    }

    private void initUI() {
        // TODO: Retrieve data from firebase and adjust the default values
    }
}