package com.example.starbucks.Settings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.starbucks.Adapter.FAQViewPagerAdapter;
import com.example.starbucks.R;
import com.google.android.material.tabs.TabLayout;

public class FAQs_Activity extends AppCompatActivity {

    private ImageView btn_close;
    private com.google.android.material.tabs.TabLayout faq_tabLayout;
    private androidx.viewpager2.widget.ViewPager2 faq_viewPager;

    FAQViewPagerAdapter faqViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqs);

        initWidget();

        initUI();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initUI() {

        faqViewPagerAdapter = new FAQViewPagerAdapter(this);
        faq_viewPager.setAdapter(faqViewPagerAdapter);

        faq_tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                faq_viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initWidget() {

        //ImageView
        btn_close = findViewById(R.id.btn_close);

        //tabLayout
        faq_tabLayout = findViewById(R.id.faq_tabLayout);

        //ViewPager
        faq_viewPager = findViewById(R.id.faq_viewPager);
    }
}