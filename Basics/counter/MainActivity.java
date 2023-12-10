package com.example.test1;

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
        TextView t= findViewById(R.id.t1);

        Button Add=findViewById(R.id.plus);
        Button Reset =findViewById(R.id.reset);
        Button minus =findViewById(R.id.minus);

        t.setText(Integer.toString(count));

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count=0;
                t.setText(Integer.toString(count));

            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                t.setText(Integer.toString(count));


            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                t.setText(Integer.toString(count));

            }
        });

    }

}