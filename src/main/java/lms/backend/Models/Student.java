package lms.backend.Models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name="student")  // see isse kya hoga
@Data // getters setters
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(name="student_Email", unique = true, nullable = false)
    private String email;

    private int age;

    @Column(columnDefinition = "varchar(255) default 'India' ")
    private String country;

    @CreationTimestamp // jab ye date create hua, to autimatically create date
    private Date createdOn;

    public Student(String name, String email, int age, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }

    //bidirectional
    @OneToOne(mappedBy = "student" ,cascade=CascadeType.ALL)//student variable name we used in child class
    private Card card;  //card is variable name we used in this class for child class
}
