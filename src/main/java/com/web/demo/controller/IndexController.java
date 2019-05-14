package com.web.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ResponseEntity<Object> index(){
        return new ResponseEntity<>("you have reached home!", HttpStatus.ACCEPTED);
    }
}
