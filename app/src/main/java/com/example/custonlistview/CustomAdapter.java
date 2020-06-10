package com.example.custonlistview;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


class CustomAdapter implements ListAdapter {
    ArrayList<PlayerData> arrayList;
    Context context;
    public CustomAdapter(Context context, ArrayList<PlayerData> arrayList) {
        this.arrayList=arrayList;
        this.context=context;
    }
    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }
    @Override
    public boolean isEnabled(int position) {
        return true;
    }
    @Override
    public void registerDataSetObserver(DataSetObserver observer) {
    }
    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public boolean hasStableIds() {
        return false;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final PlayerData playerData=arrayList.get(position);
        if(convertView==null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView=layoutInflater.inflate(R.layout.list_row, null);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent  intent = new Intent(context , PlayerDetailsActivity.class);
                    intent.putExtra("name" , playerData.getFistName() + " "+ playerData.getLastname()) ;
                    intent.putExtra("image" , playerData.getImage()) ;
                    intent.putExtra("age" , playerData.getAge()) ;
                    intent.putExtra("country" , playerData.getCountry()) ;
                    context.startActivity(intent);
                }
            });
            TextView tittle=convertView.findViewById(R.id.txt_name);
            TextView type = convertView.findViewById(R.id.txt_type);
            ImageView img=convertView.findViewById(R.id.img);
            type.setText(playerData.getType());
            tittle.setText("" + playerData.getFistName() + " "+ playerData.getLastname());
            Picasso.with(context)
                    .load(playerData.getImage())
                    .into(img);
        }
        return convertView;
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public int getViewTypeCount() {
        return arrayList.size();
    }
    @Override
    public boolean isEmpty() {
        return false;
    }
}