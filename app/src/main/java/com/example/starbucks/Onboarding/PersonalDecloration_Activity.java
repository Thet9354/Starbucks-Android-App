package com.example.starbucks.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.starbucks.R;

public class PersonalDecloration_Activity extends AppCompatActivity {

    private ImageView btn_back;
    private TextView txtView_next, txtView_termsOfUse;
    private androidx.appcompat.widget.AppCompatButton btn_countryCode, btn_joinNow;
    private RadioButton rb_termsAndCondition;
    private EditText editTxt_date, editTxt_month, editTxt_address, editTxt_city, editTxt_district, editTxt_ward, editTxt_mobile;

    Intent intent;

    private String mEmail, mPassword, mCardNumber, mSecurityCode, mSalutation, mFirstName, mLastName;
    private String mDate, mMonth, mAddress, mCity, mDistrict, mWard, mMobileNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_decloration);
        intent = getIntent();

        initWidget();

        getIntentData();

        pageDirectories();
    }

    private void getIntentData() {

        mEmail = intent.getStringExtra("Email");
        mPassword = intent.getStringExtra("Password");
        mCardNumber = intent.getStringExtra("Card Number");
        mSecurityCode = intent.getStringExtra("Security Code");
        mSalutation = intent.getStringExtra("Salutation");
        mFirstName = intent.getStringExtra("First Name");
        mLastName = intent.getStringExtra("Last Name");

    }

    private void pageDirectories() {

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        rb_termsAndCondition.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    //Save the data in db that this user agrees
                }
                else
                {
                    //else do otherwise
                }
            }
        });

        txtView_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validateDate();
                validateMonth();
                validateAddress();
                validateCity();
                validateDistrict();
                validateWard();
                validateMobileNumber();

                validateInput();
            }
        });
    }

    private void validateInput() {
        if (!validateDate() | !validateMonth() | !validateAddress() | !validateCity() | !validateDistrict() | !validateWard() | !validateMobileNumber())
            return;
        else
        {
            addData();
        }
    }

    private void addData() {
        //TODO: Add the user data into firebase and move on to the next page
        startActivity(new Intent(getApplicationContext(), RegistrationFinish_Activity.class));
    }

    private boolean validateMobileNumber() {
        if (mMobileNumber.isEmpty())
        {
            editTxt_mobile.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean validateWard() {
        if (mWard.isEmpty())
        {
            editTxt_ward.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean validateDistrict() {
        if (mDistrict.isEmpty())
        {
            editTxt_district.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean validateCity() {
        if (mCity.isEmpty())
        {
            editTxt_city.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean validateAddress() {
        if (mAddress.isEmpty())
        {
            editTxt_address.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean validateMonth() {

        if (mMonth.isEmpty())
        {
            editTxt_month.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean validateDate() {

        if (mDate.isEmpty())
        {
            editTxt_date.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);

        //TextView
        txtView_next = findViewById(R.id.txtView_next);
        txtView_termsOfUse = findViewById(R.id.txtView_termsOfUse);

        //Button
        btn_countryCode = findViewById(R.id.btn_countryCode);
        btn_joinNow = findViewById(R.id.btn_joinNow);

        //RadioButton
        rb_termsAndCondition = findViewById(R.id.rb_termsAndCondition);

        //EditText
        editTxt_date = findViewById(R.id.editTxt_date);
        editTxt_month = findViewById(R.id.editTxt_month);
        editTxt_address = findViewById(R.id.editTxt_address);
        editTxt_city = findViewById(R.id.editTxt_city);
        editTxt_district = findViewById(R.id.editTxt_district);
        editTxt_ward = findViewById(R.id.editTxt_ward);
        editTxt_mobile = findViewById(R.id.editTxt_mobile);

    }
}