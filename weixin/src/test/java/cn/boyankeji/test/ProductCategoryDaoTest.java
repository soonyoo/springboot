package cn.boyankeji.test;

import cn.boyankeji.dao.ProductCategoryDao;
import cn.boyankeji.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void fineOne(){
        ProductCategory productCategory = productCategoryDao.findById(1).orElse(null);
        System.out.println(productCategory);
    }


}