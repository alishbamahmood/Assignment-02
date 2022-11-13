package com.example.quizapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.*;


public class MainActivity extends AppCompatActivity {

    TextView course, que , scoreView;
    Button btn1, btn2, btn3, btn4 ,next;

    ArrayList<Quiz> quizQues = new ArrayList<>();
    ArrayList<String[]> queAns = new ArrayList<>();
    List<String> ans = new ArrayList<>();
    String answer;

    TextView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    TextView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    TextView a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;

    LinearLayout linearLayout,linearLayout2;

    int score=0;
    int i=0;

    Integer[] selected = new Integer[]{};

    List<Integer> selectedList = new ArrayList<>(Arrays.asList(selected));


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course = findViewById(R.id.course);
        que = findViewById(R.id.que);
        next = findViewById(R.id.next);
        scoreView = findViewById(R.id.scoreView);


        btn1 = findViewById(R.id.opt1);
        btn2 = findViewById(R.id.opt2);
        btn3 = findViewById(R.id.opt3);
        btn4 = findViewById(R.id.opt4);

        linearLayout=findViewById(R.id.display1);
        linearLayout2=findViewById(R.id.display2);

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

        String[] options1 =  new String[]{"2","3","4","5"};
        quizQues.add(new Quiz("There are _________ types of bonds",options1,"4"));

        String[] options2 =  new String[]{"Gold","Ag","Neon","Nil"};
        quizQues.add(new Quiz("In silver plating Anode is made of",options2,"Ag"));

        String[] options3 =  new String[]{"Al","Mg","Na","Hg"};
        quizQues.add(new Quiz("All metals are solid except",options3,"Hg"));

        String[] options4 =  new String[]{"+","-","No","Nil"};
        quizQues.add(new Quiz("Neutrons have _________ charge.",options4,"-"));

        String[] options5 =  new String[]{"Lubricants","Cutting","Crafting","Nil"};
        quizQues.add(new Quiz("Bucky Balls are used as",options5,"Lubricants"));

        String[] options6 =  new String[]{"Soft","Hard","Bulky","Nil"};
        quizQues.add(new Quiz("Diamonds is ____________",options6,"Hard"));

        String[] options7 =  new String[]{"Velocity","Density","Pressure","Nil"};
        quizQues.add(new Quiz("Mass per unit volume is:",options7,"Density"));

        String[] options8 =  new String[]{"Covalent","Ionic","Intermolecular","Nil"};
        quizQues.add(new Quiz("The forces of attraction present between the molecules of a substance are called ____________ forces.",options8,"Intermolecular"));

        String[] options9 =  new String[]{"4","5","6","7"};
        quizQues.add(new Quiz("The earth is made up of ___________ % of iron.",options9,"5"));

        String[] options10 =  new String[]{"Dry Cell","Zn Cell","Chargeable Cell","None of these"};
        quizQues.add(new Quiz("____________ is an irreversible cell.",options10,"Dry Cell"));

        Collections.shuffle(quizQues);

        setData(i);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQues.get(i).getAnswer().trim().toLowerCase().equals(btn1.getText().toString().trim().toLowerCase()))
                {

                    answer = btn1.getText().toString();
                    ans.add(answer);

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQues.get(i).getAnswer().trim().toLowerCase().equals(btn2.getText().toString().trim().toLowerCase())) {

                    answer = btn2.getText().toString();
                    ans.add(answer);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQues.get(i).getAnswer().trim().toLowerCase().equals(btn3.getText().toString().trim().toLowerCase()))
                {

                    answer = btn3.getText().toString();
                    ans.add(answer);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQues.get(i).getAnswer().trim().toLowerCase().equals(btn4.getText().toString().trim().toLowerCase()))
                {

                    answer = btn4.getText().toString();
                    ans.add(answer);
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] array = new String[]{quizQues.get(i).getQue(),quizQues.get(i).getAnswer(),answer};
                queAns.add(array);
                if(quizQues.get(i).getAnswer().trim().toLowerCase().equals(answer.trim().toLowerCase()))
                {
                    score=score+1;
                }
                i=i+1;
                if(i<10)
                {
                    setData(i);
                }


                else
                {

                    linearLayout.setVisibility(View.INVISIBLE);
                    linearLayout2.setVisibility(View.VISIBLE);

                    scoreView.setText("Score: " + score);

                    setData2();
                }


            }
        });


    }


    private void setData2()
    {
        q1.setText(queAns.get(0)[0]);
        c1.setText(queAns.get(0)[1]);
        a1.setText(queAns.get(0)[2]);

        q2.setText(queAns.get(1)[0]);
        c2.setText(queAns.get(1)[1]);
        a2.setText(queAns.get(1)[2]);

        q3.setText(queAns.get(2)[0]);
        c3.setText(queAns.get(2)[1]);
        a3.setText(queAns.get(2)[2]);

        q4.setText(queAns.get(3)[0]);
        c4.setText(queAns.get(3)[1]);
        a4.setText(queAns.get(3)[2]);

        q5.setText(queAns.get(4)[0]);
        c5.setText(queAns.get(4)[1]);
        a5.setText(queAns.get(4)[2]);

        q6.setText(queAns.get(5)[0]);
        c6.setText(queAns.get(5)[1]);
        a6.setText(queAns.get(5)[2]);

        q7.setText(queAns.get(6)[0]);
        c7.setText(queAns.get(6)[1]);
        a7.setText(queAns.get(6)[2]);

        q8.setText(queAns.get(7)[0]);
        c8.setText(queAns.get(7)[1]);
        a8.setText(queAns.get(7)[2]);

        q9.setText(queAns.get(8)[0]);
        c9.setText(queAns.get(8)[1]);
        a9.setText(queAns.get(8)[2]);

        q10.setText(queAns.get(9)[0]);
        c10.setText(queAns.get(9)[1]);
        a10.setText(queAns.get(9)[2]);


    }
    private void setData(int num) {
        int n = num+1;
        que.setText("Que " + n + ": " + quizQues.get(num).getQue() );
        String [] array = quizQues.get(num).getOpts();

        List<String> opt = Arrays.asList(array);

        Collections.shuffle(opt);

        opt.toArray(array);

        btn1.setText(array[0]);
        btn2.setText(array[1]);
        btn3.setText(array[2]);
        btn4.setText(array[3]);
    }


}