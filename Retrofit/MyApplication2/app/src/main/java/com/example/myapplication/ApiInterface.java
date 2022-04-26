package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {


    @GET("/todos")
    Call<List<ToDoClass>> getTodos();

    @GET("/todos/{id}")
    Call<ToDoClass> getTodo(@Path("id") int id);

    @GET("/todos")
    Call<List<ToDoClass>> getTodosUsingQuery (@Query("userId") int userId, @Query("completed") boolean completed);

    @POST("/todos")
    Call<ToDoClass> postTodo (@Body ToDoClass toDo);




}
