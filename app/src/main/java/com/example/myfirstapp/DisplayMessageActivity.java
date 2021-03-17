package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String messageName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);
        String messageAge = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_AGE);

        // Capture the layout's TextView and set the string as its text
        TextView textViewName = findViewById(R.id.textView_name);
        TextView textViewAge = findViewById(R.id.textView_age);
        textViewName.setText(messageName);
        textViewAge.setText(messageAge);
    }
}