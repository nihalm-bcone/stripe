package com.bristlecone.banking_app.controller;

import com.bristlecone.banking_app.dto.AccountDto;
import com.bristlecone.banking_app.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("api/accounts")
public class AccountController {

    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {

        AccountDto savedAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);

    }

    @GetMapping("{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable("id") Long id) {

        AccountDto accountDto = accountService.getAccount(id);
        return new ResponseEntity<>(accountDto, HttpStatus.OK);

    }

    @PutMapping("{id}/deposit")
    public ResponseEntity<AccountDto> depositAmount(
            @PathVariable("id") Long id,
            @RequestBody Map<String, Double> request) {

        double amount = request.get("amount");
        AccountDto accountDto = accountService.depositAmount(id, amount);
        return new ResponseEntity<>(accountDto, HttpStatus.OK);

    }

    @PutMapping("{id}/withdraw")
    public ResponseEntity<AccountDto> withdrawAmount(
            @PathVariable("id") Long id,
            @RequestBody Map<String, Double> request) {

        double amount = request.get("amount");
        AccountDto accountDto = accountService.withdrawAmount(id, amount);
        return new ResponseEntity<>(accountDto, HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts(){

        List<AccountDto> accountDtoList = accountService.getAllAccounts();
        return new ResponseEntity<>(accountDtoList, HttpStatus.OK);

    }

    @DeleteMapping("{id}/delete")
    public ResponseEntity<AccountDto> deleteAccount(
            @PathVariable Long id,
            @RequestBody Map<String, String> request
    ) {

        String accountHolderName = request.get("accountHolderName");
        AccountDto accountDto = accountService.deleteAccount(id, accountHolderName);
        return new ResponseEntity<>(accountDto, HttpStatus.OK);

    }
}
