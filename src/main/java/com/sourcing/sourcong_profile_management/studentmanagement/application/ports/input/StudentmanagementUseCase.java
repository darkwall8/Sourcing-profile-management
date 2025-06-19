package com.sourcing.sourcong_profile_management.studentmanagement.application.ports.input;

import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;

public interface StudentmanagementUseCase {
   StudentInformation getStudentInformation(Long studentId);
   void updateStudentInformation(Long studentId, StudentInformation studentInformation);
}
