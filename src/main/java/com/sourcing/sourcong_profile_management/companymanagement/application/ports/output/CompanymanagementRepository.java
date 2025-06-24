package com.sourcing.sourcong_profile_management.companymanagement.application.ports.output;

import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;

public interface CompanymanagementRepository {
    CompanyInformation get(String userEmail);
    void update(String userEmail, CompanyInformation companyInformation);
    void updatePassword(String userEmail, String newPassword,  String lastPassword);
}
