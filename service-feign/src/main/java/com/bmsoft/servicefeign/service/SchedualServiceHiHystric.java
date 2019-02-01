package com.bmsoft.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/1/31
 */
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{

  @Override
  public String sayHiFromClientOne(String name) {
    return "sorry "+name;
  }
}
