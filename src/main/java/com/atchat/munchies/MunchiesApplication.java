package com.atchat.munchies;

import com.atchat.AmazonS3Helper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MunchiesApplication {

    public static void main(String[] args){
        SpringApplication.run(MunchiesApplication.class, args);
    }


//    @Component
//    public class CommandLineAppStartupRunner implements CommandLineRunner {
//
//        @Override
//        public void run(String... args) throws Exception {
//            AmazonS3Helper amazonS3Helper = new AmazonS3Helper();
//            amazonS3Helper.test();
//        }
//    }
}
