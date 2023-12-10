package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uid,pass;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login =findViewById(R.id.b1);
        uid= findViewById(R.id.e1);
        pass=findViewById(R.id.e2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((uid.getText().toString().equals("aravind")) && (pass.getText().toString().equals("123"))){
                    Toast.makeText(MainActivity.this, "Login success",Toast.LENGTH_LONG).show();
                    Intent i= new Intent(MainActivity.this,MainActivity2.class);
//                    Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/"));
                    i.putExtra("id",uid.getText().toString());
                    i.putExtra("pass", pass.getText().toString());
                    startActivity(i);

                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}