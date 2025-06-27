package com.sourcing.sourcong_profile_management.companymanagement.application.services;

import com.sourcing.sourcong_profile_management.companymanagement.application.ports.input.CompanymanagementUseCase;
import com.sourcing.sourcong_profile_management.companymanagement.application.ports.output.CompanymanagementRepository;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import org.springframework.stereotype.Service;

@Service
public class CompanymanagementService implements CompanymanagementUseCase {
    private final CompanymanagementRepository repository;

    public CompanymanagementService(CompanymanagementRepository repository) {
        this.repository = repository;
    }

    /**
     * Get company information
     *
     * @param userEmail "company ID"
     * @return "The company information"
     */
    @Override
    public CompanyInformation getCompanyInformation(String userEmail) {
        return repository.getCompanyInformation(userEmail);
    }

    /**
     * Save company information
     *
     * @param companyInformation "Company information"
     */
    @Override
    public void createCompanyInformation(CompanyInformation companyInformation) {
        repository.saveCompanyInformation(companyInformation);
    }


    /**
     * Update company information
     *
     * @param userEmail "company Email"
     * @param companyInformation "company new information"
     */
    @Override
    public void updateCompanyInformation(String userEmail, CompanyInformation companyInformation) {
        repository.updateCompanyInformation(userEmail, companyInformation);
    }

    /**
     *
     * @param userEmail "Company Email"
     * @param password "Company last password"
     * @param newPassword "Company new password"
     */
    @Override
    public void updateCompanyPassword(String userEmail, String password, String newPassword) {
        repository.updateCompanyPassword(userEmail, password, newPassword);
    }
}
