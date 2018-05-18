package pers.jh.springcloud.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
/**注解开启Feign的功能*/
@EnableDiscoveryClient
/**向服务中心注册*/
@SpringBootApplication
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}
