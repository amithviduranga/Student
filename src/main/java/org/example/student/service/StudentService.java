package org.example.student.service;

import lombok.extern.log4j.Log4j2;
import org.example.student.entity.StudentData;
import org.example.student.models.SaveStudentDataRequestDTO;
import org.example.student.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class StudentService implements IStudentService{
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private ModelMapper modelMapper; //Inject model mapper bean

    @Override
    public StudentData saveStudentData(SaveStudentDataRequestDTO studentDataRequestDTO) throws Exception {
        try {
            //Map SaveStudentDataRequestDTO to entity class
           StudentData studentData = modelMapper.map(studentDataRequestDTO, StudentData.class);
            // Call repository method to save student data and return saved data into controller

            StudentData savedStudentData =  studentRepository.save(studentData);
            log.info("--------Successfully saved student data in database-------------");
            return savedStudentData;

        } catch (Exception ex) {
            // Handle  unexpected exceptions
            log.error("An error occurred while saving student data", ex);
            // Call the common method in the exception handler
            throw new Exception(ex);

        }
    }
}
