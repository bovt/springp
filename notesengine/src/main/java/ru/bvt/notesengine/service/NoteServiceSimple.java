package ru.bvt.notesengine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bvt.notesengine.domain.Note;
import ru.bvt.notesengine.repository.NoteRepository;
import ru.bvt.notesengine.rest.dto.NoteFullDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NoteServiceSimple implements NoteService {

    private final NoteRepository repository;

    @Autowired
    public NoteServiceSimple(NoteRepository repository) {
        this.repository = repository;
    }

    public void createOrSaveNote(NoteFullDto newNoteDTO) {
        System.out.println(newNoteDTO.getText());
        repository.save(new Note(newNoteDTO));
    }

    public List<NoteFullDto> getAllNotes() {
        return repository.findAll().stream().map(NoteFullDto::toDto)
                .collect(Collectors.toList());
    }

}
