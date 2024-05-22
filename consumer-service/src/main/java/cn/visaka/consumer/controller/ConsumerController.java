package cn.visaka.consumer.controller;

import cn.visaka.consumer.remote.IdService;
import cn.visaka.consumer.remote.ProviderService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
@RefreshScope
public class ConsumerController {

    @Resource
    private ProviderService providerService;
    @Resource
    private IdService idService;

    @GetMapping("/getId")
    public String getId(@RequestParam String key) {
        return idService.generateId(key).toString();
    }

    @GetMapping("/getUser")
    public String getUser() {
        return "张三";
    }

    @GetMapping("/test")
    public String test(@RequestParam String name) {
        System.out.println(name);
        return providerService.test(name);
    }

    @Value("${name}")
    private String name;

    //不知道@nacosvalue为什么用不了
    @GetMapping("dyconfig")
    public String dyconfig() {
        return name;
    }

}
