package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.adapters.input;

import com.sourcing.sourcong_profile_management.shared.infrastructure.dto.PasswordDto;
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

    @GetMapping("/get-student-information/{userEmail}")
    public StudentInformation getStudentInformation(@PathVariable String userEmail) {
        return service.getStudentInformation(userEmail);
    }

    @PutMapping("/update-student-information/{userEmail}")
    public void updateStudentInformation(@RequestBody StudentInformation studentInformation, @PathVariable String userEmail) {
        service.updateStudentInformation(userEmail, studentInformation);
    }

    @PutMapping("/update-student-password/{userEmail}")
    public void updateStudentPassword(@PathVariable String userEmail, @RequestBody PasswordDto passwordDto) {
        service.updateStudentPassword(userEmail, passwordDto.getPassword(), passwordDto.getNewPassword());
    }
}
