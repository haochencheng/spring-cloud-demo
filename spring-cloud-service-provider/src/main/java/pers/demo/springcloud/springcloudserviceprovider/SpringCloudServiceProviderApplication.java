package pers.demo.springcloud.springcloudserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceProviderApplication.class, args);
	}
}
