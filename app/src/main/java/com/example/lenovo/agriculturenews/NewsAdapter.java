package com.example.lenovo.agriculturenews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 9/20/2016.
 */
public class NewsAdapter extends ArrayAdapter {

    List list=new ArrayList();

    static class DataHandler{
        ImageView image;
        TextView headline;
        TextView date;
    }

    public NewsAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        DataHandler handler;
        row=convertView;
        if (convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.custom_layout,parent,false);
            handler=new DataHandler();
            handler.image=(ImageView)row.findViewById(R.id.image);
            handler.headline=(TextView)row.findViewById(R.id.text);
            handler.date=(TextView)row.findViewById(R.id.date);
            row.setTag(handler);

        }
        else
        {
            handler=(DataHandler)row.getTag();
        }

        DataProvider dataProvider;
        dataProvider =(DataProvider) this.getItem(position);
        handler.image.setImageResource(dataProvider.getImage());
        handler.headline.setText(dataProvider.getHeadline());
        handler.date.setText(dataProvider.getDate());




        return row;}


    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }
}
