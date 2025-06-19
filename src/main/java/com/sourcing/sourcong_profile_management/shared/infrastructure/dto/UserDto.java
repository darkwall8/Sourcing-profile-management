package com.sourcing.sourcong_profile_management.shared.infrastructure.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String name;
    private Boolean hasPremium;
    private String email;
    private Boolean isActivated;
    private Integer role_id;

    UserDto(Long id, String name, Boolean hasPremium, String email, Boolean isActivated, Integer role_id) {
        this.id = id;
        this.name = name;
        this.hasPremium = hasPremium;
        this.email = email;
        this.isActivated = isActivated;
        this.role_id = role_id;
    }

}
