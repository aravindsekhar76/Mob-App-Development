package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button B1;
    Button B2;
    Button B3;
    Button B4;
    Button B5;
    Button B6;
    Button B7;
    Button B8;
    Button B9;
    Button B10;
    Button B11;
    Button B12;
    Button B13;
    Button B14;
    Button B15;
    Button B16;
    String d1= null;
    double a,b,c;
    String op;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button) findViewById(R.id.B1);
        B2=(Button) findViewById(R.id.B2);
        B3=(Button) findViewById(R.id.B3);
        B4=(Button) findViewById(R.id.B4);
        B5=(Button) findViewById(R.id.B5);
        B6=(Button) findViewById(R.id.B6);
        B7=(Button) findViewById(R.id.B7);
        B8=(Button) findViewById(R.id.B8);
        B9=(Button) findViewById(R.id.B9);
        B10=(Button) findViewById(R.id.B10);
        B11=(Button) findViewById(R.id.B11);
        B12=(Button) findViewById(R.id.B12);
        B13=(Button) findViewById(R.id.B13);
        B14=(Button) findViewById(R.id.B14);
        B15=(Button) findViewById(R.id.B15);
        B16=(Button) findViewById(R.id.B16);
        tv=(TextView) findViewById(R.id.tv);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"1");
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"2");
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"3");
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"4");
            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"5");
            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"6");
            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"7");
            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"8");

            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"9");
            }
        });

        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                tv.setText(d1+"0");
            }
        });

        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                a=Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
                op="+";
            }
        });

        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString() ;
                a=Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
                op="-";
            }
        });

        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                a=Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
                op="*";
            }
        });

        B14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                a=Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
                op="/";
            }
        });



        B16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=null;
                tv.setText(null);

            }
        });

        B15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=tv.getText().toString();
                b=Double.parseDouble(d1);
               switch (op){
                   case "+":
                       c=a+b;
                       break;
                   case "-":
                       c=a-b;
                       break;
                   case "*":
                       c=a*b;
                       break;
                   case "/":
                       c=a/b;
                       break;
               }
                tv.setText(String.valueOf(c));

            }
        });





    }
}