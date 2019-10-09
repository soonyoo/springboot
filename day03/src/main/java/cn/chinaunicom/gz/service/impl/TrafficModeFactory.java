package cn.chinaunicom.gz.service.impl;

import cn.chinaunicom.gz.common.TrafficCode;
import cn.chinaunicom.gz.service.TrafficModeService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TrafficModeFactory implements ApplicationContextAware {

    private static Map<TrafficCode, TrafficModeService> trafficBeanMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, TrafficModeService> map = applicationContext.getBeansOfType(TrafficModeService.class);
        trafficBeanMap = new HashMap<>();
        map.forEach((key, value) -> trafficBeanMap.put(value.getCode(), value));
    }


    public static <T extends TrafficModeService> T getTrafficMode(TrafficCode code) {
        return (T)trafficBeanMap.get(code);
    }

}
