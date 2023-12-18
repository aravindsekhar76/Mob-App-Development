package com.example.cal1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    String [] b= {"RC390","Splender","Pulsar","RE350","Vikrant","Xpulse","Passionplus","GS350"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        creating spinner object

        Spinner spin =findViewById(R.id.s1);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,b);
        spin.setAdapter(arr);


    }
}