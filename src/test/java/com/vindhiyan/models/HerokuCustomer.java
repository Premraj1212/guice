package com.vindhiyan.models;

import io.qameta.allure.Step;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class HerokuCustomer implements Entity<HerokuCustomer>{
    private LoginCredentials loginCredentials;
    @Override
    @Step("Creating new customer details to login")
    public HerokuCustomer init() {
        return this.toBuilder()
                .loginCredentials(new LoginCredentials().init())
                .build();
    }
}
