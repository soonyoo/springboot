package cn.boyankeji.test;

import cn.boyankeji.dao.ProductCategoryDao;
import cn.boyankeji.domain.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOne(){
        ProductCategory one = productCategoryDao.findOne(1);
        System.out.println(one);
    }

    @Test
    public void save(){
        ProductCategory category = new ProductCategory();
        category.setCategoryName("女生最爱");
        category.setCategoryType(3);
        productCategoryDao.save(category);
    }
    @Test
    public void saveTest(){
        ProductCategory category = new ProductCategory("男生最爱",4);
        ProductCategory cat = productCategoryDao.save(category);
        Assert.assertNotNull(cat);
    }

    @Test
    public void deleteTest(){
        productCategoryDao.delete(6);
    }

    @Test
    public  void updateTest(){
        ProductCategory category = new ProductCategory();
        category.setCategoryId(1);
        category.setCategoryName("热销榜1");
        category.setCategoryType(2);
        productCategoryDao.save(category);
    }

    @Test
    public void updateTest2(){
        ProductCategory category = productCategoryDao.findOne(1);
        category.setCategoryName("热销榜33");
        productCategoryDao.save(category);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result);
        //System.out.println(result);
    }

}