package com.example.co2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.SupportActivity.ExtraData;

import static com.example.co2.R.id.characters;

public class HomePage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

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



}
