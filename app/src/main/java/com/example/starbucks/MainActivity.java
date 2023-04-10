package com.example.starbucks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.example.starbucks.Fragments.Home;
import com.example.starbucks.Fragments.Location;
import com.example.starbucks.Fragments.Membership;
import com.example.starbucks.Fragments.Order;
import com.example.starbucks.Fragments.Wallet;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout fragment_container;
    private ChipNavigationBar bottom_nav_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        initWidget();
    }

    private void initWidget() {
        fragment_container = findViewById(R.id.fragment_container);
        bottom_nav_bar = findViewById(R.id.bottom_nav_bar);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();
        bottom_nav_bar.setItemSelected(R.id.nav_home, true);
        bottomMenu();
    }

    private void bottomMenu() {
        bottom_nav_bar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment = null;
                switch(i)
                {
                    case R.id.nav_home:
                        fragment = new Home();
                        break;

                    case R.id.nav_wallet:
                        fragment = new Wallet();
                        break;

                    case R.id.nav_order:
                        fragment = new Order();
                        break;

                    case R.id.nav_membership:
                        fragment = new Membership();
                        break;

                    case R.id.nav_location:
                        fragment = new Location();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            }
        });
    }
}