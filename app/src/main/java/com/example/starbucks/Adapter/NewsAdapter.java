package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.News;
import com.example.starbucks.Model.Promotions;
import com.example.starbucks.R;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.CardViewHolder>{

    private ArrayList<News> newsArrayList;
    private Context mContext;

    public NewsAdapter(Context mContext, ArrayList<News> newsArrayList) {
        this.newsArrayList = newsArrayList;
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private NewsAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(NewsAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public NewsAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_news, parent, false);

        return new NewsAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.CardViewHolder holder, int position) {

        holder.imgView_news.setImageResource(newsArrayList.get(position).getNewsImage());
        holder.txtView_news.setText(newsArrayList.get(position).getNewsCaption());

    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout ll_news;
        private ImageView imgView_news;
        private TextView txtView_news;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            ll_news = itemView.findViewById(R.id.ll_news);
            imgView_news = itemView.findViewById(R.id.imgView_news);
            txtView_news = itemView.findViewById(R.id.txtView_news);

        }
    }
}
