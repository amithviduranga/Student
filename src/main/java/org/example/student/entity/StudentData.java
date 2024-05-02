package org.example.student.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.student.models.Sex;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@Table(name = "studentdb")
@Entity
@Data
public class StudentData {

@Id
@Column(name = "Id")
@GeneratedValue
private int id;

@Column(name = "firstName")
    private String firstName;
@Column(name = "lastName")
    private String lastName;
@Column(name="age")
    private byte age;
    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private Sex sex;

}
