package com.sourcing.sourcong_profile_management.companymanagement.application.ports.output;

import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;

public interface CompanymanagementRepository {
    CompanyInformation getCompanyInformation(String userEmail);
    void updateCompanyInformation(String userEmail, CompanyInformation companyInformation);
    void updateCompanyPassword(String userEmail, String newPassword,  String lastPassword);
}
