package co.nadd.structure.frontend.container;

import co.nadd.structure.frontend.Container;

/**
 * Created by Javier on 11/17/14.
 * Fragment class extension to common tasks
 */
public class Fragment extends android.support.v4.app.Fragment {

    public Container getContainer(){
        return (Container)getActivity();
    }
}
