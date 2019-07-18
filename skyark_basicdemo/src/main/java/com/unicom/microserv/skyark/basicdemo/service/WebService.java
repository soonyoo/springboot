package com.unicom.microserv.skyark.basicdemo.service;

import com.unicom.microserv.skyark.basicdemo.domain.Paylog;
import com.unicom.microserv.skyark.basicdemo.domain.UserAllInfo;
import com.unicom.skyark.component.service.IBaseService;

import java.util.List;


/**
 * Created by zwqsmd on 2018/8/29.
 */
public interface WebService extends IBaseService {

    List<Paylog> queryPaylog(String acctId, String starttime, String endtime, String provinceId);

    UserAllInfo queryUserAllInfo(String number);
}
