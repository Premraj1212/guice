package com.vindhiyan.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class LoginCredentials implements Entity<LoginCredentials>{

    private String username;
    private String password;

    @Override
    public LoginCredentials init() {
        return this.toBuilder()
                .username("tomsmith")
                .password("SuperSecretPassword!")
                .build();
    }
}
