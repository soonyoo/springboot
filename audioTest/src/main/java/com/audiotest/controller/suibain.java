package com.audiotest.controller;

import org.json.JSONObject;

import com.baidu.aip.speech.AipSpeech;

public class suibain {
	private static final String APP_ID = "11532928";
	private static final String API_KEY = "uNXHkUtP5C6H33m2EzvcNM2l";
	private static final String SECRET_KEY = "rFXOiv9accskfcwThgjtwviuY53clU4w ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AipSpeech client = new AipSpeech(APP_ID, API_KEY, SECRET_KEY);

	        // 可选：设置网络连接参数
	        client.setConnectionTimeoutInMillis(2000);
	        client.setSocketTimeoutInMillis(60000);

	        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//	        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//	        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

	        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
	        // 也可以直接通过jvm启动参数设置此环境变量
	        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
	        String path = "D:\\recorder\\recorder.pcm";
	        // 调用接口
	        JSONObject res = client.asr(path, "pcm", 16000, null);
	        System.out.println(res.toString(2));
	        
	        
	    }
	}


