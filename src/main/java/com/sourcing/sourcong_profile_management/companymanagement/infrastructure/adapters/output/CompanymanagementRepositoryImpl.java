package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.adapters.output;

import com.sourcing.sourcong_profile_management.companymanagement.application.ports.output.CompanymanagementRepository;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import com.sourcing.sourcong_profile_management.companymanagement.infrastructure.dto.CompanyDto;
import com.sourcing.sourcong_profile_management.shared.infrastructure.APIClient;
import com.sourcing.sourcong_profile_management.shared.infrastructure.adapters.input.UploadingFileController;
import com.sourcing.sourcong_profile_management.shared.infrastructure.dto.PasswordDto;
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
    public CompanyInformation getCompanyInformation(String companyEmail) {
        return apiClient.get(apiClient.getBaseUrl() + "/api/users/email/" + companyEmail, CompanyInformation.class).getBody();
    }

    @Override
    public void updateCompanyInformation(String companyEmail, CompanyInformation companyInformation) {
        CompanyDto companyDto = new CompanyDto(companyInformation);
        this.apiClient.put(apiClient.getBaseUrl() + "/api/users/" + companyEmail, companyDto, CompanyInformation.class);
    }

    @Override
    public void updateCompanyPassword(String companyEmail, String password, String newPassword) {
        PasswordDto passwordDto = new PasswordDto(password, newPassword, companyEmail);
        this.apiClient.put(apiClient.getBaseUrl() + "/api/auth/update/password" + companyEmail, passwordDto.getJsonPObject(), PasswordDto.class);
    }
}