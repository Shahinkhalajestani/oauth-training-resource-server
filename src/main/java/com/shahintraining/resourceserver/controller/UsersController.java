package com.shahintraining.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sh.khalajestanii
 * @project resource-server
 * @since 12/11/2021
 */
@RestController
@RequestMapping("/users")
public class UsersController {


    @GetMapping(value = "/status/check")
    public String status(){
        return "working ... ";
    }

}
