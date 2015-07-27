package in.erised.android.erised;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Suraj...!!! on 7/22/2015.
 */
public class SplashScreen extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                | WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.splash);
        Thread load = new Thread()
        {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                //	super.run();
                try {
                    sleep(3*1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }finally{
                    Intent loaded = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(loaded);
                    //finish();
                }
            }

        };load.start();

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
