package com.zelda.service;

import com.zelda.domain.Account;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public interface AccountService {
    /**
     * 查询所有account
     * @return
     */
    List<Account> findAll();

    /**
     * 保存account
     * @param account
     */
    void saveAccount(Account account);
}
