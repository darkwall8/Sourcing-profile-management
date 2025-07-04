package com.sourcing.sourcong_profile_management.studentmanagement.application.ports.output;

import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;

public interface StudentmanagementRepository {
    StudentInformation getStudentInformation(String userEmail);
    void saveStudentInformation(StudentInformation studentInformation);
    void updateStudentInformation(String userEmail, StudentInformation studentInformation);
    void updateStudentPassword(String userEmail, String newPassword,  String lastPassword);
}
