package com.unicom.microserv.skyark.basicdemo.web;

import com.unicom.microserv.skyark.basicdemo.domain.Paylog;
import com.unicom.microserv.skyark.basicdemo.domain.UserAllInfo;
import com.unicom.microserv.skyark.basicdemo.service.WebService;
import com.unicom.skyark.component.common.constants.SysTypes;
import com.unicom.skyark.component.util.StringUtil;
import com.unicom.skyark.component.util.TimeUtil;
import com.unicom.skyark.component.web.BaseController;
import com.unicom.skyark.component.web.SkyArkReqParamException;
import com.unicom.skyark.component.web.WebTypes;
import com.unicom.skyark.component.web.data.BaseRsp;
import com.unicom.skyark.component.web.util.ServiceStandardUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 服务调用示例
 */
@RestController
@Api(tags = "skyark_basicdemo", description = "web示例微服务")
@RequestMapping("/skyark/basicdemo")
public class SampleWebController extends BaseController {

    @Autowired
    private WebService webService;

    @ApiOperation(value = "跨服务调用查询示例", notes = "缴费日志查询")
    @GetMapping(value = "/paylog/{acctId}/{provinceId}/{startDate}/{endDate}")
    public BaseRsp<Paylog, Object> queryPaylog(@ApiParam(name = "acctId", value = "账户编码", example = "1731231299999")
                                                  @PathVariable("acctId") String acctId,
                                               @ApiParam(name = "provinceId", value = "省份", example = "17")
                                                  @PathVariable("provinceId") String provinceId,
                                               @ApiParam(name = "startDate", value = "开始时间", example = "20180101")
                                                  @PathVariable String startDate,
                                               @ApiParam(name = "endDate", value = "结束时间", example = "20180131")
                                                  @PathVariable String endDate) {
        //校验请求参数
        checkReq(acctId, startDate, endDate);
        List<Paylog> paylogs = webService.queryPaylog(acctId, startDate, endDate, provinceId);
        return ServiceStandardUtil.createSuccessRsp(paylogs);
    }

    @ApiOperation(value = "用户信息查询示例", notes = "用户全量信息查询")
    @PostMapping(value = "/userallinfo")
    public BaseRsp<UserAllInfo, ?> queryUserAllInfo(@RequestParam String number) {
        UserAllInfo userAllInfo = webService.queryUserAllInfo(number);
        List<UserAllInfo> users = new ArrayList<>();
        users.add(userAllInfo);
        return ServiceStandardUtil.createSuccessRsp(users);
    }

    /**
     * 检查请求入参
     *
     * @param acctId    账户编码
     * @param startDate 开始时间
     * @param endDate   结束时间
     */
    private void checkReq(String acctId, String startDate, String endDate) {
        if (StringUtil.isEmptyCheckNullStr(acctId)) {
            //请求参数验证异常，抛SkyArkReqParamException 第一位入参为中心定义的业务码表
            throw new SkyArkReqParamException("H002", "没有获取到账户编码！");
        }

        //时间格式验证
        if (!TimeUtil.checkDateFormat(startDate, TimeUtil.DATETIME_FORMAT_8) || !TimeUtil.checkDateFormat(endDate, TimeUtil.DATETIME_FORMAT_8)) {
            throw new SkyArkReqParamException("H002", "查询日期格式有误!");
        }
    }
}
