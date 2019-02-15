package cn.boyankeji.service;

import cn.boyankeji.domain.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    //查询单个商品
    ProductInfo findOne(String productId);
    //查询所有在架商品列表
    List<ProductInfo> findUpAll();
    //查询所有在架商品列表（分页）
    Page<ProductInfo> findAll(Pageable pageable);
    //保存或更改
    ProductInfo save(ProductInfo productInfo);
    //加库存
    //减库存
}
