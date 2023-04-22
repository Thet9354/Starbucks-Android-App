package com.example.starbucks.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.starbucks.Adapter.ForYouAdapter;
import com.example.starbucks.Adapter.NewsAdapter;
import com.example.starbucks.Adapter.PromotionAdapter;
import com.example.starbucks.Model.ForYou;
import com.example.starbucks.Model.News;
import com.example.starbucks.Model.Promotions;
import com.example.starbucks.Onboarding.LogIn_Activity;
import com.example.starbucks.R;
import com.example.starbucks.Settings.FAQs_Activity;
import com.example.starbucks.Settings.Feedback_Activity;
import com.example.starbucks.Settings.PersonalInformation_Activity;
import com.example.starbucks.Settings.Preferences_Activity;
import com.example.starbucks.Settings.PrivacyPolicy_Activity;
import com.example.starbucks.Settings.Security_Activity;
import com.example.starbucks.Settings.TOU_Activity;
import com.example.starbucks.SpaceItemDecoration;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class Home extends Fragment {

    private ImageView btn_notification, btn_filter, imgView_accName, imgView_starbucksCard, imgView_instagram, imgView_facebook, imgView_pinterest, imgView_twitter;
    private TextView txtView_accName, txtView_greenCardLevel, txtView_greenCurrentPoints, txtView_goldCardLevel, txtView_currentGoldPoint;
    private RelativeLayout rel_greenRewardCard, rel_goldRewardCard;
    private ProgressBar pb_greenRewardPoints, pb_goldRewardPoints;
    private androidx.recyclerview.widget.RecyclerView rv_forYou, rv_news;

    private androidx.drawerlayout.widget.DrawerLayout drawer_Layout;
    private com.google.android.material.navigation.NavigationView nav_view;
    private Context mContext;

    ForYouAdapter forYouAdapter;

    NewsAdapter newsAdapter;

    private final ArrayList<ForYou> forYouArrayList = new ArrayList<>();
    private final ArrayList<News> newsArrayList = new ArrayList<>();

    int[] forYouPic = {R.drawable.artinacup, R.drawable.pistachio_christmas_tree};
    int[] newsPic = {R.drawable.teavana, R.drawable.bts_starbucks, R.drawable.christmas_starbucks};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        mContext = getActivity();

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews(view);
    }

    private void findViews(View v) {

        //ImageView
        btn_notification = v.findViewById(R.id.btn_notification);
        btn_filter = v.findViewById(R.id.btn_filter);
        imgView_accName = v.findViewById(R.id.imgView_accName);
        imgView_starbucksCard = v.findViewById(R.id.imgView_starbucksCard);
        imgView_instagram = v.findViewById(R.id.imgView_instagram);
        imgView_facebook = v.findViewById(R.id.imgView_facebook);
        imgView_pinterest = v.findViewById(R.id.imgView_pinterest);
        imgView_twitter = v.findViewById(R.id.imgView_twitter);


        //TextView
        txtView_accName = v.findViewById(R.id.txtView_accName);
        txtView_greenCardLevel = v.findViewById(R.id.txtView_greenCardLevel);
        txtView_greenCurrentPoints = v.findViewById(R.id.txtView_greenCurrentPoints);
        txtView_goldCardLevel = v.findViewById(R.id.txtView_goldCardLevel);
        txtView_currentGoldPoint = v.findViewById(R.id.txtView_currentGoldPoint);

        //RelativeLayout
        rel_greenRewardCard = v.findViewById(R.id.rel_greenRewardCard);
        rel_goldRewardCard = v.findViewById(R.id.rel_goldRewardCard);

        //ProgressBar
        pb_greenRewardPoints = v.findViewById(R.id.pb_greenRewardPoints);
        pb_goldRewardPoints = v.findViewById(R.id.pb_goldRewardPoints);

        //androidx.recyclerview.widget.RecyclerView
        rv_forYou = v.findViewById(R.id.rv_forYou);
        rv_news = v.findViewById(R.id.rv_news);

        //DrawerLayout
        drawer_Layout = v.findViewById(R.id.drawer_Layout);

        //com.google.android.material.navigation.NavigationView
        nav_view = v.findViewById(R.id.nav_view);


        initUI();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer_Layout.openDrawer(GravityCompat.END);
            }
        });

        drawer_Layout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.nav_personalInformation:
                        startActivity(new Intent(mContext, PersonalInformation_Activity.class));
                        break;

                    case R.id.nav_preference:
                        startActivity(new Intent(mContext, Preferences_Activity.class));
                        break;

                    case R.id.nav_security:
                        startActivity(new Intent(mContext, Security_Activity.class));
                        break;

                    case R.id.nav_faq:
                        startActivity(new Intent(mContext, FAQs_Activity.class));
                        break;

                    case R.id.nav_feedback:
                        startActivity(new Intent(mContext, Feedback_Activity.class));
                        break;

                    case R.id.nav_tou:
                        startActivity(new Intent(mContext, TOU_Activity.class));
                        break;

                    case R.id.nav_privacyPolicy:
                        startActivity(new Intent(mContext, PrivacyPolicy_Activity.class));
                        break;

                    case R.id.nav_logOut:
                        Intent intent = new Intent();
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                        break;
                }

                return true;
            }
        });



        imgView_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the Instagram site
                String url = "https://www.instagram.com/starbucks/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imgView_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the Facebook site
                String url = "https://www.facebook.com/Starbucks/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imgView_pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the Pinterest site
                String url = "https://www.pinterest.com/starbucks/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        imgView_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the Twitter site
                String url = "https://twitter.com/starbucks?s=21&t=6c8RiYh82mZ938rtJFWIow";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


    }



    private void initUI() {

        initNavView();

        initRecViewForYou();

        initRecViewNews();
    }

    private void initNavView() {

        nav_view.bringToFront();

        initHeaderView();

    }

    private void initHeaderView() {

        View headerView = nav_view.getHeaderView(0);

        ImageView btn_close = headerView.findViewById(R.id.btn_close);
        de.hdodenhof.circleimageview.CircleImageView imgView_accName = headerView.findViewById(R.id.imgView_accName);
        TextView txtView_accName = headerView.findViewById(R.id.txtView_accName);
        TextView txtView_accEmail = headerView.findViewById(R.id.txtView_accEmail);
        com.google.android.material.switchmaterial.SwitchMaterial switch_notification = headerView.findViewById(R.id.switch_notification);

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer_Layout.closeDrawer(GravityCompat.END);
            }
        });
    }

    private void initRecViewNews() {

        //TODO: Initialize the recView for news
        int spaceInPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5, getResources().getDisplayMetrics());
        rv_news.addItemDecoration(new SpaceItemDecoration(spaceInPixels));

        rv_news.setHasFixedSize(true);

        newsAdapter = new NewsAdapter(mContext, newsArrayList);
        rv_news.setAdapter(newsAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_news.setLayoutManager(llm);

        new loadNews().execute();
    }

    private void initRecViewForYou() {

        //init RecyclerView
        //for better performance of recyclerview.

        int spaceInPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources().getDisplayMetrics());
        rv_forYou.addItemDecoration(new SpaceItemDecoration(spaceInPixels));

        rv_forYou.setHasFixedSize(true);

        forYouAdapter = new ForYouAdapter(mContext, forYouArrayList);
        rv_forYou.setAdapter(forYouAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(mContext);
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_forYou.setLayoutManager(llm);

        new loadForYou().execute();
    }

    ForYou forYou;
    News news;

    class loadNews extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                String[] newsCaption = getResources().getStringArray(R.array.news_caption);


                for (int i = 0 ; i < newsCaption.length; i++)
                {
                    news = new News();

                    news.setNewsCaption(newsCaption[i]);
                    news.setNewsImage(newsPic[i]);

                    newsArrayList.add(news);
                    news = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (newsArrayList != null && newsArrayList.size() > 0) {
                newsAdapter = new NewsAdapter(mContext, newsArrayList);
                rv_news.setAdapter(newsAdapter);
                newsAdapter.notifyDataSetChanged();
            }
        }
    }

    class loadForYou extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                String[] forYouCaption = getResources().getStringArray(R.array.forYou_caption);


                for (int i = 0 ; i < forYouCaption.length; i++)
                {
                    forYou = new ForYou();

                    forYou.setCaption(forYouCaption[i]);
                    forYou.setImage(forYouPic[i]);

                    forYouArrayList.add(forYou);
                    forYou = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (forYouArrayList != null && forYouArrayList.size() > 0) {
                forYouAdapter = new ForYouAdapter(mContext, forYouArrayList);
                rv_forYou.setAdapter(forYouAdapter);
                forYouAdapter.notifyDataSetChanged();
            }
        }
    }
}