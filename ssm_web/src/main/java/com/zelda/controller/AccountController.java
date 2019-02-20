package com.zelda.controller;

import com.zelda.domain.Account;
import com.zelda.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;
import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Controller
@RequestMapping("/account")
public class AccountController implements Serializable {

    @Autowired
    private AccountService service;
    /**
     * 查询所有数据
     * @return
     */
    @RequestMapping(path = "/findAll")
    public String findAll(Model model){
        List<Account> list = service.findAll();
        model.addAttribute("users",list);
        return "list";
    }
}
