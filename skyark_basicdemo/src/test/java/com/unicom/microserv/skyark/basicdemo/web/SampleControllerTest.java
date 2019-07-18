package com.unicom.microserv.skyark.basicdemo.web;

import com.unicom.skyark.component.web.data.BaseRsp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {
    @Autowired
    TestRestTemplate testRestTemplate;
    @Test
    public void hello() throws Exception {
        ResponseEntity<BaseRsp> result = testRestTemplate.getForEntity("/skyark/basicdemo/hello", BaseRsp.class);
        assertEquals(HttpStatus.OK, result.getStatusCode());
        BaseRsp<String, ?> baseResult = result.getBody();
        assertEquals("Hello World!", baseResult.getRsp().getData().get(0));
    }
}