package com.example.miwokdictionary;

public class User {
    public String word;
    public String meaning;
    public int image;

    public User(String word, String meaning, int image){
        this.word = word;
        this.meaning = meaning;
        this.image = image;
    }

    public String getWord(){
        return word;
    }

    public String getMeaning(){
        return meaning;
    }

    public int getImage(){
        return image;
    }
}
