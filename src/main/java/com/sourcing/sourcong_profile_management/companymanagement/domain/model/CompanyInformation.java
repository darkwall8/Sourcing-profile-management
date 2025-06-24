package com.sourcing.sourcong_profile_management.companymanagement.domain.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sourcing.sourcong_profile_management.shared.domain.model.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompanyInformation {
    private Long id;
    private Long userId;
    private String companyPhone;
    private Long companyActivitySectorId;
    private String companyAddress;
    private String companyWebsite;
    private String companyCorporate;
    private String companyLocation;
    private String companyRCCM;
    private String companyNIU;
    private String companyCommercialRegister;
    private String companyLegalStatus;
    private String companyTaxConformityCertificate;
    private String companyStaticalDeclarationNumber;
    private String companyInternShipDuration;
    private String companyDescription;
    private Boolean companyHasInternOpportunity;
    private User user;
    private JSONPObject jsonpObject;

    public CompanyInformation(User user, Long id, Long userId, String companyPhone, Long companyActivitySectorId, String companyAddress, String companyWebsite, String companyCorporate, String companyLocation, String companyRCCM, String companyNIU, String companyCommercialRegister, String companyLegalStatus, String companyTaxConformityCertificate, String companyStaticalDeclarationNumber, String companyInternShipDuration, String companyDescription, Boolean companyHasInternOpportunity) {
        this.user = user;
        this.id = id;
        this.userId = userId;
        this.companyPhone = companyPhone;
        this.companyActivitySectorId = companyActivitySectorId;
        this.companyAddress = companyAddress;
        this.companyWebsite = companyWebsite;
        this.companyCorporate = companyCorporate;
        this.companyLocation = companyLocation;
        this.companyRCCM = companyRCCM;
        this.companyNIU = companyNIU;
        this.companyCommercialRegister = companyCommercialRegister;
        this.companyLegalStatus = companyLegalStatus;
        this.companyTaxConformityCertificate = companyTaxConformityCertificate;
        this.companyStaticalDeclarationNumber = companyStaticalDeclarationNumber;
        this.companyInternShipDuration = companyInternShipDuration;
        this.companyDescription = companyDescription;
        this.companyHasInternOpportunity = companyHasInternOpportunity;

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            this.jsonpObject = new JSONPObject("data", objectMapper.valueToTree(this));
        } catch (Exception e) {
            throw new RuntimeException("Error during JSON conversion", e);
        }
    }
}
