package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.Previous7Days;
import com.example.starbucks.R;

import java.util.ArrayList;

public class Previous7DaysAdapter extends RecyclerView.Adapter<Previous7DaysAdapter.CardViewHolder>{

    private ArrayList<Previous7Days> previous7DaysArrayList;
    private Context mContext;

    public Previous7DaysAdapter(Context mContext, ArrayList<Previous7Days> previous7DaysArrayList) {
        this.previous7DaysArrayList = previous7DaysArrayList;
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private Previous7DaysAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(Previous7DaysAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public Previous7DaysAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_history, parent, false);

        return new Previous7DaysAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Previous7DaysAdapter.CardViewHolder holder, int position) {

        holder.txtView_type.setText(previous7DaysArrayList.get(position).getType());
        holder.txtView_cost.setText(previous7DaysArrayList.get(position).getCost());
        holder.txtView_date.setText(previous7DaysArrayList.get(position).getDate());
        holder.imgView_historyType.setImageResource(previous7DaysArrayList.get(position).getTypeImage());
        holder.btn_rewards.setText(previous7DaysArrayList.get(position).getRewardPoints());
    }

    @Override
    public int getItemCount() {
        return previous7DaysArrayList.size();
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
