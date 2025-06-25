package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.adapters.output;

import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import com.sourcing.sourcong_profile_management.shared.infrastructure.APIClient;
import com.sourcing.sourcong_profile_management.shared.infrastructure.adapters.input.UploadingFileController;
import com.sourcing.sourcong_profile_management.shared.infrastructure.dto.PasswordDto;
import com.sourcing.sourcong_profile_management.studentmanagement.application.ports.output.StudentmanagementRepository;
import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;
import com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.dto.StudentDto;
import org.springframework.stereotype.Repository;

@Repository
public class StudentmanagementRepositoryImpl implements StudentmanagementRepository {

    private final UploadingFileController uploadingFileController;
    private final APIClient apiClient;

    public StudentmanagementRepositoryImpl(UploadingFileController uploadingFileController, APIClient apiClient) {
        this.uploadingFileController = uploadingFileController;
        this.apiClient = apiClient;
    }

    @Override
    public StudentInformation getStudentInformation(String userEmail) {
        return apiClient.get(apiClient.getBaseUrl() + "/api/users/email/" + userEmail, StudentInformation.class).getBody();
    }

    @Override
    public void updateStudentInformation(String userEmail, StudentInformation studentInformation) {
        StudentDto studentDto = new StudentDto(studentInformation);
        this.apiClient.put(apiClient.getBaseUrl() + "/api/users/" + userEmail, studentDto, StudentInformation.class);
    }

    @Override
    public void updateStudentPassword(String companyEmail, String password, String newPassword) {
        PasswordDto passwordDto = new PasswordDto(password, newPassword, companyEmail);
        this.apiClient.put(apiClient.getBaseUrl() + "/api/auth/update/password" + companyEmail, passwordDto.getJsonPObject(), PasswordDto.class);
    }
}