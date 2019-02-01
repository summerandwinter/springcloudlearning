package com.bmsoft.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/1/30
 */
@Service
@FeignClient(value="server-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
  @RequestMapping(value="hi", method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value="name") String name);

}
