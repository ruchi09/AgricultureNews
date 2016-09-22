package com.example.lenovo.agriculturenews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    NewsAdapter adapter;
    int [] images={R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news8,R.drawable.news9,R.drawable.news10,R.drawable.news11};
    String [] date;
    String [] headline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        date=getResources().getStringArray(R.array.Date);
        headline=getResources().getStringArray(R.array.Headline);
        adapter=new NewsAdapter(getApplicationContext(),R.layout.custom_layout);
        listView.setAdapter(adapter);
        int i=0;
        for(String d:date)
        {
            DataProvider dataProvider =new DataProvider(images[i],d,headline[i]);
            adapter.add(dataProvider);
            i++;

        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getApplicationContext(),Content.class);
                intent.putExtra("pos",position);
                startActivity(intent);
            }
        });

    }
}
