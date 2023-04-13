package com.example.starbucks.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.starbucks.Fragments.History;
import com.example.starbucks.Fragments.Inbox;
import com.example.starbucks.Order.Delivery;
import com.example.starbucks.Order.TakeAway;

public class PaymentViewPagerAdapter extends FragmentStateAdapter {


    public PaymentViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new TakeAway();
            default:
                return new Delivery();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
