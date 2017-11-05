package com.forrestfan.beam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RequestGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_group);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button submit_request = findViewById(R.id.submitRequest);
        submit_request.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent (RequestGroup.this, RequestSubmitted.class);
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