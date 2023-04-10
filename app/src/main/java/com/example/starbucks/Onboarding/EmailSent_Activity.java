package com.example.starbucks.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.R;

import org.w3c.dom.Text;

public class EmailSent_Activity extends AppCompatActivity {
    private ImageView btn_back;
    private TextView txtView_mEmail, txtView_resend, txtView_contactUs;
    private androidx.appcompat.widget.AppCompatButton btn_backToLogin;

    private String mEmail;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_sent);

        intent = getIntent();

        initWidget();

        getIntentData();

        pageDirectories();
    }

    private void getIntentData() {
        mEmail = intent.getStringExtra("Email");

        txtView_mEmail.setText(mEmail);
    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        txtView_resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Resend the email confirmation for the resetting of password
            }
        });

        btn_backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LogIn_Activity.class));
            }
        });

        txtView_contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Lead the user to the customer service hotline
            }
        });
    }

    private void initWidget() {


    }
}