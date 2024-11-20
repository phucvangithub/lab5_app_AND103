package fpoly.md19304.lab05_and103.services;


import java.util.ArrayList;

import fpoly.md19304.lab05_and103.model.Distributor;
import fpoly.md19304.lab05_and103.model.Response;
import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiServices {
    public static String BASE_URL = "http://192.168.1.2:3000/api/";

    @GET("get-list-distributor")
        Call<Response<ArrayList<Distributor>>> getListDistributor();

    @GET("search-distributor")
        Call<Response<ArrayList<Distributor>>> searchDistributor(@Query("key") String key);

    @POST("add-distributor")
    Call<Response<ArrayList<Distributor>>> addDistributor(@Body Distributor distributor);

    @PUT("update-distributor-by-id/{id}")
    Call<Response<ArrayList<Distributor>>> updateDistributor(@Path("id") String id,@Body Distributor distributor);

    @DELETE("destroy-distributor-by-id/{id}")
    Call<Response<ArrayList<Distributor>>> deleteDistributor(@Path("id") String id);

}


