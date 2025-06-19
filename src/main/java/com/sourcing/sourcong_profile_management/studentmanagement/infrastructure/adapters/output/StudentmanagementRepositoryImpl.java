package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.adapters.output;

import com.sourcing.sourcong_profile_management.studentmanagement.application.ports.output.StudentmanagementRepository;
import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;
import org.springframework.stereotype.Repository;

@Repository
public class StudentmanagementRepositoryImpl implements StudentmanagementRepository {

    @Override
    public StudentInformation getStudentInformation(Long userId) {
        return null;
    }

    @Override
    public void updateStudentInformation(Long userId, StudentInformation studentInformation) {
        // TO DO
    }
}
