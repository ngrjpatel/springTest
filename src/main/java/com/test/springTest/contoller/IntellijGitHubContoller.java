package com.test.springTest.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntellijGitHubContoller {
    // This is a test controller for GitHub integration with IntelliJ IDEA
    // It contains a simple endpoint to demonstrate the functionality

    @GetMapping("/test")
    public String test() {
        return "GitHub integration with IntelliJ IDEA is working!";
    }
    public String hello() {
        return "hello";
    }
}
