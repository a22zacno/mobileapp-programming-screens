package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        String activityTxt = null;
        if (extras != null) {
            activityTxt = extras.getString("activityTxt");
        }

        TextView textView = findViewById(R.id.activityView);
        textView.setText(activityTxt);
    }
}