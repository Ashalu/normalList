package com.developer.aashish.secondapplist;

import android.support.v7.app.AppCompatActivity;
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

        ListView li = (ListView) findViewById(R.id.list);
        final String item[] = new String[]{"AMIT", "YOGESH", "HIMANSHU", "DEEPAK", "SHUBHAM", "ROHIT", "SUMIT", "GAJENDRA"};
        ArrayAdapter<String> add = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, item);
        li.setAdapter(add);

        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, item[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}