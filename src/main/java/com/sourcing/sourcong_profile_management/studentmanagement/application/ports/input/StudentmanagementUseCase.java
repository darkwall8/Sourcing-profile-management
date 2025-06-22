package com.sourcing.sourcong_profile_management.studentmanagement.application.ports.input;

import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;

public interface StudentmanagementUseCase {
   StudentInformation getStudentInformation(String studentEmail);
   void updateStudentInformation(String studentEmail, StudentInformation studentInformation);
}
