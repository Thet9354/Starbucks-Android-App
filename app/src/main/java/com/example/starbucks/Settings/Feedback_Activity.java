package com.example.starbucks.Settings;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.starbucks.R;

public class Feedback_Activity extends AppCompatActivity {

    private ImageView btn_back;
    private EditText editTxt_topic, editTxt_subTopic, editTxt_firstName, editTxt_lastName,
            editTxt_emailAddress, editTxt_mobileNumber, editTxt_cardNumber, editTxt_message;
    private androidx.appcompat.widget.AppCompatButton btn_submit;

    //Variables to store values
    private String topic, subTopic, firstName, lastName, emailAddress, mobileNumber, starbucksCardNumber, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        initWidget();

        pageDirectories();
    }

    private void pageDirectories() {

        editTxt_topic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View topicDialog = LayoutInflater.from(Feedback_Activity.this).inflate(R.layout.custom_topic_dialog, null);
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Feedback_Activity.this);

                alertDialog.setView(topicDialog);
                ImageView btn_close = (ImageView) topicDialog.findViewById(R.id.btn_close);
                RadioGroup rg_topics = (RadioGroup) topicDialog.findViewById(R.id.rg_topics);
                RadioButton rb_inOurStores = (RadioButton) topicDialog.findViewById(R.id.rb_inOurStores);
                RadioButton rb_mobileOrderPay = (RadioButton) topicDialog.findViewById(R.id.rb_mobileOrderPay);
                RadioButton rb_deliveryOrder = (RadioButton) topicDialog.findViewById(R.id.rb_deliveryOrder);
                RadioButton rb_starbucksCard = (RadioButton) topicDialog.findViewById(R.id.rb_starbucksCard);
                RadioButton rb_starbucksReward = (RadioButton) topicDialog.findViewById(R.id.rb_starbucksReward);
                RadioButton rb_onlineStore = (RadioButton) topicDialog.findViewById(R.id.rb_onlineStore);
                RadioButton rb_corporateSales = (RadioButton) topicDialog.findViewById(R.id.rb_corporateSales);
                RadioButton rb_generalEnquiry = (RadioButton) topicDialog.findViewById(R.id.rb_generalEnquiry);

                final AlertDialog dialog = alertDialog.create();

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                rg_topics.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId)
                        {
                            case R.id.rb_inOurStores:
                                editTxt_topic.setText(rb_inOurStores.getText().toString());
                                break;
                            case R.id.rb_mobileOrderPay:
                                editTxt_topic.setText(rb_mobileOrderPay.getText().toString());
                                break;
                            case R.id.rb_deliveryOrder:
                                editTxt_topic.setText(rb_deliveryOrder.getText().toString());
                                break;
                            case R.id.rb_starbucksCard:
                                editTxt_topic.setText(rb_starbucksCard.getText().toString());
                                break;
                            case R.id.rb_starbucksReward:
                                editTxt_topic.setText(rb_starbucksReward.getText().toString());
                                break;
                            case R.id.rb_onlineStore:
                                editTxt_topic.setText(rb_onlineStore.getText().toString());
                                break;
                            case R.id.rb_corporateSales:
                                editTxt_topic.setText(rb_corporateSales.getText().toString());
                                break;
                            case R.id.rb_generalEnquiry:
                                editTxt_topic.setText(rb_generalEnquiry.getText().toString());
                                break;
                        }
                        dialog.cancel();
                    }
                });


                btn_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
            }
        });

        editTxt_subTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View topicDialog = LayoutInflater.from(Feedback_Activity.this).inflate(R.layout.custom_subtopic_dialog, null);
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Feedback_Activity.this);

                alertDialog.setView(topicDialog);
                ImageView btn_close = (ImageView) topicDialog.findViewById(R.id.btn_close);
                RadioGroup rg_subTopics = (RadioGroup) topicDialog.findViewById(R.id.rg_subTopics);
                RadioButton rb_subTopic1 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic1);
                RadioButton rb_subTopic2 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic2);
                RadioButton rb_subTopic3 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic3);
                RadioButton rb_subTopic4 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic4);
                RadioButton rb_subTopic5 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic5);
                RadioButton rb_subTopic6 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic6);
                RadioButton rb_subTopic7 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic7);
                RadioButton rb_subTopic8 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic8);
                RadioButton rb_subTopic9 = (RadioButton) topicDialog.findViewById(R.id.rb_subTopic9);


                final AlertDialog dialog = alertDialog.create();

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

                switch (topic)
                {
                    case "In Our Store":
                        rb_subTopic9.setVisibility(View.GONE);
                        rb_subTopic1.setText("Store Environment");
                        rb_subTopic2.setText("The service I received");
                        rb_subTopic3.setText("The beverage I ordered");
                        rb_subTopic4.setText("The food I ordered");
                        rb_subTopic5.setText("Location of a store");
                        rb_subTopic6.setText("Missing or incorrect order");
                        rb_subTopic7.setText("WI-FI");
                        rb_subTopic8.setText("Others");
                        break;

                    case "Mobile order & Pay":
                        rb_subTopic9.setVisibility(View.GONE);
                        rb_subTopic8.setVisibility(View.GONE);
                        rb_subTopic7.setVisibility(View.GONE);

                        rb_subTopic1.setText("The service I received");
                        rb_subTopic2.setText("The beverage I ordered");
                        rb_subTopic3.setText("The food I ordered");
                        rb_subTopic4.setText("Missing or incorrect order");
                        rb_subTopic5.setText("Spilled or damaged food/drink");
                        rb_subTopic6.setText("Others");
                        break;

                    case "Delivery Order":
                        rb_subTopic7.setVisibility(View.GONE);
                        rb_subTopic8.setVisibility(View.GONE);
                        rb_subTopic9.setVisibility(View.GONE);

                        rb_subTopic1.setText("Delivery time");
                        rb_subTopic2.setText("Missing or incorrect order");
                        rb_subTopic3.setText("Spilled or damaged food/drink");
                        rb_subTopic4.setText("The beverage I ordered");
                        rb_subTopic5.setText("The food I ordered");
                        rb_subTopic6.setText("Others");
                        break;

                    case "Starbucks Cards":
                        rb_subTopic1.setText("Email address and/or password");
                        rb_subTopic2.setText("Lost Starbucks Card");
                        rb_subTopic3.setText("Spilled or damaged food/drink");
                        rb_subTopic4.setText("Mobile App");
                        rb_subTopic5.setText("Registering my Starbucks Card");
                        rb_subTopic6.setText("Reloading my Starbucks Card");
                        rb_subTopic7.setText("Starbucks eGift Card");
                        rb_subTopic8.setText("Transaction history of my Starbucks Card");
                        rb_subTopic9.setText("Others");
                        break;

                    case "Starbucks Rewards":
                        rb_subTopic6.setVisibility(View.GONE);
                        rb_subTopic7.setVisibility(View.GONE);
                        rb_subTopic8.setVisibility(View.GONE);
                        rb_subTopic9.setVisibility(View.GONE);

                        rb_subTopic1.setText("My Stars");
                        rb_subTopic2.setText("How does it work?");
                        rb_subTopic3.setText("Rewards and benefits");
                        rb_subTopic4.setText("Where's my Gold Card?");
                        rb_subTopic5.setText("Others");
                        break;

                    case "Starbucks Online Store":
                        rb_subTopic1.setText("Merchandise");
                        rb_subTopic2.setText("Starbucks Card eGift");
                        rb_subTopic3.setText("Drinks & Food eGift");
                        rb_subTopic4.setText("Stars and Rewards Enquiry");
                        rb_subTopic5.setText("Order Enquiry");
                        rb_subTopic6.setText("Payment Enquiry");
                        rb_subTopic7.setText("Delivery Status");
                        rb_subTopic8.setText("Refund Status");
                        rb_subTopic9.setText("Others");
                        break;

                    case "Corporate Sales":
                        rb_subTopic1.setText("Merchandise");
                        rb_subTopic2.setText("Starbucks Card eGift");
                        rb_subTopic3.setText("Drinks & Food eGift");
                        rb_subTopic4.setText("Stars and Rewards Enquiry");
                        rb_subTopic5.setText("Order Enquiry");
                        rb_subTopic6.setText("Payment Enquiry");
                        rb_subTopic7.setText("Delivery Status");
                        rb_subTopic8.setText("Refund Status");
                        rb_subTopic9.setText("Others");
                        break;
                }

                rg_subTopics.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch (checkedId)
                        {
                            case R.id.rb_inOurStores:
                                editTxt_topic.setText(rb_inOurStores.getText().toString());
                                break;
                            case R.id.rb_mobileOrderPay:
                                editTxt_topic.setText(rb_mobileOrderPay.getText().toString());
                                break;
                            case R.id.rb_deliveryOrder:
                                editTxt_topic.setText(rb_deliveryOrder.getText().toString());
                                break;
                            case R.id.rb_starbucksCard:
                                editTxt_topic.setText(rb_starbucksCard.getText().toString());
                                break;
                            case R.id.rb_starbucksReward:
                                editTxt_topic.setText(rb_starbucksReward.getText().toString());
                                break;
                            case R.id.rb_onlineStore:
                                editTxt_topic.setText(rb_onlineStore.getText().toString());
                                break;
                            case R.id.rb_corporateSales:
                                editTxt_topic.setText(rb_corporateSales.getText().toString());
                                break;
                            case R.id.rb_generalEnquiry:
                                editTxt_topic.setText(rb_generalEnquiry.getText().toString());
                                break;
                        }
                        dialog.cancel();
                    }
                });


                btn_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
            }


        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                topic = editTxt_topic.getText().toString();
                subTopic = editTxt_subTopic.getText().toString();
                firstName = editTxt_firstName.getText().toString();
                lastName = editTxt_lastName.getText().toString();
                emailAddress = editTxt_emailAddress.getText().toString();
                mobileNumber = editTxt_mobileNumber.getText().toString();
                starbucksCardNumber = editTxt_cardNumber.getText().toString();
                message = editTxt_message.getText().toString();

                topicValidation();
                subTopicValidation();
                firstNameValidation();
                lastNameValidation();
                emailAddressValidation();
                mobileNumberValidation();
                starbucksCardValidation();
                messageValidation();
                validateInput();
            }
        });
    }

    private void validateInput() {

    }

    private boolean messageValidation() {

        if (message.isEmpty())
        {
            editTxt_message.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean starbucksCardValidation() {

    }

    private boolean mobileNumberValidation() {

        if (mobileNumber.isEmpty())
        {
            editTxt_mobileNumber.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean emailAddressValidation() {

        if (emailAddress.isEmpty())
        {
            editTxt_emailAddress.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean lastNameValidation() {

        if (lastName.isEmpty())
        {
            editTxt_lastName.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean firstNameValidation() {

        if (firstName.isEmpty())
        {
            editTxt_firstName.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean subTopicValidation() {

        if (subTopic.isEmpty())
        {
            editTxt_subTopic.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean topicValidation() {

        if (topic.isEmpty())
        {
            editTxt_topic.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);

        //EditText
        editTxt_topic = findViewById(R.id.editTxt_topic);
        editTxt_subTopic = findViewById(R.id.editTxt_subTopic);
        editTxt_firstName = findViewById(R.id.editTxt_firstName);
        editTxt_lastName = findViewById(R.id.editTxt_lastName);
        editTxt_emailAddress = findViewById(R.id.editTxt_emailAddress);
        editTxt_mobileNumber = findViewById(R.id.editTxt_mobileNumber);
        editTxt_cardNumber = findViewById(R.id.editTxt_cardNumber);
        editTxt_message = findViewById(R.id.editTxt_message);

        //Button
        btn_submit = findViewById(R.id.btn_submit);

    }
}