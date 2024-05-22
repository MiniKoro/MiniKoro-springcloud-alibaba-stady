package cn.visaka.seata.service.impl;

import cn.visaka.seata.entity.Account;
import cn.visaka.seata.repository.AccountRepository;
import cn.visaka.seata.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountRepository accountRepository;


    @Override
    public void decreaseMoney(Long userId, int money) {
        Account account = accountRepository.getById(userId);
        account.setMoney(account.getMoney() - money);
        accountRepository.save(account);
    }
}
