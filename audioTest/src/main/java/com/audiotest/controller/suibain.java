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

	        // ��ѡ�������������Ӳ���
	        client.setConnectionTimeoutInMillis(2000);
	        client.setSocketTimeoutInMillis(60000);

	        // ��ѡ�����ô����������ַ, http��socket��ѡһ�����߾�������
//	        client.setHttpProxy("proxy_host", proxy_port);  // ����http����
//	        client.setSocketProxy("proxy_host", proxy_port);  // ����socket����

	        // ��ѡ������log4j��־�����ʽ���������ã���ʹ��Ĭ������
	        // Ҳ����ֱ��ͨ��jvm�����������ô˻�������
	        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");
	        String path = "D:\\recorder\\recorder.pcm";
	        // ���ýӿ�
	        JSONObject res = client.asr(path, "pcm", 16000, null);
	        System.out.println(res.toString(2));
	        
	        
	    }
	}


