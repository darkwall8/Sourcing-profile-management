package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.dto;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sourcing.sourcong_profile_management.studentmanagement.domain.model.StudentInformation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
    private JSONPObject jsonPObject;

    public StudentDto(StudentInformation studentInformation) {
        try {
            JsonNodeFactory factory = JsonNodeFactory.instance;

            ObjectNode companyInfoNode = factory.objectNode();
            companyInfoNode.put("id", studentInformation.getId());
            companyInfoNode.put("userEmail", studentInformation.getUser().getEmail());
            companyInfoNode.put("studentCountry", studentInformation.getUser().getName());
            companyInfoNode.put("studentSchoolLevel", studentInformation.getStudentSchoolLevel());
            companyInfoNode.put("studentSpecification", studentInformation.getStudentSpecification());
            companyInfoNode.put("studentWantToReceiveNotification", studentInformation.getStudentWantToReceiveNotification());
            companyInfoNode.put("studentCv", studentInformation.getStudentCV());
            companyInfoNode.put("portfolioUrl", studentInformation.getStudentPortfolioLink());
            companyInfoNode.put("githubUrl", studentInformation.getStudentGitHubLink());
            companyInfoNode.put("linkedinUrl", studentInformation.getStudentLinkedinLink());

            ObjectNode userNode = factory.objectNode();
            userNode.put("id", studentInformation.getUser().getId());
            userNode.put("name", studentInformation.getUser().getName());
            userNode.put("email", studentInformation.getUser().getEmail());
            userNode.put("profileId", studentInformation.getUser().getProfileId());
            userNode.put("profileName", studentInformation.getUser().getProfileName());
            userNode.put("roleId", studentInformation.getUser().getRoleId());
            userNode.put("roleName", studentInformation.getUser().getRoleName());
            userNode.put("hasPremium", studentInformation.getUser().getHasPremium());
            userNode.put("isActivated", studentInformation.getUser().getIsActivated());

            ObjectNode root = factory.objectNode();
            root.set("studentInfo", companyInfoNode);
            root.set("user", userNode);

            this.jsonPObject = new JSONPObject("result", root);
        } catch (Exception e) {
            throw new RuntimeException("Error during JSON creation", e);
        }
    }
}
