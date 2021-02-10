package ru.bvt.notesengine.domain;

import ru.bvt.notesengine.rest.dto.NoteFullDto;

import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue
    private int id;

    private int extId; // Id заметки из внешней системы-источника заметки (telegram и др)

    //   @OneToMany(targetEntity = NoteAgent.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private int agentId;

    //   @OneToMany(targetEntity = NoteBook.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private int noteBookId;

    private String author;
    private String text;
    private String timestamp;

    public Note() {
    }

    public Note(String text) {
        this.text = text;
        this.extId = 0;
        this.author = "";
    }

    public Note(NoteVO fullDto) {
        this.text = fullDto.getText();
        this.extId = 0;
        this.author = "";
        // TODO: дополнить конструктор всеми полями из DTO
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

    public void setText(String name) {
        this.text = name;
    }

    public int getExtId() {
        return extId;
    }

    public void setExtId(int extId) {
        this.extId = extId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getAgentId() {
        return agentId;
    }

    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    public int getNoteBookId() {
        return noteBookId;
    }

    public void setNoteBookId(int noteBookId) {
        this.noteBookId = noteBookId;
    }


}
