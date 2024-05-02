package org.example.student.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.lang.NonNull;

/**
 * Represents a request DTO for saving student data.
 * This class extends StudentData and adds additional fields for first name, last name, and sex.
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

public class SaveStudentDataRequestDTO {
    /**
     * The first name of the student.
     */
    @NonNull
    private String firstName;

    /**
     * The last name of the student.
     */
    @NonNull
    private String lastName;

    /**
     * The age of the student.
     */
    private byte age;

    /**
     * The sex of the student.
     */
    @NonNull
    private Sex sex;
}

