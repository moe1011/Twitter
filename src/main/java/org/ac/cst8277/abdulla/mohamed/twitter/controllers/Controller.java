package org.ac.cst8277.abdulla.mohamed.twitter.controllers;

import org.ac.cst8277.abdulla.mohamed.twitter.dto.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();
  @GetMapping(path = "/")
  public Greeting getMainPage(@RequestParam(value = "name", defaultValue = "World") String name) {
  return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
}