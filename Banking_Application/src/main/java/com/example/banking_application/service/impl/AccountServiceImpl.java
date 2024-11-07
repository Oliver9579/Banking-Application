package com.example.banking_application.service.impl;

import com.example.banking_application.dto.AccountDto;
import com.example.banking_application.entity.Account;
import com.example.banking_application.mapper.AccountMapper;
import com.example.banking_application.repository.AccountRepository;
import com.example.banking_application.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
