package com.example.dnd;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Variables
    private Button characters;
    private Button sources;
    private Button party;
    private Button maps;
    private Button monsters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set DnD font to buttons
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/DnDC.ttf");

        // Characters button
        characters = findViewById(R.id.character_button);
        characters.setTypeface(custom_font);
        characters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                beerList();
            }
        });

        // Sources button
        sources = findViewById(R.id.sources_button);
        sources.setTypeface(custom_font);
        sources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                procedure();
            }
        });

        // Party button
        party = findViewById(R.id.party_button);
        party.setTypeface(custom_font);
        party.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tools();
            }
        });

        // Maps button
        maps = findViewById(R.id.maps_button);
        maps.setTypeface(custom_font);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tools();
            }
        });

        // Monstrers button
        monsters = findViewById(R.id.monsters_button);
        monsters.setTypeface(custom_font);
        monsters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tools();
            }
        });

    }
}
