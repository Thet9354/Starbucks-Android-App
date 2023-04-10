package com.example.starbucks.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.starbucks.MainActivity;
import com.example.starbucks.R;

public class RegistrationFinish_Activity extends AppCompatActivity {

    private androidx.appcompat.widget.AppCompatButton btn_letsGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_finish);

        initWidget();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_letsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

    private void initWidget() {

        //Button
        btn_letsGo = findViewById(R.id.btn_letsGo);
    }
}