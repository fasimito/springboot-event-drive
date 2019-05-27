package com.events.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
@Api("Kafka Message Validator")
public class SendMsgController {

    @RequestMapping(value = "/send",method = RequestMethod.GET)
    public String send(@RequestParam(required = true) String message){
        return "";
    }

}
