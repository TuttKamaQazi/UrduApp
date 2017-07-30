package com.example.benbair.urdulike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game extends AppCompatActivity {

    TextView question;
    TextView streakText;
    Button one;
    Button two;
    Button three;

    int streakCount;
    int quest;

    Word wordOne;
    Word wordTwo;
    Word wordThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        streakCount = 0;
        streakText = (TextView) findViewById(R.id.streakTextView);
        streakText.setText("Streak: " + streakCount);

        /*
        wordOne = new Word("Dog","کتا","kutta");
        wordTwo = new Word("Cat","...","billi");
        wordThree = new Word("Bird","...","parinda");
        */

        question = (TextView) findViewById(R.id.questionTextView);
        one = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);

        getWords();


    }

    public void oneClick(View v){
        if(quest == 1){
            streakCount++;
            streakText.setText("Streak: " + streakCount);
        }else{
            streakCount = 0;
            streakText.setText("Streak: " + streakCount);
        }
        getWords();
    }
    public void twoClick(View v){
        if(quest == 2){
            streakCount++;
            streakText.setText("Streak: " + streakCount);
        }else{
            streakCount = 0;
            streakText.setText("Streak: " + streakCount);
        }
        getWords();
    }
    public void threeClick(View v){
        if(quest == 3){
            streakCount++;
            streakText.setText("Streak: " + streakCount);
        }else{
            streakCount = 0;
            streakText.setText("Streak: " + streakCount);
        }
        getWords();
    }

    public void getWords(){
        int randOne = (int) (Math.random() * MainActivity.wordList.size());
        int randTwo = (int) (Math.random() * MainActivity.wordList.size());
        int randThree = (int) (Math.random() * MainActivity.wordList.size());

        wordOne = MainActivity.wordList.get(randOne);
        wordTwo = MainActivity.wordList.get(randTwo);
        wordThree = MainActivity.wordList.get(randThree);

        quest = (int) (Math.random() * 3 + 1);
        if(quest == 1){
            question.setText(wordOne.getEnglish());
        }
        if(quest == 2){
            question.setText(wordTwo.getEnglish());
        }
        if(quest == 3){
            question.setText(wordThree.getEnglish());
        }

        one.setText(wordOne.getUrdu() + "\n" + wordOne.getRomanUrdu());
        two.setText(wordTwo.getUrdu() + "\n" + wordTwo.getRomanUrdu());
        three.setText(wordThree.getUrdu() + "\n" + wordThree.getRomanUrdu());
    }
}
