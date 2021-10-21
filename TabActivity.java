package com.example.mobile10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);


        // 어디에 분리 시켜놓은 layout 파일을 넣을지 결정!
        LinearLayout layout1 = findViewById(R.id.tabSong);
        LinearLayout layout2 = findViewById(R.id.tabArtist);
        LinearLayout layout3 = findViewById(R.id.tabAlbum);

        //분리 시켜놓은 xml 파일(layout) 들을 객체화 시키자.!!
        //inflation

        View songView = View.inflate(TabActivity.this, R.layout.song,null);
        View artView = View.inflate(TabActivity.this, R.layout.art,null);
        View albumView = View.inflate(TabActivity.this, R.layout.album,null);

        layout1.addView(songView);
        layout2.addView(artView);
        layout3.addView(albumView);

        Button btnChange = songView.findViewById(R.id.btnChange);

        ImageView imageView = songView.findViewById(R.id.iv01);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView.setImageResource(R.drawable.star3);

            }
        });

        Button btnChange2 = artView.findViewById(R.id.btnChange2);

        ImageView imageView2 = artView.findViewById(R.id.iv02);

        TextView textView2 = artView.findViewById(R.id.text02);

        TextView textView3 = songView.findViewById(R.id.text01);

        btnChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView2.setImageResource(R.drawable.star1);
                textView2.setText("나는 진지하다규");


            }
        });

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup(); //기초적인 tab 초기화

        //각 탭 마다의 설정을 넣음

        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("홈");
        tabSpecSong.setContent(R.id.tabSong);
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("카테고리");
        tabSpecArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("레시피");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);


        tabHost.setCurrentTab(0);


    }
}