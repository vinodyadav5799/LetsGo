package com.honeywell.mobility.letsgo.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.honeywell.mobility.letsgo.ui.NewMainActivity;
import com.honeywell.mobility.letsgo.R;

public class MainActivity extends AppCompatActivity {

    public String TAG = "MainActivity";

    CallbackManager callbackManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FacebookSdk.sdkInitialize(getApplicationContext());
        //Log.d("AppLog", "key:" + FacebookSdk.getApplicationSignature(this)+"=");

        callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = (LoginButton)findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                startActivity(new Intent(MainActivity.this, NewMainActivity.class));
                finish();
                // App code
            }
            @Override
            public void onCancel() {
                // App code
            }
            @Override
            public void onError(FacebookException exception) {
                Log.d(TAG, exception.getMessage());
                // App code
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}