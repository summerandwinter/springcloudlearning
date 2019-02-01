package com.bmsoft.servicefeign.controller;

import com.bmsoft.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/1/30
 */
@RestController
public class HiController {
  @Autowired
  private SchedualServiceHi schedualServiceHi;

  @RequestMapping(value="hi", method = RequestMethod.GET)
  public String sayHi(@RequestParam(value="name") String name){
    return schedualServiceHi.sayHiFromClientOne(name);
  }

}
