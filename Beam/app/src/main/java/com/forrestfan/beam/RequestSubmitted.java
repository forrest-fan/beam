package com.forrestfan.beam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequestSubmitted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_submitted);

        Button GoBack = findViewById(R.id.go_back);
        GoBack.setOnClickListener(new View.OnClickListener() {
            public void onClick (View view) {
                Intent intent = new Intent (RequestSubmitted.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
