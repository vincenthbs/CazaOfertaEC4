package com.example.cazaofertaec4.ui.contacus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContacusViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ContacusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is profile fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}