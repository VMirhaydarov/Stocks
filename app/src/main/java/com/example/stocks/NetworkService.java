package com.example.stocks;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    public static NetworkService nsInstance;

    public static final String BASE_URL = "https://iss.moex.com";
    Retrofit mRetrofit;

    public NetworkService() {
        mRetrofit = new Retrofit.Builder().
                baseUrl(BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build();
    }

    public static NetworkService getInstance() {
        if(nsInstance == null)
            nsInstance = new NetworkService();

            return nsInstance;
    }

    public JSONPlaceHolderApi getJsonApi(){
        return mRetrofit.create(JSONPlaceHolderApi.class);
    }
}
