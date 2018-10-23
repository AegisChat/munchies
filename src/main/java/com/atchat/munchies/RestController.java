package com.atchat.munchies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/{name}")
    public String echo(@PathVariable String name){
        return "Hello " + name + " welcome to the website";
    }
}
