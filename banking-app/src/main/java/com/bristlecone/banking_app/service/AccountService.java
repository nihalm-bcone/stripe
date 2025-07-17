package com.bristlecone.banking_app.service;

import com.bristlecone.banking_app.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccount(Long id);
    AccountDto depositAmount(Long id, Double amount);
    AccountDto withdrawAmount(Long id, Double amount);
    List<AccountDto> getAllAccounts();
    AccountDto deleteAccount(Long id, String accountHolderName);

}
