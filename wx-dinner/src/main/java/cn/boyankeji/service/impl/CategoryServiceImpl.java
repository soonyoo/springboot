package cn.boyankeji.service.impl;

import cn.boyankeji.dao.ProductCategoryDao;
import cn.boyankeji.domain.ProductCategory;
import cn.boyankeji.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public ProductCategory findOne(Integer categoryid) {
        return productCategoryDao.findOne(categoryid);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryDao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList) {
        return productCategoryDao.findByCategoryTypeIn(categoryList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryDao.save(productCategory);
    }
}
