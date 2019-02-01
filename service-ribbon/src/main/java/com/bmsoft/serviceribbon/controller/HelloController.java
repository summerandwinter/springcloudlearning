package com.bmsoft.serviceribbon.controller;

import com.bmsoft.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/1/30
 */
@RestController
public class HelloController {

  @Autowired
  HelloService helloService;

  @RequestMapping(value = "/hi")
  public String hi(@RequestParam String name){
    return helloService.hiService(name);
  }
}
