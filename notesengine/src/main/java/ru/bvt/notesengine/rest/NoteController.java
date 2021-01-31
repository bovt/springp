package ru.bvt.notesengine.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.bvt.notesengine.domain.*;
import ru.bvt.notesengine.rest.dto.NoteFullDto;
import ru.bvt.notesengine.repository.NoteRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class NoteController {

    private final NoteRepository repository;

    @Autowired
    public NoteController(NoteRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/notes")
    public void createOrSaveNote(@RequestBody NoteVO newNoteVO) {
        System.out.println(newNoteVO.getText());
        repository.save(new Note(newNoteVO));
    }
// TODO: наладить модель - VO, DTO. Единый подход

    @GetMapping("/notes")
    public List<NoteFullDto> getAllNotes() {
        return repository.findAll().stream().map(NoteFullDto::toDto)
                .collect(Collectors.toList());
    }
}
