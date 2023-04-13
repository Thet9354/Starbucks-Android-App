package com.example.starbucks.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.R;

public class OrderGridAdapter extends BaseAdapter {

    Context context;
    String[] orderName;
    int[] orderImage;

    LayoutInflater inflater;

    public OrderGridAdapter(Context context, String[] orderName, int[] orderImage) {
        this.context = context;
        this.orderName = orderName;
        this.orderImage = orderImage;
    }

    @Override
    public int getCount() {
        return orderName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater)  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.order_grid_item, null);

        ImageView imgView_order = convertView.findViewById(R.id.imgView_order);
        TextView txtView_order = convertView.findViewById(R.id.txtView_order);

        imgView_order.setImageResource(orderImage[position]);
        txtView_order.setText(orderName[position]);

        return convertView;
    }
}
