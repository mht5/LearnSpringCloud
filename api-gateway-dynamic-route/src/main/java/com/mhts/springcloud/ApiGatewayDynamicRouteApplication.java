package com.mhts.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayDynamicRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayDynamicRouteApplication.class, args);
	}

	@Bean
	@Primary
	@RefreshScope
	@ConfigurationProperties("zuul")
	public ZuulProperties zuulProperties() {
		return new ZuulProperties();
	}

}
