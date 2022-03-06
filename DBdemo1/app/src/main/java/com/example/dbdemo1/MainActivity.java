package com.example.dbdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textViewdb);

        SQLiteDatabase database = openOrCreateDatabase("Database.db",MODE_PRIVATE,null);
        database.execSQL("create table if not exists sampletable( name text, location text)");
        database.execSQL("insert into sampletable values ('Vanier','Saint Laurent')");
        database.execSQL("insert into sampletable values ('Dawson','Montreal')");
        database.execSQL("insert into sampletable values ('McGill','Downtown')");
        Cursor cursor = database.rawQuery("select * from sampletable",null);
        cursor.moveToFirst();
        String name = cursor.getString(0);
        String location = cursor.getString(1);
        txt.setText(name + " " + location + "\n");
        cursor.moveToNext();
        String name1 = cursor.getString(0);
        String location1 = cursor.getString(1);
        txt.setText(name1 + " " + location1 + "\n");
        cursor.moveToLast();
        String name2 = cursor.getString(0);
        String location2 = cursor.getString(1);
        txt.setText(name2 + " " + location2);



    }
}