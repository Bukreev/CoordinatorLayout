package com.bukreevei.coordinatorlayout.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.bukreevei.coordinatorlayout.MainActivity;
import com.bukreevei.coordinatorlayout.R;


public class MainView extends FrameLayout {

    public MainView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.main_view, this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        MainActivity activity = (MainActivity) context;
        activity.setSupportActionBar(toolbar);

    }


}
