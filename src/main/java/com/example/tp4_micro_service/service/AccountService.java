package com.example.tp4_micro_service.service;

import com.example.tp4_micro_service.dto.BankAccountRequestDTO;
import com.example.tp4_micro_service.dto.BankAccountResponseDTO;
import com.example.tp4_micro_service.entities.BankAccount;

public interface AccountService  {
    //couche metier
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO );
}
