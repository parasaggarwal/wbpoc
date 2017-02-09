package com.capgemini.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sanrawat on 2/3/2017.
 */

@RestController
public class HelloDockerController {

    @GetMapping(path="/")
    public String helloDocker(){

        return "Hello Docker..!";
    }
}
