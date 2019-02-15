package cn.boyankeji.enums;

import lombok.Getter;

/*商品状态*/
@Getter
public enum ProductStatus {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String msg;

    ProductStatus(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

}
