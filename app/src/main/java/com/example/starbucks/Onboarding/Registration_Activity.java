package com.example.starbucks.Onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.starbucks.R;

import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration_Activity extends AppCompatActivity {

    private ImageView btn_back;
    private TextView txtView_next;
    private EditText editTxt_email, editTxt_password, editTxt_confirmPassword, editTxt_cardNumber, editTxt_securityCode, editTxt_salutation, editTxt_firstName, editTxt_lastName;

    private String mEmail, mPassword, mConfirmPassword, mCardNumber, mSecurityCode, mSalutation, mFirstName, mLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        initWidget();

        pageDirectories();
    }

    private void pageDirectories() {

        txtView_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEmail = editTxt_email.getText().toString();
                mPassword = editTxt_password.getText().toString();
                mConfirmPassword = editTxt_confirmPassword.getText().toString();
                mCardNumber = editTxt_cardNumber.getText().toString();
                mSecurityCode = editTxt_securityCode.getText().toString();
                mSalutation = editTxt_salutation.getText().toString();
                mFirstName = editTxt_firstName.getText().toString();
                mLastName = editTxt_lastName.getText().toString();

                validateEmail();
                validatePassword();
                validateConfirmPassword();
                validateCardNumber();
                validateSecurityCode();
                validateSalutation();
                validateFirstName();
                validateLastName();

                validateInput();
            }
        });
    }

    private void validateInput() {
        if (!validateEmail() | !validatePassword() | !validateConfirmPassword() | !validateCardNumber() | !validateSecurityCode() | !validateSalutation() | !validateFirstName() | !validateLastName())
            return;
        else
        {
            // Carry over data to the next page
            Intent intent = new Intent(getApplicationContext(), PersonalDecloration_Activity.class);
            intent.putExtra("Email", mEmail);
            intent.putExtra("Password", mPassword);
            intent.putExtra("Card Number", mCardNumber);
            intent.putExtra("Security Code", mSecurityCode);
            intent.putExtra("Salutation", mSalutation);
            intent.putExtra("First Name", mFirstName);
            intent.putExtra("Last Name", mLastName);
            startActivity(intent);

        }
    }

    private boolean validateLastName() {
        Pattern lastNamePattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = lastNamePattern.matcher(mLastName);

        if (mLastName.isEmpty())
        {
            editTxt_firstName.setError("Field cannot be empty in order to proceed");
            return false;
        }
        else if (!matcher.matches())
        {
            editTxt_password.setError("Invalid last name");
            return false;
        }
        else
            return true;
    }

    private boolean validateFirstName() {
        Pattern firstNamePattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = firstNamePattern.matcher(mFirstName);

        if (mFirstName.isEmpty())
        {
            editTxt_firstName.setError("Field cannot be empty in order to proceed");
            return false;
        }
        else if (!matcher.matches())
        {
            editTxt_password.setError("Invalid first name");
            return false;
        }
        else
            return true;
    }

    private boolean validateSalutation() {
        if (mSalutation.isEmpty())
        {
            editTxt_salutation.setError("Field cannot be empty in order to proceed");
            return false;
        }
        else if (mSalutation.equals("Mr") | mSalutation.equals("Mrs"))
        {
            return true;
        }
        else
        {
            editTxt_salutation.setError("Invalid salutation");
            return false;
        }
    }

    private boolean validateSecurityCode() {
        if (mSecurityCode.isEmpty())
        {
            editTxt_securityCode.setError("Field cannot be empty to proceed");
            return false;
        }
        else if (mSecurityCode.length() > 3 || mSecurityCode.length() < 1)
        {
            editTxt_securityCode.setError("Field cannot be empty to proceed");
            return false;
        }
        else
        {
            editTxt_securityCode.setError(null);
            return true;
        }
    }

    private boolean validateCardNumber() {
        if (mCardNumber.isEmpty())
        {
            editTxt_cardNumber.setError("Field cannot be empty to proceed");
            return false;
        }
        else
            return true;
    }

    private boolean validateConfirmPassword() {
        if (mConfirmPassword.isEmpty())
        {
            editTxt_confirmPassword.setError("Field cannot be empty to proceed");
            return false;
        }
        else if (!mConfirmPassword.equals(mPassword))
        {
            editTxt_confirmPassword.setError("Input entered is not the same as the password above");
            return false;
        }
        else
            return true;
    }

    private boolean validatePassword() {
        //Regex pattern to require alphanumeric and special characters
        Pattern regexPassword = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
        Matcher matcher = regexPassword.matcher(mPassword);

        if (mPassword.isEmpty())
        {
            editTxt_password.setError("Required");
            return false;
        }
        else if (!matcher.matches())
        {
            editTxt_password.setError("Your password's not strong enough");
            return false;
        }
        else
            return true;
    }

    private boolean validateEmail() {
        if (mEmail.isEmpty())
        {
            editTxt_email.setError("Field can not be empty");
            return false;
        }

        // Matching the input email to a predefined email pattern
        else if (!Patterns.EMAIL_ADDRESS.matcher(mEmail).matches())
        {
            editTxt_email.setError("Please enter a valid email address");
            return false;
        }
        else
        {
            editTxt_email.setError(null);
            return true;
        }
    }

    private void initWidget() {

        //ImageView
        btn_back = findViewById(R.id.btn_back);

        //TextView
        txtView_next = findViewById(R.id.txtView_next);

        //EditText
        editTxt_email = findViewById(R.id.editTxt_email);
        editTxt_password = findViewById(R.id.editTxt_password);
        editTxt_confirmPassword = findViewById(R.id.editTxt_confirmPassword);
        editTxt_cardNumber = findViewById(R.id.editTxt_cardNumber);
        editTxt_securityCode = findViewById(R.id.editTxt_securityCode);
        editTxt_salutation = findViewById(R.id.editTxt_salutation);
        editTxt_firstName = findViewById(R.id.editTxt_firstName);
        editTxt_lastName = findViewById(R.id.editTxt_lastName);
    }
}