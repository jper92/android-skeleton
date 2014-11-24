package com.perezjavier.structure.backend.networking;

import com.perezjavier.structure.backend.model.Dummy;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Javier on 11/17/14.
 * Dummy endpoint
 */
public interface DummyEndpoint {

    @GET("/")
    public void get(Callback<Dummy> callback);



}
