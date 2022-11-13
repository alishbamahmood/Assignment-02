package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;


public class MainActivity extends AppCompatActivity {

    TextView course, que;
    Button btn1, btn2, btn3, btn4;

    ArrayList<Quiz> quizQues = new ArrayList<>();

    Random rnd;
    int score,rndNumber;
    int i=0;

    Integer[] selected = new Integer[]{};

    List<Integer> selectedList = new ArrayList<>(Arrays.asList(selected));


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course = findViewById(R.id.course);
        que = findViewById(R.id.que);

        btn1 = findViewById(R.id.opt1);
        btn2 = findViewById(R.id.opt2);
        btn3 = findViewById(R.id.opt3);
        btn4 = findViewById(R.id.opt4);

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
                if(quizQues.get(i).getAnswer().equals(btn1.getText().toString()))
                {
                    btn1.setBackgroundColor(Color.GREEN);
                    score++;

                }
                btn1.setBackgroundColor(Color.RED);
                setData(++i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQues.get(i).getAnswer().equals(btn2.getText().toString()))
                {
                    score++;
                    btn2.setBackgroundColor(Color.GREEN);
                }
                btn2.setBackgroundColor(Color.RED);
                setData(++i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQues.get(i).getAnswer().equals(btn3.getText().toString()))
                {
                    score++;
                    btn3.setBackgroundColor(Color.GREEN);
                }
                btn3.setBackgroundColor(Color.RED);
                setData(++i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizQues.get(i).getAnswer().equals(btn4.getText().toString()))
                {
                    score++;
                    btn4.setBackgroundColor(Color.GREEN);
                }
                btn4.setBackgroundColor(Color.RED);
                setData(++i);
            }
        });



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