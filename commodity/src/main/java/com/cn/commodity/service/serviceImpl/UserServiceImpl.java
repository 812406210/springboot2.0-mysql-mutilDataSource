package com.cn.commodity.service.serviceImpl;

import com.cn.commodity.dao.userDao.UserDao;
import com.cn.commodity.entity.User;
import com.cn.commodity.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
    @Override
    public boolean addUser(User record){
        boolean result = false;
        try {
            userDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}