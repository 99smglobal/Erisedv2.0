package in.erised.android.erised;

/**
 * Created by Akshay on 25/07/15.
 */
import android.app.Activity;
//import android.app.Fragment;
//import android.app.FragmentTransaction;
//import android.content.Intent;
//import android.graphics.Typeface;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import android.support.v4.app.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;





public class Home extends Fragment {

    TextView menTxt,womenTxt,kidTxt,offersTxt, nullTxt;
    ImageButton men,women,kids, offers;
    MainActivity x;
    Men men1 = new Men();
    Women women1;
    Kids kids1;
    MainActivity main;
//
    public static Home newInstance() {
        return new Home();

    }

    public Home() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return  inflater.inflate(R.layout.home, container, false);



    }

    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).onSectionAttached(1);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // ImageView iv  = (ImageView)getActivity().findViewById(R.id.imageView2);
        // Drawable d  = getResources().getDrawable(R.drawable.kid);
        // iv.setImageDrawable(d);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Walkway Black.ttf");


        menTxt = (TextView) getActivity().findViewById(R.id.men_txt);
        menTxt.setTypeface(tf);
        menTxt.setText("Men");

        womenTxt = (TextView) getActivity().findViewById(R.id.women_txt);
        womenTxt.setTypeface(tf);
        womenTxt.setText("Women");

        kidTxt = (TextView) getActivity().findViewById(R.id.kids_txt);
        kidTxt.setTypeface(tf);
        kidTxt.setText("Kids");

        offersTxt = (TextView) getActivity().findViewById(R.id.offers_txt);
        offersTxt.setTypeface(tf);
        offersTxt.setText("Special Offers");

        nullTxt = (TextView) getActivity().findViewById(R.id.null_txt);
        nullTxt.setText("");

        men = (ImageButton) getActivity().findViewById(R.id.man_btn);
        women = (ImageButton) getActivity().findViewById(R.id.woman_btn);

        offers = (ImageButton) getActivity().findViewById(R.id.offers_btn);


        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction1= fragmentManager.beginTransaction();
                transaction1.replace(R.id.container, Men.newInstance());
                //getActivity().onSectionAttached(2);
                transaction1.addToBackStack(null);
                transaction1.commit();


               /* Intent clicked= new Intent(getActivity().getApplicationContext(),Men.class);
                startActivity(clicked);  */
            }
        });
        women=(ImageButton)getActivity().findViewById(R.id.woman_btn);

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction1= fragmentManager.beginTransaction();
                transaction1.replace(R.id.container, Women.newInstance());
                //getActivity().onSectionAttached(4);
                transaction1.addToBackStack(null);
                transaction1.commit();





            /*    Intent clicked = new Intent(getActivity().getApplicationContext(),Women.class);
                startActivity(clicked);   */
            }
        });
        kids=(ImageButton) getActivity().findViewById(R.id.kid_btn);
        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


              /*  FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Kids.newInstance()).commit();  */

               FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction1 = fragmentManager.beginTransaction();
                transaction1.replace(R.id.container, Kids.newInstance());
               // ((MainActivity) activity).onSectionAttached(3);
                transaction1.addToBackStack(null);
                transaction1.commit();

              /*  Intent clicked= new Intent(getActivity().getApplicationContext(),Kids.class);
                startActivity(clicked);  */
            }
        });

    }


    }


