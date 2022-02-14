package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    Toast toast;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText = (EditText) findViewById(R.id.editText_main);

    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        toast = Toast.makeText(this, "Message recieved: " + message, Toast.LENGTH_SHORT);
        toast.show();

    }
}