package cn.boyankeji.service.impl;

import cn.boyankeji.domain.ProductInfo;
import cn.boyankeji.enums.ProductStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;


    @Test
    public void findOne() {
        ProductInfo result = productService.findOne("abc123");
        System.out.println(result);

    }

    @Test
    public void findUpAll() {
        List<ProductInfo> result = productService.findUpAll();
        System.out.println(result);
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,10);
        Page<ProductInfo> result = productService.findAll(pageRequest);
        long totalElements = result.getTotalElements();
        System.out.println(totalElements);

    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("uvw321");
        productInfo.setProductName("芒果冰");
        productInfo.setCategoryType(3);
        productInfo.setProductDescription("很爽...");
        productInfo.setProductIcon("http:xxx.jpg");
        productInfo.setProductStatus(ProductStatus.UP.getCode());
        productInfo.setProductStock(200);
        productInfo.setProductPrice(new BigDecimal(8.5));
        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}