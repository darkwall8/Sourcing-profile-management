package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.adapters.input;

import com.sourcing.sourcong_profile_management.shared.infrastructure.dto.PasswordDto;
import com.sourcing.sourcong_profile_management.studentmanagement.application.services.StudentmanagementService;
import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studentmanagement")
public class StudentmanagementController {

    private final StudentmanagementService service;

    public StudentmanagementController(StudentmanagementService service) {
        this.service = service;
    }

    /**
     * Get Student information
     *
     * @param userEmail "Student Email"
     * @return "The status code with a student information"
     */
    @GetMapping("/get-student-information/{userEmail}")
    public ResponseEntity<StudentInformation> getStudentInformation(@PathVariable String userEmail) {
        return ResponseEntity.ok(service.getStudentInformation(userEmail));
    }

    /**
     * Save student information
     *
     * @param studentInformation "Student information to save"
     */
    @PostMapping("/save-student-information")
    public ResponseEntity<String> SaveStudentAdditionalInformation(@RequestBody StudentInformation studentInformation){
        service.saveStudentInformation(studentInformation);
        return ResponseEntity.ok("Student information saved");
    }

    /**
     * Update Student information
     *
     * @param studentInformation "new Student information"
     * @param userEmail "Student Email"
     */
    @PutMapping("/update-student-information/{userEmail}")
    public ResponseEntity<String> updateStudentInformation(@RequestBody StudentInformation studentInformation, @PathVariable String userEmail) {
        service.updateStudentInformation(userEmail, studentInformation);
        return ResponseEntity.ok("Student information updated");
    }

    /**
     * Update the Student password
     *
     * @param userEmail "Student Email"
     * @param passwordDto "Student password and updatedPassword"
     */
    @PutMapping("/update-student-password/{userEmail}")
    public ResponseEntity<String> updateStudentPassword(@PathVariable String userEmail, @RequestBody PasswordDto passwordDto) {
        service.updateStudentPassword(userEmail, passwordDto.getPassword(), passwordDto.getNewPassword());
        return ResponseEntity.ok("Student password updated");
    }
}
