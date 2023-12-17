package com.example.int_exp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=findViewById(R.id.un);
        password=findViewById(R.id.pass);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u= uname.getText().toString();
                String p= password.getText().toString();
                if(u.equals("Admin") && p.equals("pass")){
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESS", Toast.LENGTH_LONG).show();
//                    Intent i= new Intent(MainActivity.this, Welcompage.class);
//                    i.putExtra("user",u);
//                    startActivity(i);
                    Intent intent = new Intent(getApplicationContext(), test.class);
                    intent.putExtra("User",u);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "INVALID CREDENTIALS", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}