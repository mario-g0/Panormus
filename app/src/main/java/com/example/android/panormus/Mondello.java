package com.example.android.panormus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mondello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    /**
     * This method starts a new activity when the "Next" button is pressed
     */
    public void next4(View view) {
        Intent nextActivity = new Intent(this, Market.class);
        startActivity(nextActivity);
    }

    /**
     * This method opens Google Maps at the desired coordinates
     */
    public void navigateToMondello(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=38.201541,13.326719(Mondello)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    /**
     * This method opens Google Maps at the desired coordinates
     */
    public void navigateToSferra(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=38.198260,13.275651(Sferracavallo)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
