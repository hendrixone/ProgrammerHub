package com.easymall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@SpringBootApplication
@EnableEurekaClient
public class StarterRibbon {
	public static void main(String[] args) {
		SpringApplication.run(StarterRibbon.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate initRestTemplate(){
		return new RestTemplate();
	}
	//修改自定义的随机负载均衡逻辑
	@Bean
	public IRule initRule(){
		return new RandomRule();
	}
}


