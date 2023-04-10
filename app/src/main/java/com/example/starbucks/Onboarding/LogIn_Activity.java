package com.example.starbucks.Onboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.starbucks.Adapter.PromotionAdapter;
import com.example.starbucks.MainActivity;
import com.example.starbucks.Model.Promotions;
import com.example.starbucks.R;
import com.example.starbucks.SpaceItemDecoration;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogIn_Activity extends AppCompatActivity {

    private TextView txtView_forgetPassword, txtView_signUp;
    private androidx.appcompat.widget.AppCompatButton btn_login, btn_facebook, btn_google;
    private RadioButton rb_keepLoggedIn;
    private androidx.recyclerview.widget.RecyclerView rv_starbucksPromotion;
    private EditText editTxt_email, editTxt_password;

    private String mEmail, mPassword;

    PromotionAdapter promotionAdapter;
    private final ArrayList<Promotions> promotionsArrayList = new ArrayList<>();

    int[] promotionPic = {R.drawable.promotion1, R.drawable.promotion2, R.drawable.promotion3};

    CallbackManager callbackManager;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_log_in);
        callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        //Lead the user to the main page
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this, gso);

        initWidget();

        initUI();

        pageDirectories();
    }

    private void pageDirectories() {

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mEmail = editTxt_email.getText().toString();
                mPassword = editTxt_password.getText().toString();

                validateEmail();
                validatePassword();
                validateInput();
            }
        });

        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginManager.getInstance().logInWithReadPermissions(LogIn_Activity.this, Arrays.asList("public_profile"));
            }
        });

        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = gsc.getSignInIntent();
                startActivityForResult(signInIntent, 1000);
            }
        });

        txtView_forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(), ForgotPassword_Activity.class));
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }

    private void validateInput() {
        if (!validateEmail() | !validatePassword())
            return;
        else {
            //Authenticate the email and password to see if it's correct
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
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

    private void initUI() {

        //init RecyclerView
        //for better performance of recyclerview.

        int spaceInPixels = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16, getResources().getDisplayMetrics());
        rv_starbucksPromotion.addItemDecoration(new SpaceItemDecoration(spaceInPixels));

        rv_starbucksPromotion.setHasFixedSize(true);

        promotionAdapter = new PromotionAdapter(getApplicationContext(), promotionsArrayList);
        rv_starbucksPromotion.setAdapter(promotionAdapter);

        //layout to contain recyclerview
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        llm.setSmoothScrollbarEnabled(true);
        // orientation of linearlayoutmanager.
        llm.setOrientation(LinearLayoutManager.HORIZONTAL);
        llm.setAutoMeasureEnabled(true);

        //set layoutmanager for recyclerview.
        rv_starbucksPromotion.setLayoutManager(llm);

        new loadPromotion().execute();
    }

    Promotions promotions;

    class loadPromotion extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected String doInBackground(String... args) {
            try {

                int promotionNumbers = 3;

                for (int i = 0 ; i < promotionNumbers; i++)
                {
                    promotions = new Promotions();

                    promotions.setPromotionPic(promotionPic[i]);

                    promotionsArrayList.add(promotions);
                    promotions = null;
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            return null;
        }

        protected void onPostExecute(String file_url) {

            if (promotionsArrayList != null && promotionsArrayList.size() > 0) {
                promotionAdapter = new PromotionAdapter(getApplicationContext(), promotionsArrayList);
                rv_starbucksPromotion.setAdapter(promotionAdapter);
                promotionAdapter.notifyDataSetChanged();
            }
        }
    }


    private void initWidget() {

        //TextView
        txtView_forgetPassword = findViewById(R.id.txtView_forgetPassword);
        txtView_signUp = findViewById(R.id.txtView_signUp);

        //Button
        btn_login = findViewById(R.id.btn_login);
        btn_facebook = findViewById(R.id.btn_facebook);
        btn_google = findViewById(R.id.btn_google);

        //RadioButton
        rb_keepLoggedIn = findViewById(R.id.rb_keepLoggedIn);

        //RecyclerView
        rv_starbucksPromotion = findViewById(R.id.rv_starbucksPromotion);

        //EditText
        editTxt_email = findViewById(R.id.editTxt_email);
        editTxt_password = findViewById(R.id.editTxt_password);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                task.getResult(ApiException.class);
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            } catch (ApiException e) {
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        }
    }
}