package org.example.student.controller;

import lombok.extern.log4j.Log4j2;
import org.example.student.entity.StudentData;
import org.example.student.models.SaveStudentDataRequestDTO;
import org.example.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for handling student-related HTTP requests.
 */
@RestController
@Log4j2
public class studentController {
    @Autowired
    IStudentService studentService;

    /**
     * Endpoint for saving student data.
     *
     * @param studentDataRequestDTO The request body containing the data of the student to be saved.
     * @return The saved student data.
     * @throws Exception If an error occurs while saving the student data.
     */
    @PostMapping("/saveStudentData")
    public ResponseEntity<?> saveStudentData(@RequestBody SaveStudentDataRequestDTO studentDataRequestDTO) throws Exception {

        // Attempt to save student data
        StudentData savedStudentData = studentService.saveStudentData(studentDataRequestDTO);
        // Return success response with saved student data
        return ResponseEntity.ok(savedStudentData);

    }

}
