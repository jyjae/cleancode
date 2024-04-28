package com.example.hexagonal.account.application.port.in;

import com.example.hexagonal.account.domain.Account;
import com.example.hexagonal.account.domain.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(Account.AccountId accountId);

}
