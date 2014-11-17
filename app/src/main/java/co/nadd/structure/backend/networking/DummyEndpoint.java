package co.nadd.structure.backend.networking;

import co.nadd.structure.backend.model.Dummy;
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
