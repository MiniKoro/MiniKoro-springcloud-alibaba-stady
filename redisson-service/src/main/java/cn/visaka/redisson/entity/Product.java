package cn.visaka.redisson.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class Product {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer number;
}
