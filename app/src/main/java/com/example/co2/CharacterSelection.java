package com.example.co2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CharacterSelection extends AppCompatActivity {

    ListView listView;
    List characters = new ArrayList();
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        listView = (ListView)findViewById(R.id.list_view);

        characters.add("Jonathan");
        characters.add("Carlos");
        characters.add("Garfield");

        adapter = new ArrayAdapter(CharacterSelection.this, android.R.layout.simple_list_item_1, characters);
        listView.setAdapter(adapter);
    }

}
