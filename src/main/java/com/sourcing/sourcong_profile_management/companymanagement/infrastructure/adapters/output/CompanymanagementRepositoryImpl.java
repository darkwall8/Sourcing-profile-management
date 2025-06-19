package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.adapters.output;

import com.sourcing.sourcong_profile_management.companymanagement.application.ports.output.CompanymanagementRepository;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import org.springframework.stereotype.Repository;

@Repository
public class CompanymanagementRepositoryImpl implements CompanymanagementRepository {

    @Override
    public CompanyInformation get(Long userId) {
        return null;
    }

    @Override
    public void update(Long userId, CompanyInformation companyInformation) {
        // TO DO
    }
}
