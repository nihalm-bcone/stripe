package com.bristlecone.banking_app.service.impl;

import com.bristlecone.banking_app.dto.AccountDto;
import com.bristlecone.banking_app.entity.Account;
import com.bristlecone.banking_app.exception.AccountNotFoundException;
import com.bristlecone.banking_app.exception.FailedToDeleteAccountException;
import com.bristlecone.banking_app.mapper.AccountMapper;
import com.bristlecone.banking_app.repository.AccountRepository;
import com.bristlecone.banking_app.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public AccountDto getAccount(Long id) {

        Account account = accountRepository.findById(id).orElseThrow(
                () -> new AccountNotFoundException("Account not found")
        );
        return AccountMapper.mapToAccountDto(account);

    }

    @Override
    public AccountDto depositAmount(Long id, Double amount) {

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
        account.setBalance(account.getBalance() + amount);
        Account updatedBalance = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(updatedBalance);

    }

    @Override
    public AccountDto withdrawAmount(Long id, Double amount) {

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
        account.setBalance(account.getBalance() - amount);
        Account updatedBalance = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(updatedBalance);

    }

    @Override
    public List<AccountDto> getAllAccounts() {

        List<Account> accountList = accountRepository.findAll();
        List<AccountDto> accountDtoList = new ArrayList<>();
        accountList.stream().forEach(account -> accountDtoList.add(AccountMapper.mapToAccountDto(account)));
        return accountDtoList;

    }

    @Override
    public AccountDto deleteAccount(Long id, String accountHolderName) {

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
        if(account.getAccountHolderName().equals(accountHolderName)){
            accountRepository.delete(account);
        }else{
            throw new FailedToDeleteAccountException("Failed to delete account");
        }
        return AccountMapper.mapToAccountDto(account);

    }
}
