package br.com.holliday.backend.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello Holliday!!!";
    }
}
