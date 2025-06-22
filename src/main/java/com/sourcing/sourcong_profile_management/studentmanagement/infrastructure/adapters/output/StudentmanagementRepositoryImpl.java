package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.adapters.output;

import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import com.sourcing.sourcong_profile_management.shared.infrastructure.APIClient;
import com.sourcing.sourcong_profile_management.shared.infrastructure.adapters.input.UploadingFileController;
import com.sourcing.sourcong_profile_management.studentmanagement.application.ports.output.StudentmanagementRepository;
import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;
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
        this.apiClient.put(apiClient.getBaseUrl() + "/api/users/" + userEmail, studentInformation, StudentInformation.class);
    }
}