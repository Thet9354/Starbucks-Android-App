package com.example.starbucks.Settings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.example.starbucks.R;

public class Security_Activity extends AppCompatActivity {

    private ImageView btn_back;
    private androidx.appcompat.widget.SwitchCompat switch_passcodeLock, switch_biometricLock;

    //Variables to store values
    private Boolean passwordLock, biometricLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

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

        switch_passcodeLock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    passwordLock = true;
                else
                    passwordLock = false;
            }
        });

        switch_biometricLock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    biometricLock = true;
                else
                    biometricLock = false;
            }
        });
    }

    private void initUI() {

        defaultValues();
    }

    private void defaultValues() {

        passwordLock = false;
        biometricLock = true;

        switch_passcodeLock.setChecked(passwordLock);
        switch_biometricLock.setChecked(biometricLock);
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);

        //Switch
        switch_passcodeLock = findViewById(R.id.switch_passcodeLock);
        switch_biometricLock = findViewById(R.id.switch_biometricLock);
    }
}