package com.example.banking_application.service;

import com.example.banking_application.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, Double amount);

    AccountDto withdraw(Long id, Double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);

}
