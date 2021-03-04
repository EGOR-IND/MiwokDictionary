package com.example.miwokdictionary;

public class User {

    private final int NO_IMAGE_PROVIDED = -1;

    private String word;
    private String meaning;
    private int image = NO_IMAGE_PROVIDED;

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

    public boolean hasImage() {
        return image != NO_IMAGE_PROVIDED;
    }
}
