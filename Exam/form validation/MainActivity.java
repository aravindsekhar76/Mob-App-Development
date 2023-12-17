package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText uname= findViewById(R.id.txt1);

        EditText pass= findViewById(R.id.txt2);

        Button login= findViewById(R.id.b1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((uname.getText().toString().equals("admin")) && (pass.getText().toString().equals("password"))){
                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_LONG).show();
                }

            }
        });



    }
}