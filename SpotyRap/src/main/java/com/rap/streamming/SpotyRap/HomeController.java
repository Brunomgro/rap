package com.rap.streamming.SpotyRap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/kaiqueira")
    @ResponseBody
    public String home() {
        return "Bem-vindo ao SpotyRap!";
    }
}
