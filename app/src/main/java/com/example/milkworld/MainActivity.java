package com.example.milkworld;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager)findViewById(R.id.vp_slidingImg);
        ImageAdapter img_adpter = new ImageAdapter(this);
        viewPager.setAdapter(img_adpter);
    }
}
