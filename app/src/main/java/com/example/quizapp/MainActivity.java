package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         String[] questions = {"The hummingbird's egg is the world's smallest bird egg.",
                "Pinocchio was Walt Disney’s first animated feature film in full color.",
                "Venezuela is home to the world’s highest waterfall.","South Africa has one capital.",
                "Vatican City is the smallest country in the world." };
         boolean[] answers = {true, false, true, false, true};
        final int[] index = {0};
        final int[] score = {0};
        Button yes = findViewById(R.id.button);
        Button no = findViewById(R.id.button2);
        TextView question = findViewById(R.id.textView);
        question.setText(questions[index[0]]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index[0] < questions.length) {
                    if (answers[index[0]]) {
                        score[0]++;
                    }
                    index[0]++;
                    if(index[0] <questions.length) {
                        question.setText(questions[index[0]]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Score: " + Arrays.toString(score), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index[0] < questions.length) {
                    if (!answers[index[0]]) {
                        score[0]++;
                    }
                    index[0]++;
                    if(index[0] <questions.length) {
                        question.setText(questions[index[0]]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Score: " + Arrays.toString(score), Toast.LENGTH_SHORT).show();
                    }
                }
            }
            });
    }
}