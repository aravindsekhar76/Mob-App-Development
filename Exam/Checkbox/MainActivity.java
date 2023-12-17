package com.example.cb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button butt1;
    CheckBox box1,box2,box3;
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butt1=findViewById(R.id.b1);
        box1=findViewById(R.id.c1);
        box2=findViewById(R.id.c2);
        box3=findViewById(R.id.c3);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum=0;
                if(box1.isChecked()){
                    sum=sum+10;
                }
                if (box2.isChecked()){
                    sum=sum+20;
                }
                if (box3.isChecked()){
                    sum=sum+30;
                }
                Toast.makeText(MainActivity.this, "The sum is "+sum, Toast.LENGTH_LONG).show();
            }
        });



    }
}