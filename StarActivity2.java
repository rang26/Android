package com.example.mobile10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class StarActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star2);

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup(); //기초적인 tab 초기화

        //각 탭 마다의 설정을 넣음

        TabHost.TabSpec tab01 = tabHost.newTabSpec("tab01").setIndicator("홈");
        tab01.setContent(R.id.tab01);
        tabHost.addTab(tab01);

        TabHost.TabSpec tab02 = tabHost.newTabSpec("tab02").setIndicator("카테고리");
        tab02.setContent(R.id.tab02);
        tabHost.addTab(tab02);

        TabHost.TabSpec tab03 = tabHost.newTabSpec("tab03").setIndicator("선물함");
        tab03.setContent(R.id.tab03);
        tabHost.addTab(tab03);


        tabHost.setCurrentTab(0);
    }
}