package com.honeywell.mobility.letsgo.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.facebook.CallbackManager;
import com.honeywell.mobility.letsgo.ui.auth.MainActivity;

public class ProfileFragment extends Fragment {

    public String TAG = "ProfileFragment";
    private ProfileViewModel profileViewModel;
    CallbackManager callbackManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        startActivity(new Intent(getActivity(), MainActivity.class));
        /*
        profileViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        FacebookSdk.sdkInitialize(getActivity());
        //Log.d("AppLog", "key:" + FacebookSdk.getApplicationSignature(this)+"=");

        callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = (LoginButton)root.findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                startActivity(new Intent(getActivity(), NewMainActivity.class));
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
        */
        return null;
    }

}