package pers.jh.springcloud.servicezuul1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class Servicezuul1Application {

	public static void main(String[] args) {
		SpringApplication.run(Servicezuul1Application.class, args);
	}
}
