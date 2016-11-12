package barclay.codetask.com.codetask.remote;

import java.util.Map;

import barclay.codetask.com.codetask.model.ResponseData;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by Nirmesh on 11/10/2016.
 */

public interface ItunesServiceAPI {


    String base_url = "https://itunes.apple.com";

    @GET("/search")
    Call<ResponseData> getDetails(
            @QueryMap Map<String, String> data);


    class Factory {
        private static ItunesServiceAPI service;

        public static ItunesServiceAPI getInstance() {
            if (service == null) {
                Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(base_url)
                        .build();
                service = retrofit.create(ItunesServiceAPI.class);

                return service;
            } else {
                return service;
            }

        }

    }
}