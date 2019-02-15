package cn.boyankeji.domain;

import lombok.Data;
import org.hibernate.ScrollableResults;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@DynamicUpdate
@Data
@Entity
@Table(name="product_info")
public class ProductInfo {
    /** 商品id. */
    @Id
    private String productId;
    /** 商品名称. */
    private String productName;
    /** 单价.*/
    private BigDecimal productPrice;
    /** 库存. */
    private Integer productStock;
    /** 描述. */
    private String productDescription;
    /** 小图 */
    private String productIcon;
    /** 状态. 0正常，1下架*/
    private Integer productStatus;
    /** 类目. */
    private Integer categoryType;
}
