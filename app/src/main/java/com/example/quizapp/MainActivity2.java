package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    TextView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        q1 = findViewById(R.id.q1);
        c1 = findViewById(R.id.corrAns1);
        a1 = findViewById(R.id.enteredAns1);

        q2 = findViewById(R.id.q2);
        c2 = findViewById(R.id.corrAns2);
        a2 = findViewById(R.id.enteredAns2);

        q3 = findViewById(R.id.q3);
        c3 = findViewById(R.id.corrAns3);
        a3 = findViewById(R.id.enteredAns3);

        q4 = findViewById(R.id.q4);
        c4 = findViewById(R.id.corrAns4);
        a4 = findViewById(R.id.enteredAns4);

        q5 = findViewById(R.id.q5);
        c5 = findViewById(R.id.corrAns5);
        a5 = findViewById(R.id.enteredAns5);

        q6 = findViewById(R.id.q6);
        c6 = findViewById(R.id.corrAns6);
        a6 = findViewById(R.id.enteredAns6);

        q7 = findViewById(R.id.q7);
        c7 = findViewById(R.id.corrAns7);
        a7 = findViewById(R.id.enteredAns7);

        q8 = findViewById(R.id.q8);
        c8 = findViewById(R.id.corrAns8);
        a8 = findViewById(R.id.enteredAns8);

        q9 = findViewById(R.id.q9);
        c9 = findViewById(R.id.corrAns9);
        a9 = findViewById(R.id.enteredAns9);

        q10 = findViewById(R.id.q10);
        c10 = findViewById(R.id.corrAns10);
        a10 = findViewById(R.id.enteredAns10);


    }
}