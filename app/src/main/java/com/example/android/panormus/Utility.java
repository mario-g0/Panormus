package com.example.android.panormus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Utility extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utility);
    }


    /**
     * This method starts a new activity when the "Next" button is pressed
     */
    public void next7 (View view) {
        Intent nextActivity = new Intent(this, Final.class);
        startActivity(nextActivity);
    }

    /**
     * This method opens the Dialer with the desired number
     */
    public void callEmergency(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:112"));
        startActivity(callIntent);

    }

    /**
     * This method opens the link in the Browser
     */
    public void goToSite (View view) {String url = "http://www.amat.pa.it/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    /**
     * This method opens the Dialer with the desired number
     */
    public void callTaxi(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:0918481"));
        startActivity(callIntent);

    }


}
