package com.example.sp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b= findViewById(R.id.login);

        EditText u= findViewById(R.id.uname);

        EditText p =findViewById(R.id.pass);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                SharedPreferences sh =getSharedPreferences("ref",MODE_PRIVATE);
                SharedPreferences.Editor ed= sh.edit();

                ed.putString("key1",u.getText().toString());
                ed.apply();

                Intent i= new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
    }
}