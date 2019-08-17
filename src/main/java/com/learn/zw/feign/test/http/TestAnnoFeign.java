package com.learn.zw.feign.test.http;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "learn-provider")
public interface TestAnnoFeign {



    @RequestMapping(value = "/test/port", method = RequestMethod.GET)
    String testRibbon();

    @RequestMapping(value = "/test/timeout/{timeout}", method = RequestMethod.GET)
    String testTimeout(@PathVariable("timeout") Long timeout);

}
