package ru.bvt.notesengine.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NoteAgent {

    @Id
    @GeneratedValue
    private int id;
    private String agentKey;
    private String name;

    public NoteAgent() {
    }

    public NoteAgent(String text) {
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

    public String getAgentKey() {
        return agentKey;
    }

    public void setAgentKey(String agentKey) {
        this.agentKey = agentKey;
    }
}
