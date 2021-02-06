package com.example.mvvmex03.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmex03.models.model.User;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    MutableLiveData<ArrayList<User>> userLiveData;
    ArrayList<User> userArrayList;

    public MainViewModel() {
        userLiveData = new MutableLiveData<>();

        // call your Rest API in init method
        init();
    }

    public MutableLiveData<ArrayList<User>> getUserMutableLiveData() {
        return userLiveData;
    }

    public void init() {
        populateList();
        userLiveData.setValue(userArrayList);
    }

    public void populateList() {
        userArrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            User user = new User();
            user.setTitle(i + "번째");
            user.setDescription("김유빈");
            userArrayList.add(user);
        }
    }
}