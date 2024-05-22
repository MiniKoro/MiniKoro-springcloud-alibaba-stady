package cn.visaka.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import sun.tools.jar.resources.jar;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {
    //java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -
    //jar sentinel-dashboard-1.8.6.jar
    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

}
