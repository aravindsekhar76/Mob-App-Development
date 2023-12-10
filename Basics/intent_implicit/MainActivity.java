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
    Button browse,call,github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browse =findViewById(R.id.b1);
        call= findViewById(R.id.b2);
        github=findViewById(R.id.b3);
        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Going to google",Toast.LENGTH_LONG).show();
//                    Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/"));
                    Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://google.com/"));
                    startActivity(i);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Redirecting to call", Toast.LENGTH_SHORT).show();
                Intent j= new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+918137074519"));
                startActivity(j);

            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Going to Github", Toast.LENGTH_SHORT).show();
                Intent k = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/"));
                startActivity(k);
            }
        });
    }
}