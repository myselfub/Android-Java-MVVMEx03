package com.example.mvvmex03.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mvvmex03.R;

public class ScreenSlidePageFragment extends Fragment {

    int contentLayoutId;

    public ScreenSlidePageFragment() {
    }

    public ScreenSlidePageFragment(int contentLayoutId) {
        super(contentLayoutId);
        this.contentLayoutId = contentLayoutId;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = null;
        if (contentLayoutId == 0) {
            rootView = (ViewGroup) inflater.inflate(R.layout.activity_main, container, false);
            ScrollView scrollView = (ScrollView) rootView.findViewById(R.id.content);
            scrollView.setBackgroundResource(R.drawable.screen01);
        } else if (contentLayoutId == 1) {
            rootView = (ViewGroup) inflater.inflate(R.layout.activity_main, container, false);
            ScrollView scrollView = (ScrollView) rootView.findViewById(R.id.content);
            scrollView.setBackgroundResource(R.drawable.screen02);
//            scrollView.setBackgroundColor(Color.rgb(255, 0, 0));
        } else if (contentLayoutId == 2) {
            rootView = (ViewGroup) inflater.inflate(R.layout.activity_main, container, false);
            ScrollView scrollView = (ScrollView) rootView.findViewById(R.id.content);
            scrollView.setBackgroundResource(R.drawable.screen02);
//            scrollView.setBackgroundColor(Color.rgb(0, 255, 0));
        } else {
            rootView = (ViewGroup) inflater.inflate(R.layout.activity_main, container, false);
            ScrollView scrollView = (ScrollView) rootView.findViewById(R.id.content);
            scrollView.setBackgroundResource(R.drawable.screen02);
//            scrollView.setBackgroundColor(Color.rgb(0, 0, 255));
        }
        return rootView;
    }

}