package com.example.starbucks.Settings.Preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.example.starbucks.R;

public class Preferences_Activity extends AppCompatActivity {

    private ImageView btn_back;
    private androidx.appcompat.widget.SwitchCompat switch_notification, switch_shakeToPay;

    //Variables to store values
    private boolean notification, shakeToPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

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

        switch_notification.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    notification = true;
                else
                    notification = false;
            }
        });

        switch_shakeToPay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    shakeToPay = true;
                else
                    shakeToPay = false;
            }
        });
    }

    private void initUI() {



        defaultValues();
    }

    private void defaultValues() {
        notification = false;
        shakeToPay = true;

        switch_notification.setChecked(notification);
        switch_shakeToPay.setChecked(shakeToPay);
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);

        //SwitchCompat
        switch_notification = findViewById(R.id.switch_notification);
        switch_shakeToPay = findViewById(R.id.switch_shakeToPay);
    }
}