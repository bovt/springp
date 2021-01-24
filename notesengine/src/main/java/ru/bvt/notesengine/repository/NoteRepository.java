package ru.bvt.notesengine.repository;

import org.springframework.data.repository.CrudRepository;
import ru.bvt.notesengine.domain.Note;

import java.util.List;

public interface NoteRepository extends CrudRepository<Note, Integer> {

    List<Note> findAll();
}
