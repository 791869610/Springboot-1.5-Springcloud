package pers.jh.springcloud.servicefeign.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pers.jh.springcloud.servicefeign.impl.HelloServiceImpl;

@Repository
/**指定调用的服务名称,指定断路由的指定类*/
@FeignClient(value = "service-hi", fallback = HelloServiceImpl.class)
/**
 * @Description: 定义一个接口来调用服务
 * @author: jiahao
 * @Date: 2018/5/16 17:46
 */
public interface HelloService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    /**
     * description
     * @param  name
     * @return java.lang.String
     * @author jiahao
     * @Date 2018/5/16 18:13
     */
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
