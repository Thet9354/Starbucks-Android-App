package com.example.starbucks.Order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.starbucks.R;

public class PinConfirmation_Activity extends AppCompatActivity {

    private ImageView btn_back;
    private EditText editTxt_pin_1, editTxt_pin_2, editText_pin3, editTxt_pin4;
    private androidx.appcompat.widget.AppCompatButton btn_ok;

    private String pin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_confirmation);

        initWidget();

        initUI();

        pageDirectories();
    }

    private void initUI() {

    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validatePin();
            }
        });
    }

    private void validatePin() {
        pin = editTxt_pin_1.getText().toString() + editTxt_pin_2.getText().toString() + editText_pin3.getText().toString() + editTxt_pin4.getText().toString();

        if (pin.isEmpty())
            Toast.makeText(this, "Field cannot be empty to proceed", Toast.LENGTH_SHORT).show();
        else
            validateInput();
    }

    private void validateInput() {
        //TODO: Cross reference check with the user's acc to see if the pin entered is the same as the pin of the card
        Intent intent = new Intent(getApplicationContext(), PaymentSuccessful_Activity.class);
        startActivity(intent);
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);

        //EditText
        editTxt_pin_1 = findViewById(R.id.editTxt_pin_1);
        editTxt_pin_2 = findViewById(R.id.editTxt_pin_2);
        editText_pin3 = findViewById(R.id.editText_pin3);
        editTxt_pin4 = findViewById(R.id.editTxt_pin4);

        //androidx.appcompat.widget.AppCompatButton
        btn_ok = findViewById(R.id.btn_ok);

    }
}