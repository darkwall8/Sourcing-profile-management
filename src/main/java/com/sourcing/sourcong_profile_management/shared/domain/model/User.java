package com.sourcing.sourcong_profile_management.shared.domain.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
//    private Long id;
//    private String name;
//    private Boolean hasPremium;
//    private String email;
//    private String password;
//    private Boolean isActivated;
//    private Integer role_id;
    private Number id;
    private String name;
    private String email;
    private String password;
    private Number profileId;
    private String profileName;
    private Number roleId;
    private String roleName;
    private Boolean hasPremium;
    private Boolean isActivated;
    private String lastLogin;
    private String createdAt;
    private String updatedAt;

    public User(Long id, String name, String email, String password, Number profileId, String profileName, Number roleId, String roleName, Boolean hasPremium, Boolean isActivated, String lastLogin, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profileId = profileId;
        this.profileName = profileName;
        this.roleId = roleId;
        this.roleName = roleName;
        this.hasPremium = hasPremium;
        this.isActivated = isActivated;
        this.lastLogin = lastLogin;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
