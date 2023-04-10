package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.Yesterday;
import com.example.starbucks.R;

import java.util.ArrayList;

public class YesterdayAdapter extends RecyclerView.Adapter<YesterdayAdapter.CardViewHolder>{

    private ArrayList<Yesterday> yesterdayArrayList;
    private Context mContext;

    public YesterdayAdapter(Context mContext, ArrayList<Yesterday> yesterdayArrayList) {
        this.yesterdayArrayList = yesterdayArrayList;
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private YesterdayAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(YesterdayAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public YesterdayAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_history, parent, false);

        return new YesterdayAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull YesterdayAdapter.CardViewHolder holder, int position) {

        holder.txtView_type.setText(yesterdayArrayList.get(position).getType());
        holder.txtView_cost.setText(yesterdayArrayList.get(position).getCost());
        holder.txtView_date.setText(yesterdayArrayList.get(position).getDate());
        holder.imgView_historyType.setImageResource(yesterdayArrayList.get(position).getTypeImage());
        holder.btn_rewards.setText(yesterdayArrayList.get(position).getRewardPoints());
    }

    @Override
    public int getItemCount() {
        return yesterdayArrayList.size();
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
