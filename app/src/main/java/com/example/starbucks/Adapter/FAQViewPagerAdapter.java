package com.example.starbucks.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.starbucks.Fragments.FAQFragment.Careers;
import com.example.starbucks.Fragments.FAQFragment.InOurStores;
import com.example.starbucks.Fragments.FAQFragment.MobileOrderPay;
import com.example.starbucks.Fragments.FAQFragment.Others;
import com.example.starbucks.Fragments.FAQFragment.StarbucksCard;
import com.example.starbucks.Fragments.FAQFragment.StarbucksDelivers;
import com.example.starbucks.Fragments.FAQFragment.StarbucksOnlineStore;
import com.example.starbucks.Fragments.FAQFragment.StarbucksReward;
import com.example.starbucks.Fragments.FAQFragment.eGift;

public class FAQViewPagerAdapter extends FragmentStateAdapter {

    public FAQViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new StarbucksReward();
            case 2:
                return new MobileOrderPay();
            case 3:
                return new StarbucksOnlineStore();
            case 4:
                return new StarbucksDelivers();
            case 5:
                return new eGift();
            case 6:
                return new Careers();
            case 7:
                return new InOurStores();
            case 8:
                return new Others();
            default:
                return new StarbucksCard();
        }
    }

    @Override
    public int getItemCount() {
        return 9;
    }
}
