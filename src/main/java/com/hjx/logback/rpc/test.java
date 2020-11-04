package com.hjx.logback.rpc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class test {

    @GetMapping("/test")
    public String test(){
        log.info("7777");
        return "test";
    }
}
