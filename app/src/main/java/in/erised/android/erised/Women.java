package in.erised.android.erised;

import android.app.Activity;
//import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Akshay on 22/07/15.
 */
public class Women extends Fragment {

    public static Women newInstance() {
        Women fragment = new Women();
        return fragment;
    }

    public Women() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.skeleton_grid, container, false);

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(1);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView iv  = (ImageView)getActivity().findViewById(R.id.imageView2);
        Drawable d  = getResources().getDrawable(R.drawable.woman);
        iv.setImageDrawable(d);

    }
}


