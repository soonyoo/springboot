package cn.boyankeji.controller;

import cn.boyankeji.domain.ProductCategory;
import cn.boyankeji.domain.ProductInfo;
import cn.boyankeji.service.CategoryService;
import cn.boyankeji.service.ProductService;
import cn.boyankeji.util.ResultVOUtil;
import cn.boyankeji.vo.ProductInfoVO;
import cn.boyankeji.vo.ProductVO;
import cn.boyankeji.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/list")
    public ResultVO list(){
        //1.查询所有上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();


        //2.查询类目（一次性查询）
        //List<Integer> categoryTypeList = new ArrayList<>();
        //2.1 方法一（传统方法）：
        //for(ProductInfo productInfo:productInfoList){
        //    categoryTypeList.add(productInfo.getCategoryType());
        //}
        //2.2 方法二（lamba）
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //3.数据拼装

        //类目循环
        List<ProductVO> productVOList =new ArrayList<>();
        for(ProductCategory productCategory:productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());
            //商品循环(最内层)
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList){
                //如果类目相同
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setListProductInfoVO(productInfoVOList);
            productVOList.add(productVO);
        }
        //最外层
//        ResultVO result = new ResultVO();
//        result.setCode(0);
//        result.setMsg("成功");
//        result.setData(productVOList);
        return ResultVOUtil.success(productVOList);

    }

}
