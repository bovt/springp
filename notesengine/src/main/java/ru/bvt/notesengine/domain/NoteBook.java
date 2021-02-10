package ru.bvt.notesengine.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NoteBook {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String apiKey;
    private String codingKey;
    private int noteTTLInDays;

    public NoteBook() {
    }

    public NoteBook(String text) {
        this.name = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getCodingKey() {
        return codingKey;
    }

    public void setCodingKey(String codingKey) {
        this.codingKey = codingKey;
    }

    public int getNoteTTLInDays() {
        return noteTTLInDays;
    }

    public void setNoteTTLInDays(int noteTTLInDays) {
        this.noteTTLInDays = noteTTLInDays;
    }
}
