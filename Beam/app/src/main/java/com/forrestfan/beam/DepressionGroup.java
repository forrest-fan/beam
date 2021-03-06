package com.forrestfan.beam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class DepressionGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression_group);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ScrollView scrollView = findViewById(R.id.msgContainer);
        scrollView.scrollTo(0, scrollView.getBaseline());

        ImageView send = (ImageView)findViewById(R.id.sendIcon);

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
