package com.example.akash.retrofitdemo;


import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    @GET("api/?inc=name,email,picture&results=20")
    Call<Model> getData();
}
