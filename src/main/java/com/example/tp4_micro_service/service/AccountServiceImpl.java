package com.example.tp4_micro_service.service;

import com.example.tp4_micro_service.dto.BankAccountRequestDTO;
import com.example.tp4_micro_service.dto.BankAccountResponseDTO;
import com.example.tp4_micro_service.entities.BankAccount;
import com.example.tp4_micro_service.mappers.AccountMapper;
import com.example.tp4_micro_service.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        //mapping des DTOs
        BankAccount bankAccount=BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .date(new Date())
                .balance(bankAccountDTO.getBalance())
                .type(bankAccountDTO.getType())
                .build();
        //code metier
       BankAccount savedBankAccount= bankAccountRepository.save(bankAccount);
        //le code commente on ve le remplacer par :
       BankAccountResponseDTO bankAccountResponseDTO= accountMapper.fromBankAccount(savedBankAccount);
        return bankAccountResponseDTO;
    }
}
