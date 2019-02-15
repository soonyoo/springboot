package cn.boyankeji.dao;

import cn.boyankeji.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {

    //根据categoryType查询
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);
}
