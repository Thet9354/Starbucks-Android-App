package com.example.starbucks.Order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.R;

public class Siren_Order_Activity extends AppCompatActivity {

    private ImageView btn_back, imgView_order, imgView_plus, imgView_minus, imgView_hot, imgView_cold, imgView_short, imgView_tall, imgView_grande, imgView_venti;
    private TextView txtView_orderName, txtView_orderDesc, txtView_seeMore, txtView_orderCost, txtView_orderQuantity, txtView_hot, txtView_cold, txtView_order_size_short,
            txtView_order_size_tall, txtView_order_size_grande, txtView_order_size_venti, txtView_addToCart, txtView_orderNow;

    int orderQuantity = 0;

    Intent intent;

    //Variables to store data
    private String orderName, orderCost, totalCost, orderTemp, orderSize;

    private int orderPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siren_order);
        intent = getIntent();

        initWidget();

        getTransferredIntentData();

        initUI();

        pageDirectories();
    }

    private void getTransferredIntentData() {

        orderName = intent.getStringExtra("Order Name");
        orderCost = intent.getStringExtra("Order Cost");
        orderPic = intent.getIntExtra("Order Pic", 0);

    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        imgView_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                increaseCounter(v);
                imgView_minus.setClickable(true);
            }
        });

        imgView_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (orderQuantity == 0)
                    imgView_minus.setClickable(false);
                else
                    decreaseCounter(v);
            }
        });

        txtView_cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView_cold.setVisibility(View.GONE);
                txtView_hot.setVisibility(View.VISIBLE);

                imgView_cold.setVisibility(View.VISIBLE);
                imgView_hot.setVisibility(View.GONE);

                orderTemp = "Cold";
            }
        });

        txtView_hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView_cold.setVisibility(View.VISIBLE);
                txtView_hot.setVisibility(View.GONE);

                imgView_cold.setVisibility(View.GONE);
                imgView_hot.setVisibility(View.VISIBLE);

                orderTemp = "Hot";
            }
        });

        txtView_order_size_short.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView_order_size_short.setVisibility(View.GONE);
                txtView_order_size_tall.setVisibility(View.VISIBLE);
                txtView_order_size_grande.setVisibility(View.VISIBLE);
                txtView_order_size_venti.setVisibility(View.VISIBLE);

                imgView_short.setVisibility(View.VISIBLE);
                imgView_tall.setVisibility(View.GONE);
                imgView_grande.setVisibility(View.GONE);
                imgView_venti.setVisibility(View.GONE);

                orderSize = "Short";
            }
        });

        txtView_order_size_tall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView_order_size_short.setVisibility(View.VISIBLE);
                txtView_order_size_tall.setVisibility(View.GONE);
                txtView_order_size_grande.setVisibility(View.VISIBLE);
                txtView_order_size_venti.setVisibility(View.VISIBLE);

                imgView_short.setVisibility(View.GONE);
                imgView_tall.setVisibility(View.VISIBLE);
                imgView_grande.setVisibility(View.GONE);
                imgView_venti.setVisibility(View.GONE);

                orderSize = "Tall";
            }
        });

        txtView_order_size_grande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView_order_size_short.setVisibility(View.VISIBLE);
                txtView_order_size_tall.setVisibility(View.VISIBLE);
                txtView_order_size_grande.setVisibility(View.GONE);
                txtView_order_size_venti.setVisibility(View.VISIBLE);

                imgView_short.setVisibility(View.GONE);
                imgView_tall.setVisibility(View.GONE);
                imgView_grande.setVisibility(View.VISIBLE);
                imgView_venti.setVisibility(View.GONE);

                orderSize = "Grande";
            }
        });

        txtView_order_size_venti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView_order_size_short.setVisibility(View.VISIBLE);
                txtView_order_size_tall.setVisibility(View.VISIBLE);
                txtView_order_size_grande.setVisibility(View.VISIBLE);
                txtView_order_size_venti.setVisibility(View.GONE);

                imgView_short.setVisibility(View.GONE);
                imgView_tall.setVisibility(View.GONE);
                imgView_grande.setVisibility(View.GONE);
                imgView_venti.setVisibility(View.VISIBLE);

                orderSize = "Venti";
            }
        });

        txtView_addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Add the item to the cart section
            }
        });

        txtView_orderNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent paymentIntent = new Intent(getApplicationContext(), Payment_Activity.class);
                intent.putExtra("Order Name", orderName);
                intent.putExtra("Order Quantity", orderQuantity);
                intent.putExtra("Order Cost", totalCost);
                intent.putExtra("Order Pic", orderPic);
                intent.putExtra("Order Temp", orderTemp);
                intent.putExtra("Order Size", orderSize);

                startActivity(paymentIntent);
            }
        });
    }

    private void decreaseCounter(View v) {
        orderQuantity = orderQuantity - 1;
        update();
    }

    private void increaseCounter(View v) {
        orderQuantity = orderQuantity + 1;

        update();
    }

    private void update() {

        displayCost(orderQuantity);
        display(orderQuantity);
    }

    private void displayCost(int orderQuantity) {
        float cost = Float.parseFloat(orderCost) * orderQuantity;
        totalCost = String.format("%.2f", cost);
        txtView_orderCost.setText("$" + totalCost);
    }

    private void display(int number) {
        txtView_orderQuantity.setText("" + number);
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);
        imgView_order = findViewById(R.id.imgView_order);
        imgView_plus = findViewById(R.id.imgView_plus);
        imgView_minus = findViewById(R.id.imgView_minus);
        imgView_hot = findViewById(R.id.imgView_hot);
        imgView_cold = findViewById(R.id.imgView_cold);
        imgView_short = findViewById(R.id.imgView_short);
        imgView_tall = findViewById(R.id.imgView_tall);
        imgView_grande = findViewById(R.id.imgView_grande);
        imgView_venti = findViewById(R.id.imgView_venti);

        //TextView
        txtView_orderName = findViewById(R.id.txtView_orderName);
        txtView_orderDesc = findViewById(R.id.txtView_orderDesc);
        txtView_seeMore = findViewById(R.id.txtView_seeMore);
        txtView_orderCost = findViewById(R.id.txtView_orderCost);
        txtView_orderQuantity = findViewById(R.id.txtView_orderQuantity);
        txtView_hot = findViewById(R.id.txtView_hot);
        txtView_cold = findViewById(R.id.txtView_cold);
        txtView_order_size_short = findViewById(R.id.txtView_order_size_short);
        txtView_order_size_tall = findViewById(R.id.txtView_order_size_tall);
        txtView_order_size_grande = findViewById(R.id.txtView_order_size_grande);
        txtView_order_size_venti = findViewById(R.id.txtView_order_size_venti);
        txtView_addToCart = findViewById(R.id.txtView_addToCart);
        txtView_orderNow = findViewById(R.id.txtView_orderNow);

    }

    private void initUI() {

        txtView_orderName.setText(orderName);
        txtView_orderCost.setText( "$" + orderCost);
        imgView_order.setImageResource(orderPic);
    }
}