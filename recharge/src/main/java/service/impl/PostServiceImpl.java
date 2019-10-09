package service.impl;

import cn.chinaunicom.recharge.domain.User;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;


@Service
public class PostServiceImpl implements PostService {

    @Override
    public User PostSN() {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //创建一个post对象  
        HttpPost post = new HttpPost("http://localhost:8082/httpclient/post.action");
        //创建一个Entity。模拟一个表单
        List<NameValuePair> kvList = new ArrayList<>();
        kvList.add(new BasicNameValuePair("username", "张三"));
        kvList.add(new BasicNameValuePair("password", "123"));

        //包装成一个Entity对象 
        StringEntity entity = new UrlEncodedFormEntity(kvList, "utf-8");
        //设置请求的内容 
        post.setEntity(entity);

        //执行post请求
        CloseableHttpResponse response = httpClient.execute(post);
        String string = EntityUtils.toString(response.getEntity());
        System.out.println(string);
        response.close();
        httpClient.close();
    }

}
