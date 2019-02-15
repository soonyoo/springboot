package cn.boyankeji.service;

import cn.boyankeji.domain.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer categoryid);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);
    //更新或新增
    ProductCategory save(ProductCategory productCategory);
}
