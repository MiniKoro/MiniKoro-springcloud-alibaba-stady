package cn.visaka.ssj.service.impl;

import cn.visaka.ssj.entity.Product;
import cn.visaka.ssj.mapper.ProductMapper;
import cn.visaka.ssj.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
