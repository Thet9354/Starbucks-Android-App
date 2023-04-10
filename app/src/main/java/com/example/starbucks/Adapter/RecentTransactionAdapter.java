package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.Promotions;
import com.example.starbucks.Model.RecentTransaction;
import com.example.starbucks.R;

import java.util.ArrayList;

public class RecentTransactionAdapter extends RecyclerView.Adapter<RecentTransactionAdapter.CardViewHolder>{

    private ArrayList<RecentTransaction> recentTransactionArrayList;
    private Context mContext;

    public RecentTransactionAdapter(Context mContext, ArrayList<RecentTransaction> recentTransactionArrayList) {
        this.recentTransactionArrayList = recentTransactionArrayList;
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private RecentTransactionAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(RecentTransactionAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public RecentTransactionAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_recenttransaction, parent, false);

        return new RecentTransactionAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentTransactionAdapter.CardViewHolder holder, int position) {

        holder.txtView_orderName.setText(recentTransactionArrayList.get(position).getOrderName());
        holder.txtView_orderPrice.setText(recentTransactionArrayList.get(position).getOrderAmount());
        holder.txtView_orderDate.setText(recentTransactionArrayList.get(position).getOrderDate());
        holder.imgView_order.setImageResource(recentTransactionArrayList.get(position).getOrderImage());

    }

    @Override
    public int getItemCount() {
        return recentTransactionArrayList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private androidx.cardview.widget.CardView cv_recentTransaction;
        private ImageView imgView_order;
        private TextView txtView_orderName, txtView_orderDate, txtView_orderPrice;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            cv_recentTransaction = itemView.findViewById(R.id.cv_recentTransaction);

            imgView_order = itemView.findViewById(R.id.imgView_order);

            txtView_orderName = itemView.findViewById(R.id.txtView_orderName);
            txtView_orderDate = itemView.findViewById(R.id.txtView_orderDate);
            txtView_orderPrice = itemView.findViewById(R.id.txtView_orderPrice);

        }
    }
}
