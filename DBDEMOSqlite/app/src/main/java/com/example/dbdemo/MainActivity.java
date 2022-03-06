package com.example.dbdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DataBaseHelper myDb;
    EditText editname, editSurname,editMarks, editID;
    Button btnAdd, btnView, btnUpdate, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DataBaseHelper(this);
        editname = findViewById(R.id.editTextTextPersonName2);
        editSurname = findViewById(R.id.editTextTextPersonName);
        editMarks = findViewById(R.id.editTextTextPersonName3);
        editID = findViewById(R.id.editTextTextPersonName4);

        btnAdd = findViewById(R.id.button);
        btnUpdate = findViewById(R.id.button3);
        btnDelete = findViewById(R.id.button4);
        btnView = findViewById(R.id.button2);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               boolean isInserted = myDb.insertData(editSurname.getText().toString(),
                       editname.getText().toString(),editMarks.getText().toString());
               if(isInserted == true)
                   Toast.makeText(MainActivity.this,
                           "Data Inserted successfully", Toast.LENGTH_SHORT).show();
               else
                   Toast.makeText(MainActivity.this,
                           "Data not Inserted ", Toast.LENGTH_SHORT).show();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isUpdate = myDb.update(editID.getText().toString(),editname.getText().toString(),
                        editSurname.getText().toString(),editMarks.getText().toString());
                if(isUpdate == true)
                    Toast.makeText(MainActivity.this,
                            "Data updated successfully", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,
                            "Data not updated ", Toast.LENGTH_SHORT).show();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deleterows = myDb.deleteData(editID.getText().toString());
                if(deleterows > 0)
                    Toast.makeText(MainActivity.this,
                            "Data deleted successfully", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,
                            "Data not deleted ", Toast.LENGTH_SHORT).show();
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cursor res = myDb.getALlData();
                if(res.getCount() ==0){
                    showMessage ("error", "Nothing found");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()) {
                    buffer.append("ID : " + res.getString(0) + "\n");
                    buffer.append("Name : " + res.getString(1) + "\n");
                    buffer.append("Sname : " + res.getString(2) + "\n");
                    buffer.append("Marks : " + res.getString(3) + "\n");


                }

                //show all data
                showMessage ("Data", buffer.toString());

            }
        });
    }

    private void showMessage(String data, String toString) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(data);
        builder.setCancelable(true);
        builder.setMessage(toString);
        builder.show();


    }
}