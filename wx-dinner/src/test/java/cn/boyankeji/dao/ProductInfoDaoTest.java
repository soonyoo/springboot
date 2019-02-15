package cn.boyankeji.dao;

import cn.boyankeji.domain.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    
    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> result = productInfoDao.findByProductStatus(0);
        System.out.println(result.size());
        //Assert.assertNotEquals(0,result.size());
    }

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("abc123");
        productInfo.setProductName("皮蛋粥");
        productInfo.setCategoryType(1);
        productInfo.setProductDescription("好好吃的皮蛋粥");
        productInfo.setProductIcon("http:xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setProductStock(100);
        productInfo.setProductPrice(new BigDecimal(3.5));
        ProductInfo result = productInfoDao.save(productInfo);

        //Assert.assertNotEquals(null,result);
        Assert.assertNotNull(result);



    }


}