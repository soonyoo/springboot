package cn.boyankeji.service.impl;

import cn.boyankeji.domain.ProductCategory;
import cn.boyankeji.service.CategoryService;
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
public class CategoryServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne() {
        ProductCategory one = categoryService.findOne(1);
        System.out.println(one);
    }

    @Test
    public void findAll() {
        List<ProductCategory> pList = categoryService.findAll();
        Assert.assertNotEquals(0,pList.size());
        //System.out.println(pList);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> categoryList = Arrays.asList(1,2,10);
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(categoryList);
        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("男生专享",10);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}