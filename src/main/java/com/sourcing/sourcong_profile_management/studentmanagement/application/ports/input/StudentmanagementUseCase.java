package com.sourcing.sourcong_profile_management.studentmanagement.application.ports.input;

import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;

public interface StudentmanagementUseCase {
   StudentInformation getStudentInformation(String studentEmail);
   void saveStudentInformation(StudentInformation studentInformation);
   void updateStudentInformation(String studentEmail, StudentInformation studentInformation);
   void updateStudentPassword(String studentEmail, String studentPassword, String newPassword);
}
