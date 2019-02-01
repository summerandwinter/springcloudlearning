package com.bmsoft.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/1/30
 */
@Service
public class HelloService {
  @Autowired
  RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "hiError")
  public String hiService(String name) {
    return restTemplate.getForObject("http://SERVER-HI/hi?name="+name,String.class);
  }

  public String hiError(String name) {
    return "hi,"+name+",sorry,error!";
  }

}
