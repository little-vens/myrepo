package com.zelda.service.impl;

import com.zelda.dao.AccountDao;
import com.zelda.domain.Account;
import com.zelda.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao ad;

    /**
     * 查询所有account
     * @return
     */
    @Override
    public List<Account> findAll() {
        return ad.findAll();
    }

    /**
     * 保存account
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        ad.save(account);
    }
}
