package cn.boyankeji.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/* 商品，包含类目*/
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> listProductInfoVO;





}
