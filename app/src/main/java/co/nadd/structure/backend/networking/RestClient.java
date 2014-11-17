package co.nadd.structure.backend.networking;

import android.content.Context;

import com.google.gson.Gson;

import co.nadd.structure.R;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by Javier on 11/17/14.
 * RESTful Client
 */
public class RestClient {

    private DummyEndpoint dummyEndpoint;
    public RestClient(Context context){
        //TODO: Change Base_url resource string
        String BASE_URL = context.getString(R.string.base_url);
        Gson gson = new Gson();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_URL)
                .setConverter(new GsonConverter(gson))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        dummyEndpoint = restAdapter.create(DummyEndpoint.class);
        //TODO: Instantiate the endpoints
    }

    //TODO: Create getters for the endpoints
    public DummyEndpoint getDummyEndpoint(){
        return dummyEndpoint;
    }
}
