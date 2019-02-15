package cn.boyankeji.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="product_category")
@DynamicUpdate
@Data
public class ProductCategory {

    public ProductCategory() {
    }
    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
    /**  类目id. */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="category_id")
    private Integer categoryId;

    /** 类目名字. */
    @Column(name="category_name")
    private String categoryName;

    /** 类目编号. */
    @Column(name="category_type")
    private Integer categoryType;

    @Column
    private Date createTime;

    @Column
    private Date updateTime;

}