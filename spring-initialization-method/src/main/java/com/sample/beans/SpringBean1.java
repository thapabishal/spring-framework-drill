package com.sample.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

  public SpringBean1() {
    System.out.println("SpringBean1:: no-arg(default) constructor");
  }
}
