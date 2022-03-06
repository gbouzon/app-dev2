package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] listViewTitle = new String[] {
            "Cake","Lion","Cake","Lion","Cake","Lion","Cake","Lion"
    };

    String[] listViewDescription = new String[] {
            "Birthday Cake","King of Jungle","Birthday Cake","King of Forest",
              "Birthday Cake","King of Forest","Birthday Cake","King of Forest"};

    int[] listViewImage = new int[] {
            R.drawable.cake,R.drawable.lion,R.drawable.cake,R.drawable.lion,
            R.drawable.cake,R.drawable.lion,R.drawable.cake,R.drawable.lion
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.list_view);
        List<HashMap<String,String>> hm = new ArrayList<HashMap<String,String>>();

        for (int i =0; i < 8; i++) {
            HashMap<String,String> list = new HashMap<String,String>();
            list.put("list_view_title",listViewTitle[i]);
            list.put("list_view_description",listViewDescription[i]);
            list.put("list_view_image", Integer.toString(listViewImage[i]));
            hm.add(list);
        }
       String[] from = {"list_view_title","list_view_description","list_view_image"};
        int[] to = {R.id.textView, R.id.textView2, R.id.imageView};

        SimpleAdapter  simpleAdapter = new SimpleAdapter(getApplicationContext(),hm,R.layout.child_layout,from, to);
        lv.setAdapter(simpleAdapter);

    }
}