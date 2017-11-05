package com.forrestfan.beam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SearchResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView childAbuse = findViewById(R.id.child_abuse);
        childAbuse.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent(SearchResults.this, ChildAbuse.class);
                startActivity(intent);
            }
        });

        TextView allGroups = findViewById(R.id.all_groups);
        allGroups.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent(SearchResults.this, AllGroups.class);
                startActivity(intent);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
