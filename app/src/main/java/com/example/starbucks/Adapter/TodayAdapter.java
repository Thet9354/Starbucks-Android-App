package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.Today;
import com.example.starbucks.R;

import java.util.ArrayList;

public class TodayAdapter extends RecyclerView.Adapter<TodayAdapter.CardViewHolder>{

    private ArrayList<Today> todayArrayList;
    private Context mContext;

    public TodayAdapter(Context mContext, ArrayList<Today> todayArrayList) {
        this.todayArrayList = todayArrayList;
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private TodayAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(TodayAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public TodayAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_history, parent, false);

        return new TodayAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TodayAdapter.CardViewHolder holder, int position) {

        holder.txtView_type.setText(todayArrayList.get(position).getType());
        holder.txtView_cost.setText(todayArrayList.get(position).getCost());
        holder.txtView_date.setText(todayArrayList.get(position).getDate());
        holder.imgView_historyType.setImageResource(todayArrayList.get(position).getTypeImage());
        holder.btn_rewards.setText(todayArrayList.get(position).getRewardPoints());

    }

    @Override
    public int getItemCount() {
        return todayArrayList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgView_historyType;
        private androidx.appcompat.widget.AppCompatButton btn_rewards;
        private TextView txtView_type, txtView_date, txtView_cost;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imgView_historyType = itemView.findViewById(R.id.imgView_historyType);

            btn_rewards = itemView.findViewById(R.id.btn_rewards);

            txtView_type = itemView.findViewById(R.id.txtView_type);
            txtView_date = itemView.findViewById(R.id.txtView_date);
            txtView_cost = itemView.findViewById(R.id.txtView_cost);
        }
    }
}
