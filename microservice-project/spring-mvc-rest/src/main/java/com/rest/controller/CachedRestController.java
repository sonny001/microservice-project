package com.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program microservice-project
 * @description: 缓存rest
 * @author: sonny
 * @create: 2020/01/07 21:56
 */
@Controller
public class CachedRestController {



    @RequestMapping
    @ResponseBody
    public String hello(){
        return "Hellow";
    }

    @RequestMapping("/cache")
    public ResponseEntity<String> cacheHellow(@RequestParam(required = false,defaultValue = "true") Boolean cache){
        if (cache) {
            return new ResponseEntity("hello", HttpStatus.NOT_MODIFIED);
        }
        return ResponseEntity.ok("hellowwww");

    }


}
