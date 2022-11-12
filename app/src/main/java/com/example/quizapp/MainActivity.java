package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;


public class MainActivity extends AppCompatActivity{

    TextView course, que;
    Button btn1, btn2, btn3, btn4;

    ArrayList<Quiz> quizQues = new ArrayList<>();

    Random rnd;
    int score,rndNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course = findViewById(R.id.course);
        que = findViewById(R.id.que);

        btn1 = findViewById(R.id.opt1);
        btn2 = findViewById(R.id.opt2);
        btn3 = findViewById(R.id.opt3);
        btn4 = findViewById(R.id.opt4);

        quizQues.add(new Quiz("There are _________ types of bonds","2","3","4","5","4"));
        quizQues.add(new Quiz("In silver plating Anode is made of","Gold","Ag","Neon","Nil","Ag"));
        quizQues.add(new Quiz("All metals are solid except","Al","Mg","Na","Hg","Hg"));
        quizQues.add(new Quiz("Neutrons have _________ charge.","+","-","No","Nil","-"));
        quizQues.add(new Quiz("Bucky Balls are used as","Lubricants","Cutting","Crafting","Nil","Lubricants"));
        quizQues.add(new Quiz("Diamonds is ____________","Soft","Hard","Bulky","Nil","Hard"));
        quizQues.add(new Quiz("Mass per unit volume is:","Velocity","Density","Pressure","Nil","Density"));
        quizQues.add(new Quiz("The forces of attraction present between the molecules of a substance are called ____________ forces.","Covalent","Ionic","Intermolecular","Nil","Intermolecular"));
        quizQues.add(new Quiz("The earth is made up of ___________ % of iron.","4","5","6","7","5"));
        quizQues.add(new Quiz("____________ is an irreversible cell.","Dry Cell","Zn Cell","Chargeable Cell","None of these","Dry Cell"));

        rndNumber = rnd.nextInt(quizQues.size());

        que.setText(quizQues.get(rndNumber).getQue());
        btn1.setText(quizQues.get(rndNumber).getOpt1());
        btn2.setText(quizQues.get(rndNumber).getOpt2());
        btn3.setText(quizQues.get(rndNumber).getOpt3());
    }
}