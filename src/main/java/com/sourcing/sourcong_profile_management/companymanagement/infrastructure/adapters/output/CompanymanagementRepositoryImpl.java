package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.adapters.output;

import com.sourcing.sourcong_profile_management.companymanagement.application.ports.output.CompanymanagementRepository;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import com.sourcing.sourcong_profile_management.shared.infrastructure.APIClient;
import com.sourcing.sourcong_profile_management.shared.infrastructure.adapters.input.UploadingFileController;
import org.springframework.stereotype.Repository;

@Repository
public class CompanymanagementRepositoryImpl implements CompanymanagementRepository {

    private final UploadingFileController uploadingFileController;
    private final APIClient apiClient;

    public CompanymanagementRepositoryImpl(UploadingFileController uploadingFileController, APIClient apiClient) {
        this.uploadingFileController = uploadingFileController;
        this.apiClient = apiClient;
    }

    @Override
    public CompanyInformation get(String userEmail) {
        return apiClient.get("/api/users/email/" + userEmail, CompanyInformation.class).getBody();
    }

    @Override
    public void update(String userEmail, CompanyInformation companyInformation) {
        this.apiClient.put("/api/users/" + userEmail, companyInformation, CompanyInformation.class);
    }
}
