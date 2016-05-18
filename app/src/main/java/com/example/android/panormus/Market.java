package com.example.android.panormus;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Market extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }


    /**
     * This method opens Google Maps at the desired coordinates
     */
    public void navigateToVucc(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=38.117395,13.363756(La Vucciria)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }


    /**
     * This method opens Google Maps at the desired coordinates
     */
    public void navigateToCapo(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=38.116903,13.353861(Il Capo)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    /**
     * This method opens Google Maps at the desired coordinates
     */
    public void navigateToBalla(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=38.111754,13.360706(Ballarò)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }


    /**
     * This method starts a new activity when the "Next" button is pressed
     */
    public void next5(View view) {
        Intent nextActivity = new Intent(this, Eat.class);
        startActivity(nextActivity);
    }
}
