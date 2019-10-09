package cn.chinaunicom.gz.service;

import cn.chinaunicom.gz.common.TrafficCode;

/**
 ---------------------
     @author：EmineWang
     来源：CSDN
     原文：https://blog.csdn.net/a718515028/article/details/72457436
     版权声明：本文为博主原创文章，转载请附上博文链接！
 */

public interface TrafficModeService {
    /**
     * 查询交通方式编码
     * @return 编码
     */
    TrafficCode getCode();

    /**
     * 查询交通方式的费用，单位：分
     * @return 费用
     */
    Integer getFee();


}
