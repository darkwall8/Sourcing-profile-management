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
     * Gte company information
     *
     * @param userEmail "company ID"
     * @return "The company information"
     */
    @Override
    public CompanyInformation getCompanyInformation(String userEmail) {
        return repository.get(userEmail);
    }


    /**
     * Update company information
     *
     * @param userEmail "company ID"
     * @param companyInformation "company new information"
     */
    @Override
    public void updateCompanyInformation(String userEmail, CompanyInformation companyInformation) {
        repository.update(userEmail, companyInformation);
    }
}
