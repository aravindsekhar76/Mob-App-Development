package com.example.int_exp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView Name = findViewById(R.id.name);
        Intent i2 = getIntent();
        String un2 = i2.getStringExtra("User");
        Name.setText(un2);
    }
}