package com.forrestfan.beam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Search extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent (Search.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_search:
                    return true;
                case R.id.navigation_help:
                    Intent intent2 = new Intent (Search.this, Talk.class);
                    startActivity(intent2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_search);

        ImageView searchIcon = (ImageView) findViewById(R.id.search_icon);
        searchIcon.setOnClickListener(new View.OnClickListener(){
            public void onClick (View view) {
                Intent intent = new Intent (Search.this, SearchResults.class);
                startActivity(intent);
            }
        });
    }

}
