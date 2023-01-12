package lms.backend.Models;

import lms.backend.Enum.CardStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data  //@Getter and @Setter no needed
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    //connecting card and student 1 to 1 bidirectional
    @OneToOne
    @JoinColumn
    private Student student;

}
