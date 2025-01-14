package com.kh.app98;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String m01(){
        return "<h1>zzzzzzzzz</h1>";
    }
}
