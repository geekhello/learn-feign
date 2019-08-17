package com.learn.zw.feign.test;


import com.learn.zw.feign.test.http.TestAnnoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAnnoController {

    @Autowired
    private TestAnnoFeign testAnnoFeign;

    @RequestMapping(value = "/test/port", method = RequestMethod.GET)
    public String testRibbon() {
        return testAnnoFeign.testRibbon();
    }

    @RequestMapping(value = "/test/timeout/{timeout}", method = RequestMethod.GET)
    public String testTimeout(@PathVariable("timeout") Long timeout) throws Exception{
        return testAnnoFeign.testTimeout(timeout);
    }
}
