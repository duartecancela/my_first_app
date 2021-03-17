package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_NAME = "com.example.myfirstapp.MESSAGE_NAME";
    public static final String EXTRA_MESSAGE_AGE = "com.example.myfirstapp.MESSAGE_AGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editTextName = (EditText) findViewById(R.id.editText_name);
        EditText editTextAge = (EditText) findViewById(R.id.editText_age);
        String messageName = editTextName.getText().toString();
        String messageAge = editTextAge.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_NAME, messageName);
        intent.putExtra(EXTRA_MESSAGE_AGE, messageAge);
        startActivity(intent);
    }
}