package com.tutorialspoint;


public class Task {
    private String words;
    private Type type;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        FIRST,
        SECOND
    }
}
