package com.example.quittingtime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GrabLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grab_location);
    }
    /** Called when user selects Yes to grab their location automatically
     */
    public void FirstQuestions(View view) {
        Intent intent = new Intent(this, FirstQuestions.class);
        startActivity(intent);

    }
}
