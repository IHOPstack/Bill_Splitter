package com.example.billsplitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner

        //Create grid layout for entries
        List<Entry> entries = new ArrayList<Entry>();
        for (int i = 0; i < 5; i++) {
            entries.add(new Entry(0.00, "Item Purchased"));
        }

        RecyclerView entryField = findViewById(R.id.itemField);
        GridLayoutManager gridSet = new GridLayoutManager(this, 2);

        entryField.setLayoutManager(gridSet);
        entryField.setAdapter(new EntryAdapter(getApplicationContext(), entries));

    }

}