package com.entra21.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
         @RequestMapping("/")
          @ResponseBody
    public String Hello(){

        return "Hello api";
    }

}
