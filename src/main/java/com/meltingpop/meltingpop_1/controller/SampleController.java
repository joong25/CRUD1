package com.meltingpop.meltingpop_1.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
@Log4j2
public class SampleController {

    @RequestMapping("/ex1")
    public void ex1(){

    }

    @GetMapping("ex2")
    public void ex2(){

    }

    @GetMapping({"exLayout1","exSidebar"})
    public void exLayout1(){
        log.info("exLayout.......");
    }
}
