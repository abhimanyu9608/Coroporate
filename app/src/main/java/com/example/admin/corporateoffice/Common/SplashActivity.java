package com.example.admin.corporateoffice.Common;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.admin.corporateoffice.Account.LoginActivity;
import com.example.admin.corporateoffice.R;


public class SplashActivity extends AppCompatActivity {
        private static int SPLASH_TIME_OUT = 3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_activity);
            TextView tvproduction= (TextView)findViewById(R.id.tv_production);
            Typeface face_prodction=Typeface.createFromAsset(getAssets(),"fonts/Lato-Regular.ttf");
            tvproduction.setTypeface(face_prodction);

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(i);

                    finish();
                }
            }, SPLASH_TIME_OUT);
        }

    }