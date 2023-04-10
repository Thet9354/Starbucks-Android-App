package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.Promotions;
import com.example.starbucks.R;

import java.util.ArrayList;

public class PromotionAdapter extends RecyclerView.Adapter<PromotionAdapter.CardViewHolder>{

    private final ArrayList<Promotions> promotionsArrayList;
    private final Context mContext;

    public PromotionAdapter(Context mContext, ArrayList<Promotions> promotionsArrayList) {
        this.mContext = mContext;
        this.promotionsArrayList = promotionsArrayList;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private PromotionAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(PromotionAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public PromotionAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_article, parent, false);

        return new PromotionAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PromotionAdapter.CardViewHolder holder, int position) {

        holder.imgView_promotion.setImageResource(promotionsArrayList.get(position).getPromotionPic());

    }

    @Override
    public int getItemCount() {
        return promotionsArrayList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private final androidx.cardview.widget.CardView cv_promotion;

        private final ImageView imgView_promotion;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            cv_promotion = itemView.findViewById(R.id.cv_promotion);

            imgView_promotion = itemView.findViewById(R.id.imgView_promotion);
        }
    }
}
