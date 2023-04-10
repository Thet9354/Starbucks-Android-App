package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.CardDetails;
import com.example.starbucks.Model.Promotions;
import com.example.starbucks.R;

import java.util.ArrayList;

public class CardDetailAdapter extends RecyclerView.Adapter<CardDetailAdapter.CardViewHolder>{

    private ArrayList<CardDetails> cardDetailsArrayList;

    private Context mContext;

    public CardDetailAdapter(Context mContext, ArrayList<CardDetails> cardDetailsArrayList) {
        this.cardDetailsArrayList = cardDetailsArrayList;
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private CardDetailAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(CardDetailAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public CardDetailAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_carddetails, parent, false);

        return new CardDetailAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardDetailAdapter.CardViewHolder holder, int position) {

        holder.imgView_cardDetails.setImageResource(cardDetailsArrayList.get(position).getCardPic());

    }

    @Override
    public int getItemCount() {
        return cardDetailsArrayList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private androidx.cardview.widget.CardView cv_cardDetails;

        private ImageView imgView_cardDetails;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            cv_cardDetails = itemView.findViewById(R.id.cv_cardDetails);

            imgView_cardDetails = itemView.findViewById(R.id.imgView_cardDetails);
        }
    }
}
