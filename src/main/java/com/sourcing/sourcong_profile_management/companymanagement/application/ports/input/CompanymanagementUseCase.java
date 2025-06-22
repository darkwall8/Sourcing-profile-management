package com.sourcing.sourcong_profile_management.companymanagement.application.ports.input;

import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;

public interface CompanymanagementUseCase {
    CompanyInformation getCompanyInformation(String userEmail);
    void updateCompanyInformation (String userEmail, CompanyInformation companyInformation);
}
