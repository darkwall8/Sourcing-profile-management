package com.sourcing.sourcong_profile_management.companymanagement.application.ports.output;

import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;

public interface CompanymanagementRepository {
    CompanyInformation get(Long userId);
    void update(Long userId, CompanyInformation companyInformation);
}
