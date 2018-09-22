package pers.demo.springcloud.springcloudeurekaclient.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonLoadBalanceRule {

    @Bean
    public IRule myRule() {
        // 显式的指定使用轮询算法
        return new RoundRobinRule();
    }


}
