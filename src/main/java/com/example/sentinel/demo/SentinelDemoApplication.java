package com.example.sentinel.demo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableApolloConfig
public class SentinelDemoApplication {

  public static void main(String[] args) {

    SpringApplication.run(SentinelDemoApplication.class, args);
  }

  //此处由于导入sentinel-servlet包，会自动创建一个资源"/hello/test"
  @GetMapping("/hello/test")
  public String test() {
    return "ok";
  }

}

