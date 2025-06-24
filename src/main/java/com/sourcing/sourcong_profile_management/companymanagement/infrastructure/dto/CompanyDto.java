package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.dto;

import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import com.sourcing.sourcong_profile_management.shared.domain.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {
    private String name;
    private Boolean hasPremium;
    private String email;
    private Boolean isActivated;
    private Number role_id;
    private Number id;
    private Number userId;
    private String companyPhone;
    private Number companyActivitySectorId;
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

    public CompanyDto(CompanyInformation companyInformation) {
        this.userId = companyInformation.getUser().getId();
        this.name = companyInformation.getUser().getName();
        this.hasPremium = companyInformation.getUser().getHasPremium();
        this.email = companyInformation.getUser().getEmail();
        this.isActivated = companyInformation.getUser().getIsActivated();
        this.role_id = companyInformation.getUser().getRoleId();
        this.id = companyInformation.getId();
        this.userId = companyInformation.getUserId();
        this.companyPhone = companyInformation.getCompanyPhone();
        this.companyActivitySectorId = companyInformation.getCompanyActivitySectorId();
        this.companyAddress = companyInformation.getCompanyAddress();
        this.companyWebsite = companyInformation.getCompanyWebsite();
        this.companyCorporate = companyInformation.getCompanyCorporate();
        this.companyLocation = companyInformation.getCompanyLocation();
        this.companyRCCM = companyInformation.getCompanyRCCM();
        this.companyNIU = companyInformation.getCompanyNIU();
        this.companyCommercialRegister = companyInformation.getCompanyCommercialRegister();
        this.companyLegalStatus = companyInformation.getCompanyLegalStatus();
        this.companyTaxConformityCertificate = companyInformation.getCompanyTaxConformityCertificate();
        this.companyStaticalDeclarationNumber = companyInformation.getCompanyStaticalDeclarationNumber();
        this.companyInternShipDuration = companyInformation.getCompanyInternShipDuration();
        this.companyDescription = companyInformation.getCompanyDescription();
        this.companyHasInternOpportunity = companyInformation.getCompanyHasInternOpportunity();
    }
}
