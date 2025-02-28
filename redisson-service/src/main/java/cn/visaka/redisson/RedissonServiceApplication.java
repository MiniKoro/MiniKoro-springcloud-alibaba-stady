package cn.visaka.redisson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = "cn.visaka.redisson.mapper")
public class RedissonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedissonServiceApplication.class, args);
    }

}
