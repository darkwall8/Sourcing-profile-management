package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.adapters.input;

import com.sourcing.sourcong_profile_management.companymanagement.application.services.CompanymanagementService;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import com.sourcing.sourcong_profile_management.shared.infrastructure.dto.PasswordDto;
import org.springframework.http.ResponseEntity;
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
     * @param userEmail "company ID"
     * @return "The company information"
     */
    @GetMapping("/get-company-information/{userEmail}")
    public ResponseEntity<CompanyInformation> getCompanyInformation(@PathVariable String userEmail) {
        return ResponseEntity.ok(service.getCompanyInformation(userEmail));
    }

    /**
     * Route to create company additional information
     *
     * @param companyInformation "Company information"
     */
    @PostMapping("/create-company-information")
    public ResponseEntity<String> createCompanyInformation(@RequestBody CompanyInformation companyInformation) {
        service.createCompanyInformation(companyInformation);
        return ResponseEntity.ok("Company information created");
    }

    /**
     * Route to update information of a compony
     *
     * @param userEmail "company ID"
     * @param companyInformation "Company new information"
     */
    @PutMapping("/update-company-information/{userEmail}")
    public ResponseEntity<String> updateCompanyInformation(@PathVariable String userEmail, @RequestBody CompanyInformation companyInformation) {
        service.updateCompanyInformation(userEmail, companyInformation);
        return ResponseEntity.ok("Company information updated");
    }

    /**
     *
     * @param userEmail "Company Email"
     * @param passwordDto "Company Dto"
     */
    @PutMapping("/update-company-password/{userEmail}")
    public ResponseEntity<String> updateCompanyPassword(@PathVariable String userEmail, @RequestBody PasswordDto passwordDto) {
        service.updateCompanyPassword(userEmail, passwordDto.getPassword(), passwordDto.getNewPassword());
        return ResponseEntity.ok("Company password updated");
    }

}
