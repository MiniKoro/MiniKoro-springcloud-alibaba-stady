package cn.visaka.ssj.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Permission {
    private Long id;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
