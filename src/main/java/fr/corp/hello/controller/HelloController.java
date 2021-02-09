package fr.corp.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
@Slf4j
public class HelloController {

     @RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test1()  {

         String res = "hello power docker";
        log.info("Step 0 start hello");





        log.info("Step 1 end hello");
        return res;
    }


}
