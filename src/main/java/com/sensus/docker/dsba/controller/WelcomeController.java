package com.sensus.docker.dsba.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author SAROY on 3/15/2019
 */
@RestController
@RequestMapping("/c")
public class WelcomeController {

    @GetMapping(value = "/welcome", produces = MediaType.TEXT_PLAIN_VALUE)
    public String welcome() {
        return "Welcome User - Time is: "+ new Date();
    }

}
