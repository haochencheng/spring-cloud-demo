package pers.demo.springcloud.springcloudeurekaclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigClientController {

    @Value("${test.name}")
    private String name;


    @GetMapping("/config/dev")
    public String getConfigFromConfigServer(){
        return name;
    }


}
