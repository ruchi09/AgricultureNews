package com.example.lenovo.agriculturenews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Content extends AppCompatActivity {
    TextView t1,t2;
    ImageView i;

    String  [] head;
    String [] date;
    int [] images={R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news8,R.drawable.news9,R.drawable.news10,R.drawable.news11};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        head=getResources().getStringArray(R.array.Headline);
        date=getResources().getStringArray(R.array.Date);

        int pos;

        Intent intent = getIntent();
        pos = intent.getIntExtra("pos", 0);


        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);

        i=(ImageView)findViewById(R.id.imageView);

         t1.setText(head[pos]);
         t2.setText(date[pos]);
         i.setImageResource(images[pos]);


    }
}
