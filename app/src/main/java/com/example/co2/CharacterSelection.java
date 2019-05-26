package com.example.co2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CharacterSelection extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    List characters = new ArrayList<String>();
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        ListView listView = (ListView) findViewById(R.id.list_view);

        characters.add("Jonathan");
        characters.add("Carlos");
        characters.add("Garfield");
        characters.add("Ellen Degeneres");
        characters.add("Garfield II");
        characters.add("Jupiter LaCroix");
        characters.add("Spectre Mildew");
        characters.add("S19");
        characters.add("Saffron");
        characters.add("Gossamer");

        adapter = new ArrayAdapter(CharacterSelection.this, android.R.layout.simple_list_item_1, characters);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    public void onItemClick(AdapterView<?> l, View v, int position, long id) {
        Intent intent2 = new Intent();
        intent2.setClass(this, CharacterInfo.class);
        intent2.putExtra("position", position);
        intent2.putExtra("id", id);
        startActivity(intent2);
        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (String)characters.get(position);
                Toast.makeText(CharacterSelection.this, value, Toast.LENGTH_SHORT).show();
            }
        });*/
    }

}
