package com.example.module14springboot;

public class NoteNotFoundException extends Exception{
    public NoteNotFoundException(String errorMassage){
        super(errorMassage);
    }
}
