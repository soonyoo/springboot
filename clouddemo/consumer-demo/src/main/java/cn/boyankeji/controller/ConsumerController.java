package cn.boyankeji.controller;

import cn.boyankeji.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private DiscoveryClient discoveryClient;// Eureka客户端，可以获取到服务实例信息


    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id){
        //String url = "http://localhost:8081/user/" + id;

        /*

        // 根据服务名称，获取服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        // 因为只有一个UserService,因此我们直接get(0)获取
        ServiceInstance instance = instances.get(0);
        // 获取ip和端口信息
        String baseUrl = "http://"+instance.getHost() + ":" + instance.getPort()+"/user/"+ id;

        */

        //使用Ribbon负载均衡器....
        String baseUrl = "http://user-service/user/"+ id;

        return this.restTemplate.getForObject(baseUrl, User.class);
    }

}
