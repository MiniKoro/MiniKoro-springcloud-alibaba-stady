package cn.visaka.seata.service;


public interface AccountService {

    /**
     * 减少用户余额
     */
    void decreaseMoney(Long userId, int money);

}
