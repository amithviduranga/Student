package org.example.student.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
/**
 * Represents an error response to be returned by the API.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class ErrorResponse {
    /**
     * The HTTP status code of the error.
     */
    private int status;

    /**
     * The title of the error.
     */
    private String title;

    /**
     * The detailed message describing the error.
     */
    private String message;
}