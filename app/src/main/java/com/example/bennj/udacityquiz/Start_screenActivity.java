package com.example.bennj.udacityquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_screenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        final Button startQuiz  = findViewById(R.id.start_btn);
        startQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuiz();
            }
        });

    }
    private void startQuiz(){
        Intent intent = new Intent(Start_screenActivity.this, Questions.class);
    startActivity(intent);
    }
}
