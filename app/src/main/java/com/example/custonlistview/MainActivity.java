package com.example.custonlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView list = findViewById(R.id.list);

        ArrayList<PlayerData> arrayList = new ArrayList<PlayerData>();
        arrayList.add(new PlayerData("Virat",  "Kohli", "Batman", "https://www.letuspublish.com/wp-content/uploads/2017/04/Virat-Kohli-wallpaper.jpg" ,31,"INDIA"));
        arrayList.add(new PlayerData("Rohit","Sharma" , "Batman", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ9nqRckXsouuy76b_gPU5zwmo-GhWSpdPddoWLBg6nbi-5_UJ3&usqp=CAU", 32,"INDIA"));
        arrayList.add(new PlayerData("Mahendra Singh","Dhoni" , "Wicket keeper", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTOcXy9vMRHoDVdZA0zQhB6yLPwy1d4jmmETMOohM1cKJJ18lZH&usqp=CAU" , 38,"INDIA"));
        arrayList.add(new PlayerData("Hardik" , "pandey","All-rounder", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSjN4VNBhdUPVpUyTlgAnDiDHsMXYe1QJHKiQMY7A3zhDTS3RBt&usqp=CAU", 24,"INDIA"));
        arrayList.add(new PlayerData("Rishab","Pant","Wicket keeper", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT47pZWXeTbvUQQi6NTVw4FFVFXxb2rMkwgAa8IdcSGqQVLDUxF&usqp=CAU", 20, "INDIA"));
        arrayList.add(new PlayerData("Ravindra", "Jadejae", "All-rounder", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcS6YvgK7jZV899RlexTLcCMQek8HHpdrkqqHzf1TQ3LnGEH2bWt&usqp=CAU", 23,"INDIA"));
        arrayList.add(new PlayerData("Dinesh", "Karthik", "Bowler", "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTf4SU5V8-BFzdINA8ZbyT65CW10Msr69xsHJRz-oSdGzcYk-hx&usqp=CAU",30,"INDIA"));
        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        list.setAdapter(customAdapter);
    }
}