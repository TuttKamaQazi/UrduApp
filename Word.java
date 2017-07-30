package com.example.benbair.urdulike;

/**
 * Created by zubai on 7/29/2017.
 */

public class Word {

    private String english;
    private String urdu;
    private String romanUrdu;

    public Word(){
        english = "test";
        urdu = "test";
        romanUrdu = "test";
    }
    public Word(String e, String u, String ru){
        english = e;
        urdu = u;
        romanUrdu = ru;
    }

    public String getEnglish(){
        return english;
    }
    public String getUrdu(){
        return urdu;
    }
    public String getRomanUrdu(){
        return romanUrdu;
    }


}