package cn.visaka.redisson.service;

import cn.visaka.redisson.entity.ProductOrder;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ProductOrderService extends IService<ProductOrder> {
    Boolean buy(Long productId, Integer number);

    Boolean buyWithoutLock(Long productId, Integer number);
}
