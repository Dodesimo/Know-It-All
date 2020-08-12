package com.example.android.know_it_all;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvTitle;
    Button btnStart;
    Button btnCredits;
    ImageView ivSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);
        btnStart = findViewById(R.id.btnStart);
        btnCredits = findViewById(R.id.btnCredits);
        ivSettings = findViewById(R.id.ivSettings);

        btnStart.setOnClickListener(this);
        btnCredits.setOnClickListener(this);
        ivSettings.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intentSettings = new Intent(MainActivity.this, com.example.android.know_it_all.settings.class);
        Intent intentCredits = new Intent(MainActivity.this, com.example.android.know_it_all.credits.class);
        Intent intentStart = new Intent(MainActivity.this, com.example.android.know_it_all.topicSelection.class);

        if (v.getId() == R.id.ivSettings) {

            startActivity(intentSettings);


        }

        if (v.getId() == R.id.btnCredits) {

            startActivity(intentCredits);

        }

        if (v.getId() == R.id.btnStart) {

            startActivity(intentStart);

        }

    }
}