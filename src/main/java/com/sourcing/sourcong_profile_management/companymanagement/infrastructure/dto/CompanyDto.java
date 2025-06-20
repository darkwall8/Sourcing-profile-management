package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.dto;

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
    private Integer role_id;
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

    CompanyDto(User user, Long id, Long userId, String companyPhone, Long companyActivitySectorId, String companyAddress, String companyWebsite, String companyCorporate, String companyLocation, String companyRCCM, String companyNIU, String companyCommercialRegister, String companyLegalStatus, String companyTaxConformityCertificate, String companyStaticalDeclarationNumber, String companyInternShipDuration, String companyDescription, Boolean companyHasInternOpportunity) {
        this.userId = user.getId();
        this.name = user.getName();
        this.hasPremium = user.getHasPremium();
        this.email = user.getEmail();
        this.isActivated = user.getIsActivated();
        this.role_id = user.getRole_id();
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
    }
}
