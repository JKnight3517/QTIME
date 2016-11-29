package com.example.quittingtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstQuestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_questions);

    }
    public void FirstQuestions(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}

