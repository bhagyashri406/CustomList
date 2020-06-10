package com.example.custonlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PlayerDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        ImageView imageView = (ImageView)findViewById(R.id.img) ;
        TextView txt_age = (TextView)findViewById(R.id.txt_age) ;
        TextView txt_country = (TextView)findViewById(R.id.txt_country) ;
        TextView txt_name = (TextView)findViewById(R.id.txt_name) ;


        Intent intent = getIntent() ;
        String name =  intent.getStringExtra("name");
        String country =  intent.getStringExtra("country");
        int age = intent.getIntExtra("age" ,0);
        String image = intent.getStringExtra("image") ;


        txt_age.setText(txt_age.getText().toString() + age);
        txt_country.setText(txt_country.getText().toString() +country);
        txt_name.setText(txt_name.getText().toString() +name);
        Picasso.with(this)
                .load(image)
                .into(imageView);



    }
}