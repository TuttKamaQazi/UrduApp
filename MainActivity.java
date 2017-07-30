package com.example.benbair.urdulike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Word> wordList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button animal = (Button) findViewById(R.id.animal);
        animal.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                wordList = new ArrayList<Word>();
                Scanner scan = new Scanner(animals);

                int i = 0;
                while(scan.hasNext()){
                    wordList.add(i, new Word(scan.next(), scan.next(), scan.next()));
                    i++;
                }

                Intent intent = new Intent(MainActivity.this, Game.class);
                startActivity(intent);
            }
        });

    }


    public String animals = "Frog مینڈک Maindak\n" +
            "Panda پانڈا Panda\n" +
            "Bear ریچه Reechh\n" +
            "Giraffe زرافه Ziraffa\n" +
            "Pony ٹٹو Tattu\n" +
            "Buffalo بھینس Bhens\n" +
            "Goat بکرا Bakra\n" +
            "Bull بیل Bail\n" +
            "Rabbit خرگوش Khargosh\n" +
            "Camel اونٹ Oanth\n" +
            "Rat چوہا Chooha\n" +
            "Cat بلی Billi\n" +
            "Horse گهوڑا Ghora\n" +
            "Rhinoceros گینڈا Gainda\n" +
            "Cheetah چیتا Cheeta\n" +
            "Kangaroo کنگرو Kangaroo\n" +
            "Sheep بهیڑ Bhair\n" +
            "Cow گائے Gaae\n" +
            "Leopard چیتا Cheeta\n" +
            "Snake سانپ Saanp\n" +
            "Deer ہرن Hiran\n" +
            "Lion شیر Sher\n" +
            "Squirrel گلہری Gulahri\n" +
            "Dog کتا Kutta\n" +
            "Monkey بندر Bandar\n" +
            "Tiger شیر Sher\n" +
            "Donkey گدها Gadha\n" +
            "Mouse چوها Chooha\n" +
            "Wolf بهیڑیا Bheyrya\n" +
            "Elephant ہاتھی Haatthi\n" +
            "Zebra زیبرا Zebra\n" +
            "Fox لومڑی Lomri\n";


}
