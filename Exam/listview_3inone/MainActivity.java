package com.example.cal1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView bikes;
    Button Butt;
    String [] b= {"RC390","Splender","Pulsar","RE350","Vikrant","Xpulse","Passionplus","GS350"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bikes=findViewById(R.id.l1);
        Butt=findViewById(R.id.b1);



//        create array adapter object

        ArrayAdapter<String> a;
        a=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, b);
        bikes.setAdapter(a);


//    toast inside listview

        bikes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String pos = b[position];
                Toast.makeText(MainActivity.this, pos, Toast.LENGTH_SHORT).show();
            }
        });


//        redirecting to next page

        Butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
    }
}