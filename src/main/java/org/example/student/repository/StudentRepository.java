package org.example.student.repository;

import org.example.student.entity.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing student data.
 * This interface provides CRUD (Create, Read, Update, Delete) operations for the StudentData entity.
 */
public interface StudentRepository extends JpaRepository <StudentData,Integer>{

    // No additional methods are added as JpaRepository provides all necessary CRUD operations.

}
