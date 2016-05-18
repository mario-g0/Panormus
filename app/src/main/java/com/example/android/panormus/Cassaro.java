package com.example.android.panormus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Cassaro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    /**
     * This method opens Google Maps at the desired coordinates
     */
    public void navigateToCassaro(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=38.112221,13.352892(Corso Vittorio Emanuele)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }


    /**
     * This method starts a new activity when the "Next" button is pressed
     */
    public void next2(View view) {
        Intent nextActivity = new Intent(this, Cathedral.class);
        startActivity(nextActivity);
    }
}
