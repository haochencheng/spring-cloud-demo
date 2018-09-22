package pers.demo.springcloud.springcloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import pers.demo.springcloud.springcloudeurekaclient.config.RibbonLoadBalanceRule;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClients(
		{@RibbonClient(name = "spring-cloud-service-provider",configuration = RibbonLoadBalanceRule.class)}
)
public class SpringCloudEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientApplication.class, args);
	}

}
