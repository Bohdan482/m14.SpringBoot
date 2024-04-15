package com.example.module14springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(NoteService.class, args);
//    NoteService service = new NoteService();
//    Note note = new Note();
//    note.setId(1);
//    note.setTitle("First note");
//    note.setContent("This is first note content");
//    Note note1 = new Note();
//    note1.setId(2);
//    note1.setTitle("Second note");
//    note1.setContent("This is second note content");
//    service.add(note);
//    service.add(note1);
//
//    Note note2 = new Note();
//    note2.setId(3);
//    note2.setTitle("Third note");
//    note2.setContent("This is third note content");
//
//
////        service.deleteById(3);
////
////        System.out.println(service.listAll());
//
//
//    service.update(note2);
//        System.out.println(service.listAll());
    }

}
