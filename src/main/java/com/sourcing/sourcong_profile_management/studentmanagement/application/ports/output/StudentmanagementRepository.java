package com.sourcing.sourcong_profile_management.studentmanagement.application.ports.output;

import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;

public interface StudentmanagementRepository {
    StudentInformation getStudentInformation(Long userId);
    void updateStudentInformation(Long userId, StudentInformation studentInformation);
}
