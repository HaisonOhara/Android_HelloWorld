package com.example.helloworldfamigeradao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    private static final String TAG = "DisplayMActivityTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "Inicio On create discplayMessage");
        setContentView(R.layout.activity_display_message);


        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        Log.d(TAG, "Fim OnCreate DisplayMessage");
    }
}