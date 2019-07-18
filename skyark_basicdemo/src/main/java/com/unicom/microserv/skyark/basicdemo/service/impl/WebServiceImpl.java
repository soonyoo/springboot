package com.unicom.microserv.skyark.basicdemo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.unicom.microserv.skyark.basicdemo.domain.Paylog;
import com.unicom.microserv.skyark.basicdemo.domain.UserAllInfo;
import com.unicom.microserv.skyark.basicdemo.service.WebService;
import com.unicom.skyark.component.exception.SkyArkBusiException;
import com.unicom.skyark.component.util.JsonUtil;
import com.unicom.skyark.component.web.data.RequestEntity;
import com.unicom.skyark.component.web.data.Rsp;
import com.unicom.skyark.component.web.data.SkyArkMicroServiceCall;
import com.unicom.skyark.component.web.rest.SkyArkAsyncRestClient;
import com.unicom.skyark.component.web.rest.SkyArkRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service
public class WebServiceImpl implements WebService {
    private static final Logger logger = LoggerFactory.getLogger(WebServiceImpl.class);

    @Autowired
    private SkyArkRestClient skyArkRestClient;
    @Autowired
    SkyArkAsyncRestClient skyArkAsyncRestClient;

    @Override
    @HystrixCommand(groupKey = "paylog", commandKey = "queryPaylog", threadPoolKey = "queryPaylogThread", fallbackMethod = "fallbackQueryPaylog", ignoreExceptions = {SkyArkBusiException.class})
    public List<Paylog> queryPaylog(String acctId, String starttime, String endtime, String provinceId) {
        /**
         * 访问服务acting_msginfo
         *
         * 接口信息：
         *      url（花括号中为路径参数）:    /acting/msginfo/jdbc/paylog/{acctId}/{provinceId}/{querysys}
         *      请求类型:   GET
         *      query参数:    START_DATE、END_DATE
         *      接口返回： 接口返回结构符合天舟平台应答规范，即与实体类BashRsp对应
         */
        //路径 /acting/paylog/{acctId}/{provinceId}/{querysys}
        String[] uriPath = new String[]{"acting", "paylog", acctId, provinceId, "2"};
        //query参数
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put("START_DATE", starttime);
        uriParams.put("END_DATE", endtime);
        //请求实体类
        RequestEntity requestEntity = new RequestEntity(uriPath, uriParams);
        /*可以设置header头信息 不设置默认使用天舟微服务规范header
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.put(HttpHeaders.ACCEPT, Collections.singletonList(MediaType.APPLICATION_JSON_VALUE));
        httpHeaders.put(HttpHeaders.CONTENT_TYPE, Collections.singletonList(MediaType.APPLICATION_JSON_VALUE));
        requestEntity.setHttpHeaders(httpHeaders);*/
        //服务间调用 方法自动验证调用是否成功及rspcode是否为0000，如果不为0000则抛出异常，如不想使用自动验证方法可设置最后一位参数isExcpInterrupt为false
        Rsp rsp = skyArkRestClient.callSkyArkMicroService("acting", HttpMethod.GET, requestEntity);

        List<Paylog> rspData = JsonUtil.transMapsToObjs(rsp.getData(), Paylog.class);
        if (CollectionUtils.isEmpty(rspData)) {
            //服务内业务异常使用SkyArkBusiException 第一位参数填写各中心定义的异常返回码，如账务中心 H003
            throw new SkyArkBusiException("H003", "查询结果集为空");
        }

        return rspData;
    }

    public List<Paylog> fallbackQueryPaylog(String acctId, String starttime, String endtime, String provinceId, String headerGray, Throwable e) {
        logger.error(e.getMessage(), e);
        return Collections.emptyList();
    }

    @Override
    @HystrixCommand(
            groupKey = "userAllInfo", //缺省为类名
            commandKey = "queryUserAllInfo",//缺省为方法名
            threadPoolKey = "queryUserAllInfoThread",//缺省为类名
            fallbackMethod = "fallbackUserAllInfo", //降级方法
            ignoreExceptions = {SkyArkBusiException.class} //忽略天舟微服务业务异常
    )
    public UserAllInfo queryUserAllInfo(String number) {
        /**
         * 访问服务：    users_allinfo
         * 接口信息：
         *      URL：    /users/allinfo/{number}
         *      请求类型：GET
         *      接口返回：返回格式为json串，对应的实体类是UserAllInfo
         */
        //路径 /{number}
        String[] uriPath = new String[]{number};
        //没有query参数
        //请求实体类
        RequestEntity requestEntity = new RequestEntity(uriPath, null);
        //服务间调用
        UserAllInfo userAllInfo = skyArkRestClient.callSkyArkMicroService("users", "users_allinfo", HttpMethod.GET, requestEntity, UserAllInfo.class);

        return userAllInfo;

    }

    public UserAllInfo fallbackUserAllInfo(String number, String headerGray, Throwable e) throws Throwable {
        logger.error("服务降级:{}", e.getMessage(), e);
        throw e;
    }

    /**
     * 使用异步请求类SkyArkAsyncRestClient
     * 使用异步的方式，请求两个没有前后依赖的接口
     */
    public void syncRequestSample() {


        /**
         * 访问服务：    users_allinfo
         * 接口信息：
         *      URL：    /users/allinfo/{number}
         *      请求类型：GET
         *      接口返回：返回格式为json串，对应的实体类是UserAllInfo
         */
        String[] uriPath = new String[]{"users", "allinfo", "18600000000"};
        RequestEntity requestEntity = new RequestEntity(uriPath, null);
        SkyArkMicroServiceCall skyArkMicroServiceCall = new SkyArkMicroServiceCall("users", HttpMethod.GET, requestEntity);

        /**
         * 访问服务acting_msginfo
         *
         * 接口信息：
         *      url（花括号中为路径参数）:    /acting/msginfo/jdbc/paylog/{acctId}/{provinceId}/{querysys}
         *      请求类型:   GET
         *      query参数:    START_DATE、END_DATE
         *      接口返回： 接口返回结构符合天舟平台应答规范，即与实体类BashRsp对应
         */
        String[] uriPath2 = new String[]{"acting", "msginfo", "jdbc", "paylog", "111111", "11", "2"};
        Map<String, String> uriParams2 = new HashMap<>();
        uriParams2.put("START_DATE", "20180101");
        uriParams2.put("END_DATE", "20180112");
        RequestEntity requestEntity2 = new RequestEntity(uriPath, uriParams2);
        SkyArkMicroServiceCall skyArkMicroServiceCall2 = new SkyArkMicroServiceCall("acting", HttpMethod.GET, requestEntity2);

        //添加到请求列表
        List<SkyArkMicroServiceCall> calls = new ArrayList<>();
        calls.add(skyArkMicroServiceCall);
        calls.add(skyArkMicroServiceCall2);

        //发起异步请求
        List<String> resultBodys = skyArkAsyncRestClient.callSkyArkMicroService(calls, String.class);

        //模拟解析两次请求的返回
        resultBodys.get(0);
        resultBodys.get(1);
    }
}
