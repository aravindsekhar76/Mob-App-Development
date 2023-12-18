package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t1=findViewById(R.id.name);
        
        SharedPreferences sh=getSharedPreferences("ref",MODE_PRIVATE);
        String rec=sh.getString("key1","").toString();
        Toast.makeText(getApplicationContext(), ""+rec, Toast.LENGTH_LONG).show();
        t1.setText(rec);
    }
}