package com.example.tp4_micro_service.dto;

import com.example.tp4_micro_service.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccountResponseDTO {
    private  String id;
    private Date date;
    private Double balance;
    private String currency;
    private AccountType type;

}
