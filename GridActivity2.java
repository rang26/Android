package com.example.mobile10;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridActivity2 extends AppCompatActivity {
    int[] like = new int[9]; //좋아요 개수 넣을 수 있음.
    int[] posterID = {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9
    };

    String[] title = {
            "그림1",
            "그림2",
            "그림3",
            "그림4",
            "그림5",
            "그림6",
            "그림7",
            "그림8",
            "그림9"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher_background);
        setTitle("그리드뷰 영화 포스");
        //그리드 뷰에, 데이터들을 넣어보자.!
        //그리드 뷰
        GridView gv = findViewById(R.id.gridView1);


        //데이터들
//        MyGridAdapter gridAdapter = new MyGridAdapter(this);
//        gv.setAdapter(gridAdapter);
        perfectAdapter perfectAdapter = new perfectAdapter(this);
        gv.setAdapter(perfectAdapter);


        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                //like[index]++;
                //Toast.makeText(getApplicationContext(), like[index] + "표 좋아요 획득!! ", Toast.LENGTH_SHORT).show();
                View one2 = View.inflate(getApplicationContext(), R.layout.one2, null);
                ImageView topiv =  one2.findViewById(R.id.topImageView);
                EditText num = one2.findViewById(R.id.likenum);
                Button likebutton = one2.findViewById(R.id.likebutton);
                AlertDialog.Builder builder = new AlertDialog.Builder(GridActivity2.this);
                builder.setView(one2);
                topiv.setImageResource(posterID[index]);
                builder.setTitle("영화 상세 페이지.");
                builder.setPositiveButton("확인.", null);
                builder.show();
                likebutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //입력한 숫자를 가지고 와서, 해당 인덱스의 값과 더한 후, 다시 넣어주세요.
                        //해당 인덱스의 값이 증가했는지 띄워주세요.
                    }
                });
            }
        });
    }

    //기본 adapter는 arraylist, array의 데이터를 순서대로 넣어주는 기능만 있음.
    //데이터 하나 하나의 배치모양을 내가 정해서 어댑팅할 수 있음.
}