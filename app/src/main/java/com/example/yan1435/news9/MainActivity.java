package com.example.yan1435.news9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.yan1435.news9.api.ApiBuilder;
import com.example.yan1435.news9.model.Ebook;
import com.example.yan1435.news9.model.Ebooks;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Ebook> itemEbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ApiBuilder api = new ApiBuilder();


        api.getEbooks(new Callback<Ebooks>() {
            @Override
            public void onResponse(Call<Ebooks> call, Response<Ebooks> response) {
                if (response.isSuccessful()){
                    itemEbook = response.body().getEbooks();
                    Log.d("msg",itemEbook.get(0).getTitle());
                }
            }

            @Override
            public void onFailure(Call<Ebooks> call, Throwable t) {
                Log.d("msg","error on failure");
                Toast.makeText(MainActivity.this,"error on failure", Toast.LENGTH_LONG).show();
            }
        });
    }
}
