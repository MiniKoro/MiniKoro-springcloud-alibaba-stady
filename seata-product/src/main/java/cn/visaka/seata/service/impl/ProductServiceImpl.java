package cn.visaka.seata.service.impl;

import cn.visaka.seata.entity.Product;
import cn.visaka.seata.repository.ProductRepository;
import cn.visaka.seata.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductRepository productRepository;

    @Override
    public void decreaseNumber(Long id, int number) {
        Product product = productRepository.getById(id);
        product.setProductNumber(product.getProductNumber() - number);
        productRepository.save(product);
    }
}
