package com.honeywell.mobility.letsgo.ui.rides;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.honeywell.mobility.letsgo.R;

public class RideHistoryFragment extends Fragment {

    private RideHistoryViewModel rideHistoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        rideHistoryViewModel =
                new ViewModelProvider(this).get(RideHistoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ride, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        rideHistoryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}