package cn.boyankeji.dao;

import cn.boyankeji.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {

}
