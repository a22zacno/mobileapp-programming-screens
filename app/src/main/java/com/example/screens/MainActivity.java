package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void startSecond(View view) {
        //Starts the second activity
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra("activityTxt", "The Second Activity has been activated"); //adds a piece of data with the activity
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
