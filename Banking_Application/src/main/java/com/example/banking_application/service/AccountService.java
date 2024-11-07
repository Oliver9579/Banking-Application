package com.example.banking_application.service;

import com.example.banking_application.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, Double amount);
}
