package com.example.test1

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Activity life cycle","onCreate started");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity life cycle","onStart started");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity life cycle","onPause started");

    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity life cycle","onResume started");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity life cycle","onStop started");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity life cycle","onRestart started");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity life cycle","onDestroy started");

    }
}
