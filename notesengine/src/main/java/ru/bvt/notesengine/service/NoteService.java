package ru.bvt.notesengine.service;

import ru.bvt.notesengine.rest.dto.NoteFullDto;

import java.util.List;

public interface NoteService {

    void createOrSaveNote(NoteFullDto newNoteDTO);
    List<NoteFullDto> getAllNotes();
}
