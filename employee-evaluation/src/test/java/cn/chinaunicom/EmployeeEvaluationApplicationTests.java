package cn.chinaunicom;

import cn.chinaunicom.common.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.chinaunicom.common.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeEvaluationApplicationTests {

    @Test
    public void contextLoads() {
//        ArrayList<String> frontPostData = new ArrayList<String>();
//        frontPostData.add("[, , , , , , , , ]");
//        frontPostData.add("[易阳锋, 1, 1, 1, 11, 11, 1, 1, 1]");
//        frontPostData.add("[黄家乐, 2, 2, 2, 2, 22, 2, 2, 2]");
//
//        //System.out.println(frontPostData);
//        for(String list : frontPostData){
//            System.out.println(list);
//            String[] lis = list.split(",");
//            for(String li :lis){
//                System.out.println(li);
//            }
//            System.out.println("----------------------------");
//        }

        //System.out.println(frontPostData.size());
        /*
        *   //获取时间加一年或加一月或加一天
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);//设置起时间
    //System.out.println("111111111::::"+cal.getTime());
    cal.add(Calendar.YEAR, 1);//增加一年
    //cd.add(Calendar.DATE, n);//增加一天  
   //cd.add(Calendar.DATE, -10);//减10天  
    //cd.add(Calendar.MONTH, n);//增加一个月   
    System.out.println("输出::"+cal.getTime());

        * */

        String testDate = "2019-07";
        String beignDate = testDate+"-01";

        Date date1 = DateUtil.StringToDate(beignDate, "yyyy-MM-dd");
        System.out.println(date1);

        Date date2 = DateUtil.StringToDate(testDate, "yyyy-MM");
        System.out.println("date2............");
        System.out.println(date2);


        System.out.println("下面方法，增加一个月");
        Date date3 = DateUtil.addMonth(date2, 1);
        System.out.println(date3);






        //String endDate =  testDate+""
        //StringToDateConverter converter = new StringToDateConverter();


        //Date date1 = converter.convert(testDate);
        //System.out.println(date1);



    }



}
