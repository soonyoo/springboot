package com.unicom.microserv.skyark.basicdemo.web;

import com.unicom.skyark.component.web.BaseController;
import com.unicom.skyark.component.web.data.BaseRsp;
import com.unicom.skyark.component.web.util.ServiceStandardUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;

/**
 * 接口设计示例
 */
@RestController
@Api(tags = "skyark_basicdemo", description = "示例微服务")
@RequestMapping("/skyark/basicdemo")
public class SampleController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @ApiOperation(value = "GET查询示例", notes = "hello")
    @GetMapping("/hello")
    public BaseRsp<String, ?> hello() {
        logger.debug("---开始执行---");
        return ServiceStandardUtil.createSuccessRsp(Collections.singletonList("Hello World!"));
    }

}
