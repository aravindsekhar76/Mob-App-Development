package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup states;
    RadioButton rb1;
    TextView result;
    Button proceed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        states=findViewById(R.id.grp);
        result=findViewById(R.id.result);

        states.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb1=findViewById(checkedId);
                String st=rb1.getText().toString();
                String capital="";

                switch (st){
                    case "kerala":
                        capital="thruvananthapuram";
                        break;
                    case "Tamil Nadu":
                        capital="Chennai";
                        break;
                    case "karnataka":
                        capital="bengaluru";
                        break;
                }
                result.setText(capital);
            }
        });




    }
}