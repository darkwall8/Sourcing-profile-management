package com.sourcing.sourcong_profile_management.studentmanagement.domain.model;

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
