/*
 * Copyright 2016 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right name only.
 */
package ru.bvt.notesengine.rest.dto;

import ru.bvt.notesengine.domain.Note;
import lombok.*;

import javax.persistence.Entity;

/**
 * DTO that represents full view of Note
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteFullDto {

    private long id = -1;

    private String text;

    NoteFullDto(String text) {
        this.text = text;
    }

    public static NoteFullDto toDto(Note note) {
        return new NoteFullDto(note.getText());
    }
}
