package com.honeywell.mobility.letsgo.ui.rides;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RideHistoryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RideHistoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}