package com.example.android.know_it_all;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class topicSelection extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_selection);

        Button btnSubmitTopic;
        final TextView tvTitle;

        btnSubmitTopic = findViewById(R.id.btnSubmitTopic);
        tvTitle = findViewById(R.id.btnSubmitTopic);

        final Spinner spinner = findViewById(R.id.spTopicChooser);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.subjects, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        btnSubmitTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String defaultChoice = getResources().getString(R.string.chooseTopic);
                String english = getResources().getString(R.string.english);
                String math = getResources().getString(R.string.math);

                System.out.println(spinner.getSelectedItem().toString());

                if (spinner.getSelectedItem().toString().equals(defaultChoice)) {

                   Toast.makeText(topicSelection.this, "Please choose a topic!", Toast.LENGTH_SHORT).show();

                } else if (spinner.getSelectedItem().toString().equals(english)) {


                } else if (spinner.getSelectedItem().toString().equals(math)) {


                }
            }
        });


    }


}