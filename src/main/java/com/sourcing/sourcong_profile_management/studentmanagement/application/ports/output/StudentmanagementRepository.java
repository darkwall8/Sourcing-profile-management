package com.sourcing.sourcong_profile_management.studentmanagement.application.ports.output;

import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;

public interface StudentmanagementRepository {
    StudentInformation getStudentInformation(String userEmail);
    void updateStudentInformation(String userEmail, StudentInformation studentInformation);
}
