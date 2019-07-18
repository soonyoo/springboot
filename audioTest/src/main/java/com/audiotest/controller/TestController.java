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
	        // 可选：设置网络连接参数
	        client.setConnectionTimeoutInMillis(2000);
	        client.setSocketTimeoutInMillis(60000);
	        view.setViewName("/show.jsp");
	       
	        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//	        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//	        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

	        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
	        // 也可以直接通过jvm启动参数设置此环境变量
	        //System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
	        
	        String path = "D:\\recorder\\recorder (1).pcm";//这里设置文件存储的地址，读取文件内容。
	        // 调用接口
	        JSONObject res = client.asr(path, "pcm", 16000, null);
	        System.out.println(res.toString(2));
	        String attributeValue=res.toString(2);
	    	view.addObject("message",attributeValue);
	    	return view;
	        
	    }
    }  


