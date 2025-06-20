package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.adapters.output;

import com.sourcing.sourcong_profile_management.companymanagement.application.ports.output.CompanymanagementRepository;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import com.sourcing.sourcong_profile_management.shared.infrastructure.adapters.input.UploadingFileController;
import org.springframework.stereotype.Repository;

@Repository
public class CompanymanagementRepositoryImpl implements CompanymanagementRepository {

    private final UploadingFileController uploadingFileController;

    public CompanymanagementRepositoryImpl(UploadingFileController uploadingFileController) {
        this.uploadingFileController = uploadingFileController;
    }

    @Override
    public CompanyInformation get(Long userId) {
        return null;
    }

    @Override
    public void update(Long userId, CompanyInformation companyInformation) {
        // TO DO
    }
}
