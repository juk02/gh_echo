package com.web.echo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EchoController {

    @GetMapping("hello")
    public String echo() {
        return "ok";
    }
}
