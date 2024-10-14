package com.practice.day6.API_Call_Practice;

import retrofit2.Call;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Call <Object> retrofitTest = RetrofitClient
                .getApi()
                .retrofitTest(2);


        try {
            System.out.println(retrofitTest.execute().body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
