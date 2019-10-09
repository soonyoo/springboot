package cn.chinaunicom.gz;

import cn.chinaunicom.gz.common.TrafficCode;
import cn.chinaunicom.gz.config.UploadConfig;
import cn.chinaunicom.gz.service.TrafficModeService;
import cn.chinaunicom.gz.service.UploadService;
import cn.chinaunicom.gz.service.impl.TrafficModeFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Day03ApplicationTests {

    @Test
    public void contextLoads() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("local");
//        context.register(UploadConfig.class);
//        context.refresh();
        //System.out.println(context);

//        UploadService uploadService = context.getBean(UploadService.class);
//        uploadService.


    }

    @Test
    public void testGetTrafficMode() {
        TrafficModeService mode = TrafficModeFactory.getTrafficMode(TrafficCode.BUS);
        System.out.println(mode.getFee());
//        Assert.assertEquals(mode.getFee().intValue(), 10000);

        mode = TrafficModeFactory.getTrafficMode(TrafficCode.TRAIN);
        System.out.println(mode.getFee().intValue());
//        Assert.assertEquals(mode.getFee().intValue(), 9000);
    }

}
