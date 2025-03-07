package com.helloworldcontainerapp.awsfargateapp.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloawsfargatecontroller {


    @GetMapping("/")

    public String hello(){

         return  " Hello  from  aws fargate... ";
    }
}
