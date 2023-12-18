package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] s={"cap","HUlk","Thor","Ironman"};
        ArrayAdapter ad= new ArrayAdapter(getApplicationContext(),R.layout.list_item,R.id.textView,s);
        ListView l=findViewById(R.id.lsv);
        l.setAdapter(ad);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s1=ad.getItem(position).toString();
                Toast.makeText(getApplicationContext(), ""+s1, Toast.LENGTH_SHORT).show();
            }
        });
    }
}