package com.example.yan1435.news9.api;

import com.example.yan1435.news9.model.Ebook;
import com.example.yan1435.news9.model.Ebooks;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yan1435 on 09/01/18.
 */

@SuppressWarnings("DefaultFileTemplate")
public class ApiBuilder {

    private final Retrofit retrofit;

    public ApiBuilder() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(ApiUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient());

        retrofit = builder.build();

//        retrofit = new Retrofit.Builder()
//                .baseUrl(ApiUrl.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
    }

    private OkHttpClient getClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        return builder.build();
    }

    private ApiService getApiClient() {
        return retrofit.create(ApiService.class);
    }

    public void getEbooks(Callback<Ebooks> callback) {
        Call<Ebooks> apiCall = getApiClient().getBooksList();
        apiCall.enqueue(callback);
    }

    public void getEbook(Callback<Ebook> callback) {
        Call<Ebook> apiCall = getApiClient().getBook();
        apiCall.enqueue(callback);
    }

}
