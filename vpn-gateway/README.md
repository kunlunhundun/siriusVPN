## 一.使用Nacos实现动态路由

### 1.1 示例JSON配置

#### https://blog.csdn.net/u010046908/article/details/100933635


### 现在我们在浏览器访问: http://localhost:9921/actuator/gateway/routes

### 我们在使用http://localhost:8921/product/ahas访问，返回了如下页面。


```json
[
    {
       "id": "aliyun_route","uri":"https://www.aliyun.com/","order": 0,
       "filters": [],
       "predicates": 
       [{"args": {"pattern":"/product/**"},"name":"Path"}]
    },
    {
       "id": "aliyun_route1","uri":"https://trustsonic.com:8080/swagger-ui.html","order": 0,
       "filters": [],
       "predicates": 
       [{"args": {"pattern":"/vpns/**"},"name":"Path"}]
    }
]
```
