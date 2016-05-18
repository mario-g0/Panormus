package com.example.android.panormus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Cathedral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }


    /**
     * This method opens the link in the Browser
     */
    public void cathedralInfo(View view) {
        String url = "http://www.cattedrale.palermo.it/notizie%20visitatori%202012/orariemodalita%202014.htm";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


    /**
     * This method starts a new activity when the "Next" button is pressed
     */
    public void next3 (View view) {
        Intent nextActivity = new Intent(this, Mondello.class);
        startActivity(nextActivity);
    }
}
