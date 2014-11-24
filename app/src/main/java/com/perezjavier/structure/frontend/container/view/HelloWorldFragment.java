package com.perezjavier.structure.frontend.container.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.perezjavier.structure.A;
import co.nadd.structure.R;
import com.perezjavier.structure.backend.model.Dummy;
import com.perezjavier.structure.frontend.container.Fragment;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Javier on 11/17/14.
 * Hello World fragment
 */
public class HelloWorldFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //TODO: Use where necessary

        A.getDummyEndpoint().get(new Callback<Dummy>() {
            @Override
            public void success(Dummy dummy, Response response) {
                Toast.makeText(getActivity(), "Dummy response: " + dummy.dummyInt, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();

            }
        });

        return inflater.inflate(R.layout.fragment_container_hello, container, false);
    }


}
