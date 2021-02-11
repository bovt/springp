package ru.bvt.notesengine.domain;

import ru.bvt.notesengine.rest.dto.NoteFullDto;
import javax.persistence.*;
import javax.validation.constraints.Null;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name="note")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // TODO: Разобраться как в data.sql заказывать автогенерацию для этого поля
    @Column(name = "id", nullable = false, unique = true)
    private long id;

    @ManyToOne(targetEntity = NoteBook.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "notebook_id")
    private NoteBook noteBookId;

    @Column(name = "text", nullable = false, unique = true)
    private String text;

    public Note(String text) {
        System.out.println(text);
        this.text = text;
    }

    public Note(NoteFullDto fullDto) {
        this.text = fullDto.getText();
//       this.noteBookId;
// TODO: наладить подтягивание в запощеную заметку значения нотебука из агента
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + text + '\'' +
                '}';
    }

}
