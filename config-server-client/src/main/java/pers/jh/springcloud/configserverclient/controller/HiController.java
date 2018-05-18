package pers.jh.springcloud.configserverclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @Description:
* @Author: jiahao
* @Date: 2018/5/16 12:21
*/
@RestController
public class HiController {

    /**读取git配置文件参数注入*/
    @Value("${name}")
    String name;

    @Value("${age}")
    String age;

    @RequestMapping(value = "/hi")
    public String hi(){
        return String.format("name=>%sage=>%s", name, age);
    }
}
