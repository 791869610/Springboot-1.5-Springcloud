package pers.jh.springcloud.servicefeign.impl;

import org.springframework.stereotype.Component;
import pers.jh.springcloud.servicefeign.service.HelloService;

@Component
/**
 * @program: springcloud
 * @description: 实现SchedualServiceHi 接口，并注入到Ioc容器中，作为断路由的指定类
 * @author: jiahao
 * @create: 2018-05-16 21:40
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
