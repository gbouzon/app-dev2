package com.example.dbdemo2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "sqliteSampleDB.db";
    private static final int DB_VERSION = 1;

    public DatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlArtists = "Create table artists (id integer primary key autoincrement, name varchar);";
        sqLiteDatabase.execSQL(sqlArtists);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sqlArtists = "Drop table if exists artists";
        sqLiteDatabase.execSQL(sqlArtists);
        onCreate(sqLiteDatabase);

    }

    public boolean addArtists(String name) {

        SQLiteDatabase database = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        database.insert("artists",null,contentValues);
        database.close();
        return true;


    }
}
