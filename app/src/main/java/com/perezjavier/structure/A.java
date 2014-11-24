package com.perezjavier.structure;

import android.app.Application;

import com.perezjavier.structure.backend.networking.DummyEndpoint;
import com.perezjavier.structure.backend.networking.RestClient;

/**
 * Created by Javier on 11/17/14.
 * Application class
 */
public class A extends Application {

    private static A app;
    private static RestClient client;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        client = new RestClient(this);
    }

    public static DummyEndpoint getDummyEndpoint(){
        return client.getDummyEndpoint();
    }
}
