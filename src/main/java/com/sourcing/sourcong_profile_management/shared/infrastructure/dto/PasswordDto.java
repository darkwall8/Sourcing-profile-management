package com.sourcing.sourcong_profile_management.shared.infrastructure.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordDto {
    private String password;
    private String newPassword;
    private String email;
    private JSONPObject jsonPObject;

    public PasswordDto(String password, String newPassword, String email) {
        this.password = password;
        this.newPassword = newPassword;
        this.email = email;

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            this.jsonPObject = new JSONPObject("data", objectMapper.valueToTree(this));
        } catch (Exception e) {
            throw new RuntimeException("Error during JSON conversion", e);
        }
    }
}
