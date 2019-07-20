package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: ssm
 * @description:
 * @author: Mr.Li
 * @create: 2019-06-15 22:31
 **/
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatis {

    @Autowired
    private AccountService accountService;

    @Test
    public void findAll(){
        List<Account> accounts = accountService.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
