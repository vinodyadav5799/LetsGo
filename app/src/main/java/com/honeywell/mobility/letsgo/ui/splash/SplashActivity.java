package com.honeywell.mobility.letsgo.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.facebook.AccessToken;
import com.facebook.Profile;
import com.honeywell.mobility.letsgo.R;
import com.honeywell.mobility.letsgo.ui.NewMainActivity;
import com.honeywell.mobility.letsgo.ui.auth.MainActivity;

public class SplashActivity extends AppCompatActivity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(Profile.getCurrentProfile() != null && AccessToken.getCurrentAccessToken() != null){
                    startActivity(new Intent(SplashActivity.this, NewMainActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}