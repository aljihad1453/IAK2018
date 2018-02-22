package com.example.yan1435.news9.api;

import com.example.yan1435.news9.model.Ebook;
import com.example.yan1435.news9.model.Ebooks;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yan1435 on 09/01/18.
 */

public interface ApiService {

    @GET("oreilly/v1/ebook")
    Call<Ebooks> getBooksList();

    @GET("oreilly/v1/ebook")
    Call<Ebook> getBook();

}
