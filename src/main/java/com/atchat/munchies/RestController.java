package com.atchat.munchies;

import com.atchat.AmazonS3Helper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.PrintWriter;
import java.io.StringWriter;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/{name}")
    public String echo(@PathVariable String name){
        return "Hello " + name + " welcome to the website";
    }

    @GetMapping("/test")
    public String foo() throws Exception {
        AmazonS3Helper amazonS3Helper = new AmazonS3Helper();
        try {
            amazonS3Helper.test();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "test has been done";
    }

}
