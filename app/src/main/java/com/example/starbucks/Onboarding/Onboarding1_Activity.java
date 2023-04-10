package com.example.starbucks.Onboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.starbucks.Adapter.SliderAdapter;
import com.example.starbucks.R;

public class Onboarding1_Activity extends AppCompatActivity {

    private LinearLayout parent;
    private ViewPager viewPager;

    private TextView[] mDots;

    private SliderAdapter sliderAdapter;

    private androidx.appcompat.widget.AppCompatButton btn_getStarted;
    private TextView txtView_logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1);

        initWidget();

        initAdapter();

        pageDirectories();
    }

    private void initAdapter() {

        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);
    }

    private void pageDirectories() {
        btn_getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lead user to the registration page
                startActivity(new Intent(getApplicationContext(), Registration_Activity.class));
            }
        });

        txtView_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LogIn_Activity.class));
            }
        });
    }

    private void initWidget() {

        parent = findViewById(R.id.parent);

        viewPager = findViewById(R.id.viewPager);

        //Button
        btn_getStarted = findViewById(R.id.btn_getStarted);

        //TextView
        txtView_logIn = findViewById(R.id.txtView_logIn);
    }
}