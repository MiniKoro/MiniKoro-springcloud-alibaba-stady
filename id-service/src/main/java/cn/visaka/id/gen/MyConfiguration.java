package cn.visaka.id.gen;

import cn.visaka.id.service.IDAllocService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class MyConfiguration {
    @Resource
    private IDAllocService idAllocService;

    @Bean
    IDGen segmentIDGen() {
        SegmentIDGenImpl gen = new SegmentIDGenImpl();
        gen.setDao(idAllocService);
        gen.init();
        return gen;
    }
}
