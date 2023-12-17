package com.example.rb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    RadioGroup states;
    RadioButton r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        states=findViewById(R.id.rmain1);
        result=findViewById(R.id.txt1);

        states.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                r1=findViewById(checkedId);
                String val= r1.getText().toString();
                String capital= " ";

                switch (val){
                    case "Kerala":
                        capital= "Trivandrum";
                        break;
                    case "Tamil Nadu":
                        capital= "Chennai";
                        break;
                    case "Karnataka":
                        capital= "Bengaluru";
                        break;
                }
                result.setText(capital);
            }
        });



    }
}