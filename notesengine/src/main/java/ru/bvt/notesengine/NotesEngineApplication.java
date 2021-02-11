package ru.bvt.notesengine;

import org.h2.tools.Console;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.bvt.notesengine.domain.Note;
import ru.bvt.notesengine.repository.NoteRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class NotesEngineApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NotesEngineApplication.class, args);
        System.out.println("Hello world");
        //     Console.main(args);

    }

    @Autowired
    private NoteRepository repository;

    @PostConstruct
    public void init() {
//        repository.save(new Note("777Съешь же ещё этих мягких французских булок да выпей чаю."));
        //       repository.save(new Note("The five boxing wizards jump quickly."));
    }
}
