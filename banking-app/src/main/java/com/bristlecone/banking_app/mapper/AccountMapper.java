package com.bristlecone.banking_app.mapper;

import com.bristlecone.banking_app.dto.AccountDto;
import com.bristlecone.banking_app.entity.Account;
import org.springframework.stereotype.Component;

public class AccountMapper {

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }

    public static Account mapToAccount(AccountDto accountDto) {
        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }
}
