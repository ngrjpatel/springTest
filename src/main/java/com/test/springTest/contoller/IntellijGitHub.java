package com.test.springTest.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntellijGitHub {

    @GetMapping("/test")
    public String test() {
        hello();
        System.out.println("This example is to test GitHub integration with IntelliJ IDEA.");
        return "GitHub integration with IntelliJ IDEA is working!";
    }
    public String hello() {
        System.out.println("hello");
        System.out.println( "hello2");
        return "hello";
    }
    public String hello2() {
        System.out.println("hello2");
        return "hello2";
    }
    public String hello3() {
        System.out.println("hello3");
        return "hello3";
    }
}
