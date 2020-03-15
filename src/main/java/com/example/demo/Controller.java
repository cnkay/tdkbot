package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Servis servis;

    @GetMapping("/tester")
    public void tester() {
        servis.tester();
    }
    @GetMapping("/fileTester")
    public void fileTester() {
        servis.fileTester();
    }
    @GetMapping("/count")
    public Long count(){
        return servis.count();
    }
}
