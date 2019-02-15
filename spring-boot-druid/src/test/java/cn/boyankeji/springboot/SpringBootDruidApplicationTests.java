package cn.boyankeji.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDruidApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    DataSource dataSource;

    @Test
    public void Test(){
        System.out.println(dataSource.getClass());
    }


}
