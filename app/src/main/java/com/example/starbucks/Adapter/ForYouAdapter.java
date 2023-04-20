package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starbucks.Model.ForYou;
import com.example.starbucks.Model.Promotions;
import com.example.starbucks.R;

import java.util.ArrayList;

public class ForYouAdapter extends RecyclerView.Adapter<ForYouAdapter.CardViewHolder>{

    private ArrayList<ForYou> forYouArrayList;
    private Context mContext;

    public ForYouAdapter(Context mContext, ArrayList<ForYou> forYouArrayList) {
        this.forYouArrayList = forYouArrayList;
        this.mContext = mContext;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private ForYouAdapter.OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(ForYouAdapter.OnItemClickListener listener) {
        this.mItemClickListener = listener;
    }

    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }

    @NonNull
    @Override
    public ForYouAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_foryou, parent, false);

        return new ForYouAdapter.CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ForYouAdapter.CardViewHolder holder, int position) {

        holder.imgView_forYou.setImageResource(forYouArrayList.get(position).getImage());
        holder.txtView_forYou.setText(forYouArrayList.get(position).getCaption());

    }

    @Override
    public int getItemCount() {
        return forYouArrayList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private androidx.cardview.widget.CardView cv_forYou;
        private ImageView imgView_forYou;
        private TextView txtView_forYou;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            cv_forYou = itemView.findViewById(R.id.cv_forYou);

            imgView_forYou = itemView.findViewById(R.id.imgView_forYou);

            txtView_forYou =itemView.findViewById(R.id.txtView_forYou);

        }
    }
}
