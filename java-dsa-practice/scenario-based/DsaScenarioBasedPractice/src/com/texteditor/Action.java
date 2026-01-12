package com.texteditor;

public class Action {
    protected String type;  
    protected String text;

    public Action(String type, String text) {
        this.type = type;
        this.text = text;
    }
}