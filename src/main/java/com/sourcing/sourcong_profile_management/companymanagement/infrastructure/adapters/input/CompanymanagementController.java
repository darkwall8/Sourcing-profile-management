package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.adapters.input;

import com.sourcing.sourcong_profile_management.companymanagement.application.services.CompanymanagementService;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company-management")
public class CompanymanagementController {

    private final CompanymanagementService service;

    public CompanymanagementController(CompanymanagementService service) {
        this.service = service;
    }

    /**
     * Route to get company information
     *
     * @param userId "company ID"
     * @return "The company information"
     */
    @GetMapping("/get-company-information/{userId}")
    public CompanyInformation getCompanyInformation(@PathVariable String userId) {
        return service.getCompanyInformation(userId);
    }

    /**
     * Route to update information of a compony
     *
     * @param userId "company ID"
     * @param companyInformation "Company new information"
     */
    @PutMapping("/update-company-information/{userId}")
    public void updateCompanyInformation(@PathVariable String userId, @RequestBody CompanyInformation companyInformation) {
        service.updateCompanyInformation(userId, companyInformation);
    }

}
