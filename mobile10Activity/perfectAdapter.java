package com.example.mobile10;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class perfectAdapter extends BaseAdapter {
    Context context; // GridActivity


    perfectAdapter(Context c) { // GridActivity
        context = c;
    }

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
    public int getCount() {
        return posterID.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
        // 반복되는 하나의 View객체를 만들어주어야 함
//        Button button = new Button(context);
//        button.setText("버튼");
//        return button;
        View one = View.inflate(context,
                R.layout.one,
                null);
        TextView top = one.findViewById(R.id.topText);
        ImageView iv = one.findViewById(R.id.imageView4);
        iv.setImageResource(posterID[index]);
        top.setText(title[index]);
        one.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        one.setPadding(5,5,5,10);
        return one;
    }
}