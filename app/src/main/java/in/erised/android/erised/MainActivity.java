package in.erised.android.erised;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {



/*
    TextView mTextview;
  */
    /*
   ImageButton men, women, kids, offers;
    TextView menTxt, womenTxt, kidTxt, offersTxt;
    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */

    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */

    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Typeface tf= Typeface.createFromAsset(getAssets(),"fonts/Walkway Black.ttf");
        setContentView(R.layout.activity_main1);
/*
        mTextview= (TextView) findViewById(R.id.demoTxt);
        mTextview.setText("Hey there!! ");
*/
    /*
        menTxt= (TextView)findViewById(R.id.men_txt);
        menTxt.setTypeface(tf);
        menTxt.setText("Men");

        womenTxt= (TextView)findViewById(R.id.women_txt);
        womenTxt.setTypeface(tf);
        womenTxt.setText("Women");

        kidTxt= (TextView) findViewById(R.id.kids_txt);
        kidTxt.setTypeface(tf);
        kidTxt.setText("Kids");

        offersTxt= (TextView) findViewById(R.id.offers_txt);
        offersTxt.setTypeface(tf);
        offersTxt.setText("Special Offers");

  men= (ImageButton) findViewById(R.id.man_btn);
        women= (ImageButton) findViewById(R.id.woman_btn);

        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clicked= new Intent(getApplicationContext(),Men.class);
            startActivity(clicked);
            }
        });
        women=(ImageButton)findViewById(R.id.woman_btn);

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent clicked = new Intent(getApplicationContext(),Women.class);
                startActivity(clicked);
            }
        });
        kids=(ImageButton) findViewById(R.id.kid_btn);
        kids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clicked= new Intent(getApplicationContext(),Kids.class);
                startActivity(clicked);
            }
        });

       */
         mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment =  Home.newInstance();
                break;
            case 1:
                fragment = Men.newInstance();
                break;
            case 2:
                fragment =  Women.newInstance();
                break;
            case 3:
                fragment =  Kids.newInstance();
                break;

        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, fragment).commit();


        }
    }


            // update selected item and title, then close the drawer
           /* mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            setTitle(navMenuTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);
        } else {
            // error in creating fragment
            Log.e("MainActivity", "Error in creating fragment");
        }

  */


        // update the main content by replacing fragments
       /* FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit(); */

   //selectItem(position);


     /*  FragmentManager fragmentManager = getSupportFragmentManager();

        if (position == 0) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, Home.newInstance(position))
                    .commit();
                   setTitle("Home");
        } else if (position == 1) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, Men.newInstance(position))
                    .commit();
            setTitle("Men");
        } else if (position == 3) {
            fragmentManager.beginTransaction()
                    .replace(R.id.container, Kids.newInstance(position))
                    .commit();
           setTitle("Kids");
        }
            else if (position == 2) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container, Women.newInstance(position))
                        .commit();
            setTitle("Women");

            }
    }  */




    /*private void selectItem(int position) {

        // Handle Nav Options
        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(getApplicationContext(),Men.class);
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(getApplicationContext(),Women.class);
                startActivity(intent);
                // etc.
                break;
            case 2:
                intent = new Intent(getApplicationContext(),Kids.class);
                startActivity(intent);

        }

    }
*/
    public void onSectionAttached(int position) {
        switch (position) {
            case 1:
                mTitle="Home";
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle="Women";
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_main1, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
