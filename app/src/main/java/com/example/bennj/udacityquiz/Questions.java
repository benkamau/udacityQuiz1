package com.example.bennj.udacityquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        final Button Result = findViewById(R.id.submit);

        Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result();
            }
        });
    }

    private void Result() {
        Intent intent = new Intent(Questions.this, ResultsActivity.class);
        startActivity(intent);
    }
}
