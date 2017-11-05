package com.forrestfan.beam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigation;
    CardView DepressionGroup;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_search:
                    Intent intent = new Intent (MainActivity.this, Search.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_help:
                    Intent intent2 = new Intent (MainActivity.this, Talk.class);
                    startActivity(intent2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        DepressionGroup = (CardView) findViewById(R.id.depressionCard);
        DepressionGroup.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, DepressionGroup.class);
                startActivity(intent);
            }
        });

        CardView beamGroupSearch = (CardView) findViewById(R.id.beam_group_search);
        beamGroupSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent (MainActivity.this, Search.class);
                startActivity(intent);
            }
        });

        CardView inPersonSearch = (CardView) findViewById(R.id.in_person_search);
        inPersonSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent (MainActivity.this, Search.class);
                startActivity(intent);
            }
        });
    }

}