package com.example.pj3.Models;

public class Words {
    private static String words;

    public Words(String words) {
        this.words = words;

    }

    public String toString(){
        return words;
    }

    public static String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}
