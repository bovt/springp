package ru.bvt.notesengine.domain;

public class NoteVO {

    private int extId; // Id заметки из внешней системы-источника заметки (telegram и др)
    private String author;
    private String text;
    private String timestamp;

    public NoteVO(int extId, String author, String text, String timestamp) {
        this.extId = extId;
        this.author = author;
        this.text = text;
        this.timestamp = timestamp;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public int getExtId() {
        return extId;
    }

    public void setExtId(int extId) {
        this.extId = extId;
    }
}
