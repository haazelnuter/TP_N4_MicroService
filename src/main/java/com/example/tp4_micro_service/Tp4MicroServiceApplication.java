package com.example.tp4_micro_service;

import com.example.tp4_micro_service.entities.BankAccount;
import com.example.tp4_micro_service.enums.AccountType;
import com.example.tp4_micro_service.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class Tp4MicroServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(Tp4MicroServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository) {
        return args -> {
            for (int i=0;i<10;i++){
                BankAccount bankAccount=BankAccount.builder()
                        .id(UUID.randomUUID().toString())
                        .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT).
                        balance(10000+Math.random()*90000).
                        date(new Date()).
                        currency("MAD")
                        .build();
                bankAccountRepository.save(bankAccount);
            }

        };
    }

}