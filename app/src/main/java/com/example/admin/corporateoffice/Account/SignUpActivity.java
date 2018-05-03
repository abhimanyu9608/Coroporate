package com.example.admin.corporateoffice.Account;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.corporateoffice.Common.HomeActivity;
import com.example.admin.corporateoffice.R;

public class SignUpActivity extends AppCompatActivity {
    private EditText edemail,edpasword,edusername;
    private TextView tvaccount,tvfb;
    private Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edemail=(EditText)findViewById(R.id.ed_email);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        edemail.setTypeface(typeface);
        edusername=(EditText)findViewById(R.id.ed_user);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        edusername.setTypeface(typeface);
        edpasword=(EditText)findViewById(R.id.ed_password);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        edpasword.setTypeface(typeface);



        tvaccount=(TextView)findViewById(R.id.tv_account);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        tvaccount.setTypeface(typeface);
        tvaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeintent =new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(homeintent);
            }
        });
        tvfb=(TextView)findViewById(R.id.tv_fb);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        tvfb.setTypeface(typeface);
    }
}
