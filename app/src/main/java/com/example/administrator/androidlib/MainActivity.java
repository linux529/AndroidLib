package com.example.administrator.androidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        Log.d(TAG, "onCreate() called with: " + "savedInstanceState = [" + savedInstanceState + "]");
        Log.i(TAG, "onCreate: ");
        Log.i(TAG, "onCreate: ");
        //   Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
    }
}
