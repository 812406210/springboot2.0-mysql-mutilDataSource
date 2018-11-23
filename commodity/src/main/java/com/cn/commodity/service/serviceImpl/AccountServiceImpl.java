package com.cn.commodity.service.serviceImpl;

import com.cn.commodity.dao.accountDao.AccountDao;
import com.cn.commodity.entity.Account;
import com.cn.commodity.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public Account getAccountById(int userId) {
        return accountDao.selectByPrimaryKey(userId);
    }
    @Override
    public boolean addAccount(Account record){
        boolean result = false;
        try {
            accountDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}