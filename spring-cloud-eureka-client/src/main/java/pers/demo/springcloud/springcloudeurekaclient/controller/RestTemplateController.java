package pers.demo.springcloud.springcloudeurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pers.demo.springcloud.springcloudeurekaclient.dto.User;

@RestController
public class RestTemplateController {

    private Logger logger=LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        ResponseEntity<User> forEntity = restTemplate.getForEntity("http://spring-cloud-service-provider/user/" + id, User.class);
        HttpStatus statusCode = forEntity.getStatusCode();
        logger.info("请求结果：",statusCode.toString());
        return forEntity.getBody();
    }


}
