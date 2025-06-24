package com.sourcing.sourcong_profile_management.studentmanagement.infrastructure.dto;

import com.sourcing.sourcong_profile_management.shared.domain.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {
        private String name;
        private Boolean hasPremium;
        private String email;
        private Boolean isActivated;
        private Number role_id;
        private Number id;
        private Number userId;
        private String studentCountry;
        private String studentSchoolLevel;
        private String studentSpecification;
        private Boolean studentWantToReceiveNotification;
        private String studentCV;
        private String studentGitHubLink;
        private String studentPortfolioLink;
        private String studentLinkedinLink;

        StudentDto(User user, Long id, Long userId, String studentCountry, String studentSchoolLevel, String studentSpecification, Boolean studentWantToReceiveNotification, String studentCV, String studentGitHubLink, String studentPortfolioLink, String studentLinkedinLink) {
            this.userId = user.getId();
            this.name = user.getName();
            this.hasPremium = user.getHasPremium();
            this.email = user.getEmail();
            this.isActivated = user.getIsActivated();
            this.role_id = user.getRoleId();
            this.id = id;
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
