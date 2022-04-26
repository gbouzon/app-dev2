package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private  static  final String TAG = "Mainactivity";

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);
    }

    public void GetTodos(View view) {

        Call<List<ToDoClass>> call = apiInterface.getTodos();
        call.enqueue(new Callback<List<ToDoClass>>() {
            @Override
            public void onResponse(Call<List<ToDoClass>> call, Response<List<ToDoClass>> response) {
                Log.e(TAG, "OnResponse:  " + response.body());
            }

            @Override
            public void onFailure(Call<List<ToDoClass>> call, Throwable t) {

                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());

            }
        });



    }

    public void GetTodosID(View view) {

        Call<ToDoClass> toDoClassCall = apiInterface.getTodo(3);
        toDoClassCall.enqueue(new Callback<ToDoClass>() {
            @Override
            public void onResponse(Call<ToDoClass> call, Response<ToDoClass> response) {
                Log.e(TAG, "OnResponse:  " + response.body());
            }

            @Override
            public void onFailure(Call<ToDoClass> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());
            }
        });
    }

    public void GetTodosUserId(View view) {

        Call<List<ToDoClass>> listCall = apiInterface.getTodosUsingQuery(3, false);
        listCall.enqueue(new Callback<List<ToDoClass>>() {
            @Override
            public void onResponse(Call<List<ToDoClass>> call, Response<List<ToDoClass>> response) {
                Log.e(TAG, "OnResponse:  " + response.body());
            }

            @Override
            public void onFailure(Call<List<ToDoClass>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());
            }
        });
    }

    public void PostTodo(View view) {

        ToDoClass toDoClass = new ToDoClass(1234,1000,"Get me Chocolate", true);
        Call<ToDoClass> toDoClassCall = apiInterface.postTodo(toDoClass);
        toDoClassCall.enqueue(new Callback<ToDoClass>() {
            @Override
            public void onResponse(Call<ToDoClass> call, Response<ToDoClass> response) {
                Log.e(TAG, "OnResponse:  " + response.body());
            }

            @Override
            public void onFailure(Call<ToDoClass> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage());
            }
        });
    }
}