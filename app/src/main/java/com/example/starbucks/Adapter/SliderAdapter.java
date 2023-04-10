package com.example.starbucks.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.starbucks.R;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public  int[] slide_images = {

            R.drawable.beans_and_cups,
            R.drawable.frappucino,
            R.drawable.tropical_splash_logo
    };

    public  int[] progress_image = {

            R.drawable.onboarding_progress1,
            R.drawable.onboarding_porgress2,
            R.drawable.onboarding_progress3
    };

    public String[] slide_heading1 = {

            "Good Coffee",
            "Starbucks Frappuccino",
            "Morning begins with"
    };

    public String[] slide_heading2 = {

            "Good Moods",
            "work can wait",
            "Tropical Splash Starbucks"
    };

    public String[] slide_subHeading = {

            "“To inspire and nurture the human spirit–one \nperson, one cup and one neighborhood at a time.”",
            "“Bring a friend and enjoy a Frappuccino. \n" +
                    "Find stores in your area.”",
            "“Bring the Fantasy Tail Frappuccino, or treat yourself \nto the boldly refreshing Peach Cloud with Jelly. “"
    };


    @Override
    public int getCount() {
        return slide_heading1.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView imgView_logo = view.findViewById(R.id.imgView_logo);
        ImageView imgView_progressBar = view.findViewById(R.id.imgView_progressBar);

        TextView txtView_heading1 = view.findViewById(R.id.txtView_heading1);
        TextView txtView_heading2 = view.findViewById(R.id.txtView_heading2);
        TextView txtView_subheading = view.findViewById(R.id.txtView_subheading);

        imgView_logo.setImageResource(slide_images[position]);
        imgView_progressBar.setImageResource(progress_image[position]);

        txtView_heading1.setText(slide_heading1[position]);
        txtView_heading2.setText(slide_heading2[position]);
        txtView_subheading.setText(slide_subHeading[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((LinearLayout)object);
    }
}
