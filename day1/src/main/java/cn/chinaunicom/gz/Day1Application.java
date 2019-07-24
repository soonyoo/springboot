package cn.chinaunicom.gz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@Import(SpringDataRestConfiguration.class)
@EnableSwagger2
public class Day1Application {

    public static void main(String[] args) {
        SpringApplication.run(Day1Application.class, args);
    }

}
