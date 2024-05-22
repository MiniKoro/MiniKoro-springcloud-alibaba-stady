package cn.visaka.seata.service.impl;

import cn.visaka.seata.remote.OrderService;
import cn.visaka.seata.remote.ProductService;
import cn.visaka.seata.service.BusinessService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Resource
    private ProductService productService;

    @Resource
    private OrderService orderService;

    @GlobalTransactional
    @Override
    public void purchase() {
        // 调用订单服务创建订单
        orderService.createOrder(1L, 1L, 1, 1499);
        // 模拟异常
        //int i = 1 / 0;
        // 调用商品服务扣除库存
        productService.decreaseNumber(1L, 1);
    }
}
