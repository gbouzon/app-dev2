package com.example.countryfetchingasync;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ProgressDialog progressDialog;

    ListView lv;

    private static String url = "https://cdn.jsdelivr.net/gh/arpitmandliya/AndroidRestJSONExample@master/countries.json";

    ArrayList<HashMap<String, String>> contactlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactlist = new ArrayList<>();
        lv = findViewById(R.id.list);
        new GetContacts().execute();
    }
    // Async class to get JSON by making HTTP server connection

    class GetContacts extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("please wait .....");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            HttpHandler sh = new HttpHandler();
            //making a request to URL and getting response
              String jsonStr = sh.makeServiceCall(url);

              if(jsonStr != null) {
                  try {
                      JSONArray contacts = new JSONArray(jsonStr);
                      for (int i = 0; i < contacts.length(); i++) {
                          JSONObject c = contacts.getJSONObject(i);
                          String id = c.getString("id");
                          String countryName = c.getString("countryName");
                          HashMap<String, String> contact = new HashMap<>();
                          contact.put("id", id);
                          contact.put("countryName", countryName);
                          contactlist.add(contact);
                      }

                  } catch (Exception e) {}
              }
        return null;
        }

        @Override
        protected void onPostExecute(Void unused) {
            super.onPostExecute(unused);

            if(progressDialog.isShowing())
                progressDialog.dismiss();

            ListAdapter adapter = new SimpleAdapter(MainActivity.this, contactlist,
                    R.layout.row_item, new String[] {"id","countryName"},
                    new int[] {R.id.textView, R.id.textView2});
            lv.setAdapter(adapter);
        }
    }


}