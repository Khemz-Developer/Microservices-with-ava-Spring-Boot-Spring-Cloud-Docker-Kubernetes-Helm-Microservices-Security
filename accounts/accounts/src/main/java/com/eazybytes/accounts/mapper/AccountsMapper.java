package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.Dto.AccountDto;
import com.eazybytes.accounts.entity.Accounts;

public class AccountsMapper {

    public static AccountDto mapToAccountDto(Accounts accounts, AccountDto accountDto){
        accountDto.setAccountNumber(accounts.getAccountNumber());
        accountDto.setAccountType(accounts.getAccountType());
        accountDto.setBranchAddress(accounts.getBranchAddress());
        return accountDto;
    }

    public static Accounts mapToAccounts(Accounts accounts, AccountDto accountDto){
        accounts.setAccountNumber(accountDto.getAccountNumber());
        accounts.setAccountType(accountDto.getAccountType());
        accounts.setBranchAddress(accountDto.getBranchAddress());
        return accounts;
    }
}
