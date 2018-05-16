package pers.jh.springcloud.servicefeign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients/**注解开启Feign的功能*/
@EnableDiscoveryClient/**向服务中心注册*/
@SpringBootApplication
public class Servicefeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(Servicefeign1Application.class, args);
	}
}
