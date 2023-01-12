package lms.backend.RequestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentRequestDto {

    private String name;

    private int age;

    private String country;

    @Column(name="student Email", unique = true, nullable = false)
    private String email;


}
