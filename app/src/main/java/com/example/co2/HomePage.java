package com.example.co2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class HomePage extends AppCompatActivity {


    private ArrayList<MenuItem> mMenuList;
    private MenuAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

<<<<<<< HEAD
        Button character = (Button) findViewById(characters);
        character.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CharacterSelection.class);
                startActivity(i);
            }
        });

        Button roller = (Button) findViewById(R.id.roller);
        roller.setOnClickListener(new View.OnClickListener() {
            public void onClick(View e) {
                Intent k = new Intent(getApplicationContext(), roll.class);
                startActivity(k);
            }
        });



    }
=======
        initlist();

        Spinner spinnerMenu = findViewById(R.id.spinner_menu);

        mAdapter = new MenuAdapter(this, mMenuList);
        spinnerMenu.setAdapter(mAdapter);

        spinnerMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MenuItem clickedItem = (MenuItem) parent.getItemAtPosition(position);
                String clickedMenuName = clickedItem.getMenuName();
                Toast.makeText(HomePage.this, clickedMenuName + " selected", Toast.LENGTH_SHORT).show();

                if(clickedMenuName.equals("Character")) {
                    Intent intent = new Intent(HomePage.this, CharacterSelection.class);
                    startActivity(intent);
                }
                else if (clickedMenuName.equals("Map")) {
                    Intent intent = new Intent(HomePage.this, MapPage.class);
                    startActivity(intent);
                }
            }
>>>>>>> animation

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initlist() {
        mMenuList = new ArrayList<>();
        mMenuList.add(new MenuItem("Home", R.drawable.home));
        mMenuList.add(new MenuItem("Character", R.drawable.character));
        mMenuList.add(new MenuItem("Map", R.drawable.map));
    }
}
