package com.example.android.panormus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method starts a new activity when the "Next" button is pressed
     */
    public void next(View view) {
        Intent nextActivity = new Intent(this, Cassaro.class);
        startActivity(nextActivity);
    }
}
