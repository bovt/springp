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

/**
 * DTO that represents brief view of Note
 */

public class NoteBriefDto {

    private int id = -1;
    private String text;

    public NoteBriefDto() {
    }

    public NoteBriefDto(int id, String text) {
        this.id = id;
        this.text = text.substring(0, 10);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static NoteBriefDto toDto(Note note) {
        return new NoteBriefDto(note.getId(), note.getText());
    }
}
