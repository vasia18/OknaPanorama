package com.example.oknapanorama;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SliderActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SliderAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        viewPager = (ViewPager)findViewById(R.id.v);
        myadapter = new SliderAdapter(this);
        viewPager.setAdapter(myadapter);

    }
}
