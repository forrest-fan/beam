package com.forrestfan.beam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AllGroups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_groups);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button requestGroup = findViewById(R.id.request_group);
        requestGroup.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent (AllGroups.this, RequestGroup.class);
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
