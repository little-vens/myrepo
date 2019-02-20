package com.zelda.dao;

import com.zelda.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有account
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存account
     * @param account
     */
    @Insert("insert into account (name,money)values(#{name},#{money})")
    void save(Account account);
}
