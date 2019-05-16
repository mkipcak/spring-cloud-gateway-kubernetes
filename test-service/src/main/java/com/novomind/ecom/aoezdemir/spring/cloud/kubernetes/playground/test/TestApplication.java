package com.novomind.ecom.aoezdemir.spring.cloud.kubernetes.playground.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class TestApplication {

  @GetMapping("/")
  @ResponseBody
  public String hello() {
    return "TestApplication says hello!";
  }

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
  }
}
