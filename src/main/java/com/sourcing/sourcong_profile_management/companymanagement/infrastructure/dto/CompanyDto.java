package com.sourcing.sourcong_profile_management.companymanagement.infrastructure.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sourcing.sourcong_profile_management.companymanagement.domain.model.CompanyInformation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {
    private JSONPObject jsonPObject;

    public CompanyDto(CompanyInformation companyInformation) {
        try {
            JsonNodeFactory factory = JsonNodeFactory.instance;

            ObjectNode companyInfoNode = factory.objectNode();
            companyInfoNode.put("id", companyInformation.getId());
            companyInfoNode.put("userEmail", companyInformation.getUser().getEmail());
            companyInfoNode.put("companyName", companyInformation.getUser().getName());
            companyInfoNode.put("industry", companyInformation.getCompanyActivitySectorId());
            companyInfoNode.put("companySize", companyInformation.getCompanySize());
            companyInfoNode.put("website", companyInformation.getCompanyWebsite());
            companyInfoNode.put("description", companyInformation.getCompanyDescription());
            companyInfoNode.put("address", companyInformation.getCompanyAddress());
            companyInfoNode.put("contactPhone", companyInformation.getCompanyPhone());
            companyInfoNode.put("companyCorporate", companyInformation.getCompanyCorporate());
            companyInfoNode.put("companyRCCM", companyInformation.getCompanyRCCM());
            companyInfoNode.put("companyNIU", companyInformation.getCompanyNIU());
            companyInfoNode.put("companyCommercialRegister", companyInformation.getCompanyCommercialRegister());
            companyInfoNode.put("companyLegalStatus", companyInformation.getCompanyLegalStatus());
            companyInfoNode.put("companyTaxConformityCertificate", companyInformation.getCompanyTaxConformityCertificate());
            companyInfoNode.put("companyStaticalDeclarationNumber", companyInformation.getCompanyStaticalDeclarationNumber());
            companyInfoNode.put("companyInternShipDuration", companyInformation.getCompanyInternShipDuration());
            companyInfoNode.put("companyHasInternOpportunity", companyInformation.getCompanyHasInternOpportunity());
            companyInfoNode.put("companyLocation", companyInformation.getCompanyLocation());

            ObjectNode userNode = factory.objectNode();
            userNode.put("id", companyInformation.getUser().getId());
            userNode.put("name", companyInformation.getUser().getName());
            userNode.put("email", companyInformation.getUser().getEmail());
            userNode.put("profileId", companyInformation.getUser().getProfileId());
            userNode.put("profileName", companyInformation.getUser().getProfileName());
            userNode.put("roleId", companyInformation.getUser().getRoleId());
            userNode.put("roleName", companyInformation.getUser().getRoleName());
            userNode.put("hasPremium", companyInformation.getUser().getHasPremium());
            userNode.put("isActivated", companyInformation.getUser().getIsActivated());

            ObjectNode root = factory.objectNode();
            root.set("companyInfo", companyInfoNode);
            root.set("user", userNode);

            this.jsonPObject = new JSONPObject("result", root);
        } catch (Exception e) {
            throw new RuntimeException("Error during JSON creation", e);
        }
    }

}
