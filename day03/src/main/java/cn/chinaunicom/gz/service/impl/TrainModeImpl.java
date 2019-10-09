package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.common.TrafficCode;
import cn.chinaunicom.gz.service.TrafficModeService;
import org.springframework.stereotype.Service;

/**
 * @author : xuwenyuan
 * @date : 2019-07-30
 * 火车方式
 */

@Service
public class TrainModeImpl implements TrafficModeService {
    @Override
    public TrafficCode getCode() {
        return TrafficCode.TRAIN;
    }

    @Override
    public Integer getFee() {
        return 9000;
    }
}
