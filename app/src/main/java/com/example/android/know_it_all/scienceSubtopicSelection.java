package com.example.android.know_it_all;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class scienceSubtopicSelection extends AppCompatActivity implements View.OnClickListener {

    TextView tvChoiceSelection;
    ImageView ivSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_subtopic_selection);

        tvChoiceSelection = findViewById(R.id.tvChoiceSelection);
        ivSpace = findViewById(R.id.ivSpace);


    }

    @Override
    public void onClick(View v) {

        Intent spaceIntent = new Intent(scienceSubtopicSelection.this, com.example.android.know_it_all.MainActivity.class);

        if (v.getId() == R.id.ivSpace) {

            startActivity(spaceIntent);

        }

    }
}