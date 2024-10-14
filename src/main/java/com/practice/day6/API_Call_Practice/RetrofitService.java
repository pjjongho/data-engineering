package com.practice.day6.API_Call_Practice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("/api/users/")
    Call<Object> retrofitTest(@Query("page") int page);
}
