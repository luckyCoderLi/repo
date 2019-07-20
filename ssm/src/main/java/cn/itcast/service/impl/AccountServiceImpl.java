package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: Mr.Li
 * @create: 2019-06-15 17:30
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户....");
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户....");
        return accountDao.findAll();
    }
}
