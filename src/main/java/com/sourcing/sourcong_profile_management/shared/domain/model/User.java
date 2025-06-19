package com.sourcing.sourcong_profile_management.shared.domain.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Long id;
    private String name;
    private Boolean hasPremium;
    private String email;
    private String password;
    private Boolean isActivated;
    private Integer role_id;

    public User(Long id, String name, String email, String password, Boolean isActivated, Integer role_id) {
        this.id = id;
        this.name = name;
        this.hasPremium = false;
        this.email = email;
        this.password = password;
        this.isActivated = isActivated;
        this.role_id = role_id;
    }
}
