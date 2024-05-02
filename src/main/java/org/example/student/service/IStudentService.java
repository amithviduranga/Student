package org.example.student.service;

import org.example.student.entity.StudentData;
import org.example.student.models.SaveStudentDataRequestDTO;
import org.springframework.stereotype.Service;

/**
 * Interface for managing Student Deta in a service layer.
 * This interface defines the contract for saving student Data.
 *
 * @author Amith
 */
@Service
public interface IStudentService  {

    /**
     * Saves student data.
     *
     * @param studentDataRequestDTO The data of the student to be saved.
     * @return The saved student data.
     * @throws Exception If an error occurs while saving the student data.
     */
     StudentData saveStudentData(SaveStudentDataRequestDTO studentDataRequestDTO) throws Exception ;
}
