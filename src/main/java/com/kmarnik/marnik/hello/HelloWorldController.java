package com.kmarnik.marnik.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

  @GetMapping("/hello-world")
  public String helloWorld() {
    return "Hello world";
  }

  @GetMapping("/hello-world-bean")
  public HelloWorldBean helloWorldBean() {
    return new HelloWorldBean("Hello world");
  }

  @GetMapping("/hello-world/path/{name}")
  public HelloWorldBean helloWorldPath(@PathVariable String name) {
    return new HelloWorldBean("Hello world " + name);
  }

}
