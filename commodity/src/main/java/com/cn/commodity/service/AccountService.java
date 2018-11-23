package com.cn.commodity.service;

import com.cn.commodity.entity.Account;


public interface AccountService {
    public Account getAccountById(int userId);

    boolean addAccount(Account record);

}
