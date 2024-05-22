package cn.visaka.redisson.service.impl;


import cn.visaka.redisson.entity.Product;
import cn.visaka.redisson.mapper.ProductMapper;
import cn.visaka.redisson.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
