package com.sourcing.sourcong_profile_management.studentmanagement.domain.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sourcing.sourcong_profile_management.shared.domain.model.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentInformation {
    private Long id;
    private Long userId;
    private String studentCountry;
    private String studentSchoolLevel;
    private String studentSpecification;
    private Boolean studentWantToReceiveNotification;
    private String studentCV;
    private String studentGitHubLink;
    private String studentPortfolioLink;
    private String studentLinkedinLink;
    private User user;
    private JSONPObject jsonpObject;

    public StudentInformation(Long id, Long userId, String studentCountry, String studentSchoolLevel, String studentSpecification, Boolean studentWantToReceiveNotification, String studentCV, String studentGitHubLink, String studentPortfolioLink, String studentLinkedinLink) {
        this.id = id;
        this.userId = userId;
        this.studentCountry = studentCountry;
        this.studentSchoolLevel = studentSchoolLevel;
        this.studentSpecification = studentSpecification;
        this.studentWantToReceiveNotification = studentWantToReceiveNotification;
        this.studentCV = studentCV;
        this.studentGitHubLink = studentGitHubLink;
        this.studentPortfolioLink = studentPortfolioLink;
        this.studentLinkedinLink = studentLinkedinLink;
    }
}
