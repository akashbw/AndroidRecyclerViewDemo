package com.example.akash.retrofitdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.finalList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        APIInterface apiService = APIClient.getClient().create(APIInterface.class);
        Call<Model> call = apiService.getData();
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                List<Result> results = response.body().getResults();
                recyclerView.setAdapter(new RVAdaptor(context, results));
            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
            }
        });
    }
}
