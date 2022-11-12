package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.util.*;


public class MainActivity extends AppCompatActivity{

    List<List<String>> lists = new ArrayList<List<String>>();

    String[][] ques
            = {
            {"There are _________ types of bonds","2","3","4"},
            {"The right most position in the periodic table is occupied by","2","3","4"},
            {"It is a triatomic molecule","2","3","4"}
    };

    TextView textView;
    textView = findViewById(R.id.que);


}