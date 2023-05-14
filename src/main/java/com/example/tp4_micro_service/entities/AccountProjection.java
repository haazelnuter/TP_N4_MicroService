package com.example.tp4_micro_service.entities;

import com.example.tp4_micro_service.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

//spring data rest
@Projection(types = BankAccount.class,name = "projection1")
public interface AccountProjection {
    public  String getId();
    public AccountType getType();
}
