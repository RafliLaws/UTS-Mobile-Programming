package com.example.rafli201011401338;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity3 extends AppCompatActivity {
    ListView l;
    String tutorials[]
            = { "Catatan 1", "Catatan 2",
            "Catatan 3", "Catatan 4",
            "Catatan 5", "Catatan 6",
            "Catatan 7", "Catatan 8",
            "Catatan 9" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_dropdown_item,tutorials);
        l.setAdapter(arr);

    }
}