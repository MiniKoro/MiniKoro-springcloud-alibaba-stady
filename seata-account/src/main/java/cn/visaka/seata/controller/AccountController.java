package cn.visaka.seata.controller;

import cn.visaka.seata.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("account")
public class AccountController {
    @Resource
    private AccountService accountService;

    @GetMapping("decreaseMoney")
    public void decreaseMoney(@RequestParam Long userId,
                              @RequestParam int money) {
        accountService.decreaseMoney(userId, money);
    }
}
