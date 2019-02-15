package cn.boyankeji.vo;

import lombok.Data;

/* http请求的最外层对象 */
@Data
public class ResultVO<T> {
    /** 错误代码. */
    private Integer code;
    /** 提示信息. */
    private String msg;

    private T data;
}
