package cn.visaka.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider-service")
public interface ProviderService {

    @GetMapping("/provider/test")
    String test(@RequestParam String name);

}
