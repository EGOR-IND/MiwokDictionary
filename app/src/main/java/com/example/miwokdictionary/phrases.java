package com.example.miwokdictionary;

public class phrases {
    public String word;
    public String meaning;

    public phrases(String word, String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord(){
        return word;
    }

    public String getMeaning(){
        return meaning;
    }
}
