package com.sourcing.sourcong_profile_management.studentmanagement.application.services;

import com.sourcing.sourcong_profile_management.studentmanagement.application.ports.input.StudentmanagementUseCase;
import com.sourcing.sourcong_profile_management.studentmanagement.application.ports.output.StudentmanagementRepository;
import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;
import org.springframework.stereotype.Service;

@Service
public class StudentmanagementService implements StudentmanagementUseCase {
    private final StudentmanagementRepository repository;

    public StudentmanagementService(StudentmanagementRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentInformation getStudentInformation(Long studentId) {
        repository.getStudentInformation(studentId);
        // TO DO
        return null;
    }

    @Override
    public void updateStudentInformation(Long studentId, StudentInformation studentInformation) {
        repository.updateStudentInformation(studentId, studentInformation);
        // TO DO
    }
}
