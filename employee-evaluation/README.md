#  员工互评

## 员工评价测试页面
http://10.116.8.212:8082/emp/add
## 互评结果数据
http://10.116.8.212:8082/emp/evalist 

############################################
## 根据ID查互评结果数据（emp/后面的1是id编号）
http://10.116.8.212:8082/emp/1
############################################

## 员工信息数据查询接口
http://10.116.8.212:8082/emp/list
## 接收前端Post过来的数据
http://10.116.8.212:8082/emp/frontdata

# 根据传入的年月，返回互评数据
http://10.116.8.212:8082/emp/evaluation/2019-07



# 架构
sprintBoot + Mybatis (SSM)

1.dao 
...mapper.xml
.....
2.service 
2.1 servicer接口类
2.2 service.impl实现类

3.conctroller



# 报表sql
```sql
select
    `name`,
    sum(`saturation`)/count(1) as saturation,
    sum(`completion`)/count(1) as completion,
    sum(`contribution`)/count(1) as contribution,
    sum(`satisfaction`)/count(1) as satisfaction,
    sum(`growth`)/count(1) as growth,
    sum(`innovation`)/count(1) as innovation,
    sum(`addition`)/count(1) as addition,
    sum(`subtraction`)/count(1) as subtraction,
    DATE_FORMAT(input_date,'%Y-%m') as input_date
from  evaluation where input_date BETWEEN '2019-07-01' and '2019-08-01'
group by name,DATE_FORMAT(input_date,'%Y-%m')

```




