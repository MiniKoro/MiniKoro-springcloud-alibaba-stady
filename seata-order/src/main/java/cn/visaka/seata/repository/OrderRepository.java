package cn.visaka.seata.repository;

import cn.visaka.seata.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
