package ru.bvt.tgnotesagent.model;

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
}
