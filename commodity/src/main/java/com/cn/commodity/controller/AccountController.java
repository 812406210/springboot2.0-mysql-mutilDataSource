package com.cn.commodity.controller;

import com.cn.commodity.entity.Account;
import com.cn.commodity.entity.User;
import com.cn.commodity.service.AccountService;
import com.cn.commodity.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Resource
    private AccountService accountService;

    @RequestMapping("/showAccount")
    @ResponseBody
    public Account toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        Account account = this.accountService.getAccountById(userId);
        return account;
    }

}