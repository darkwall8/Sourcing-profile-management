package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.adapters.input;

import com.sourcing.sourcong_profile_management.studentmanagement.application.services.StudentmanagementService;
import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studentmanagement")
public class StudentmanagementController {

    private final StudentmanagementService service;

    public StudentmanagementController(StudentmanagementService service) {
        this.service = service;
    }

    @GetMapping("/get-student-information/{userid}")
    public StudentInformation getStudentInformation(@PathVariable String studentEmail) {
        return service.getStudentInformation(studentEmail);
    }

    @PutMapping("/update-student-information/{userId}")
    public void updateStudentInformation(@RequestBody StudentInformation studentInformation, @PathVariable String studentEmail) {
        service.updateStudentInformation(studentEmail, studentInformation);
    }
}
