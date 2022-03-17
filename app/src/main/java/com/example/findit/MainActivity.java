package com.example.findit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler h;
        h = new Handler(Looper.getMainLooper());
        h.postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, Input.class);
            startActivity(i);
        },2000);
    }
}