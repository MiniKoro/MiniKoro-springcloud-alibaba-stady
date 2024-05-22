package cn.visaka.seata.service;


public interface OrderService {

    /**
     * 创建订单
     */
    void createOrder(Long userId, Long productId, int number, int money);

}
