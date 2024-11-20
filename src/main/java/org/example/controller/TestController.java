package org.example.controller;


import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TestController {
    @GetMapping("/hello")
    public String hello(String name, Model model) {
        //http://localhost:300/hello

        //html 이름
        return "hello";
    }
    
}
