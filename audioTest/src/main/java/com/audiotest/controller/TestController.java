package com.audiotest.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.baidu.aip.speech.AipSpeech;

@Controller
public class TestController {
	private static final String APP_ID = "16278621";
	private static final String API_KEY = "BoQImSFfqtB8PPCN8ud217IL";
	private static final String SECRET_KEY = "rBvLjgcSr8tS1SOEGQncsaGxaLsAPHgQ";
	@RequestMapping("/ChangeToChinese")  
   
    public ModelAndView  hello() {  
	     AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);
	         ModelAndView view = new ModelAndView();
	        // ��ѡ�������������Ӳ���
	        client.setConnectionTimeoutInMillis(2000);
	        client.setSocketTimeoutInMillis(60000);
	        view.setViewName("/show.jsp");
	       
	        // ��ѡ�����ô����������ַ, http��socket��ѡһ�����߾�������
//	        client.setHttpProxy("proxy_host", proxy_port);  // ����http����
//	        client.setSocketProxy("proxy_host", proxy_port);  // ����socket����

	        // ��ѡ������log4j��־�����ʽ���������ã���ʹ��Ĭ������
	        // Ҳ����ֱ��ͨ��jvm�����������ô˻�������
	        //System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
	        
	        String path = "D:\\recorder\\recorder (1).pcm";//���������ļ��洢�ĵ�ַ����ȡ�ļ����ݡ�
	        // ���ýӿ�
	        JSONObject res = client.asr(path, "pcm", 16000, null);
	        System.out.println(res.toString(2));
	        String attributeValue=res.toString(2);
	    	view.addObject("message",attributeValue);
	    	return view;
	        
	    }
    }  


