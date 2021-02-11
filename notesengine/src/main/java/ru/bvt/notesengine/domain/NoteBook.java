package ru.bvt.notesengine.domain;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "note_book")
public class NoteBook {

    @Id  // без стратегии генерации, т.к. используется как логин + задаётся в data.sql и нужен в смежных генерациях
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

}
