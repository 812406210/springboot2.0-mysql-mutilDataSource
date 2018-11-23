package com.cn.commodity.dao.accountDao;

import com.cn.commodity.entity.Account;


public interface AccountDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}
