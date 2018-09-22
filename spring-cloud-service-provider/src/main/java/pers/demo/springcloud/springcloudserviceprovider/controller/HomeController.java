package pers.demo.springcloud.springcloudserviceprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pers.demo.springcloud.springcloudserviceprovider.model.User;

@RestController
public class HomeController {


    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return new User(id,"aa");
    }

}
