package cn.visaka.redisson.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductOrder {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long productId;
    private Integer number;
    private LocalDateTime createTime;
}
