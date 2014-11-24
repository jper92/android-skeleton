package com.perezjavier.structure.frontend;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import co.nadd.structure.R;
import com.perezjavier.structure.frontend.container.view.HelloWorldFragment;

/**
 * Created by Javier on 11/17/14.
 * Base activity
 */
public class Container  extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        containerStart();
    }

    private void containerStart(){
        changeFragment(new HelloWorldFragment(), false);
    }

    public boolean changeFragment(Fragment fragment, boolean addToBackstack){
        getSupportFragmentManager().executePendingTransactions();
        if (fragment==null || fragment.isAdded()) return false;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        if (addToBackstack) transaction.addToBackStack(null);
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        transaction.commitAllowingStateLoss();
        return true;
    }

}
