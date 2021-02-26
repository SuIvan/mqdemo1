package com.test.ivan.mqdemo1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * @author ivan
 * @date 2021-02-26 10:54
 */
@RestController
@RequestMapping("/test")
public class ControllerDemo {
    @GetMapping("/t1")
    public ResponseEntity getAppropriationRecord(){
        return ResponseEntity.ok("tt");
    }
}
