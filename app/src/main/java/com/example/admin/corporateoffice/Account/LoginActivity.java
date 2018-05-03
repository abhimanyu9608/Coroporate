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

public class LoginActivity extends AppCompatActivity {
    private EditText edemail,edpasword;
    private TextView tvsignin,tvaccount,tvfb;
    private Typeface typeface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edemail=(EditText)findViewById(R.id.ed_email);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        edemail.setTypeface(typeface);
        edpasword=(EditText)findViewById(R.id.ed_password);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        edpasword.setTypeface(typeface);

        tvsignin=(TextView)findViewById(R.id.tv_signin);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        tvsignin.setTypeface(typeface);
        tvsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeintent =new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(homeintent);
            }
        });

        tvaccount=(TextView)findViewById(R.id.tv_account);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        tvaccount.setTypeface(typeface);
        tvaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inaccount =new Intent(getApplicationContext(),SignUpActivity.class);
                startActivity(inaccount);
            }
        });
        
        tvfb=(TextView)findViewById(R.id.tv_fb);
        typeface =Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
        tvfb.setTypeface(typeface);






    }
}
