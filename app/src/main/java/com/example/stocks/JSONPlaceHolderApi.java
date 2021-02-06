package com.example.stocks;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JSONPlaceHolderApi {
    @GET("/iss/engines/{engine}/markets.json")
    public Call<Post> getData(@Path("engine") String engine);

    @GET("/iss/engines/{engine}/markets/{marketName}/securities.json")
    public Call<Post2> getSecurities(@Path("engine") String engine, @Path("marketName") String marketName);

    @GET("/iss/history/engines/{engine}/markets/{market}/securities/{security}.json")
    public Call<Post3> getDataTotal(@Path("engine") String engine,@Path("market") String market,
                                    @Path("security") String security);

    @GET("/iss/history/engines/{engine}/markets/{market}/securities/{security}.json")
    public Call<Post3> getDataIntermediate(@Path("engine") String engine,@Path("market") String market,
                                    @Path("security") String security, @Query("start") int start);
}
