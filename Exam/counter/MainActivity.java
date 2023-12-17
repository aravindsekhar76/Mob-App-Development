package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t= findViewById(R.id.txt1);

        Button sum= findViewById(R.id.add);
        Button diff= findViewById(R.id.sub);
        Button clear= findViewById(R.id.reset);

        t.setText(Integer.toString(count));

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                t.setText(Integer.toString(count));
            }
        });

        diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                t.setText(Integer.toString(count));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                t.setText(Integer.toString(count));
            }
        });




    }
}