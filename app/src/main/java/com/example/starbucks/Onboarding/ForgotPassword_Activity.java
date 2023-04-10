package com.example.starbucks.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.R;

public class ForgotPassword_Activity extends AppCompatActivity {

    private ImageView btn_back;
    private EditText editTxt_email;
    private TextView txtView_logIn, txtView_signUp;
    private androidx.appcompat.widget.AppCompatButton btn_resetPassword;

    private String mEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

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

        txtView_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LogIn_Activity.class));
            }
        });

        txtView_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Registration_Activity.class));
            }
        });

        btn_resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEmail = editTxt_email.getText().toString();

                validateEmail();
            }
        });
    }

    private boolean validateEmail() {

        if (mEmail.isEmpty())
        {
            editTxt_email.setError("Field can not be empty");
            return false;
        }

        // Matching the input email to a predefined email pattern
        else if (!Patterns.EMAIL_ADDRESS.matcher(mEmail).matches())
        {
            editTxt_email.setError("Please enter a valid email address");
            return false;
        }
        else
        {
            editTxt_email.setError(null);
            sendResetPasswordEmail();
            return true;
        }
    }

    private void sendResetPasswordEmail() {
        //TODO: Send a reset password email to the user and move on to the next page

        Intent intent = new Intent(getApplicationContext(), EmailSent_Activity.class);
        intent.putExtra("Email", mEmail);
        startActivity(intent);
    }

    private void initWidget() {

        //ImagevIew
        btn_back = findViewById(R.id.btn_back);

        //EditText
        editTxt_email = findViewById(R.id.editTxt_email);

        //TextView
        txtView_logIn = findViewById(R.id.txtView_logIn);
        txtView_signUp = findViewById(R.id.txtView_signUp);

        //Button
        btn_resetPassword = findViewById(R.id.btn_resetPassword);
    }
}