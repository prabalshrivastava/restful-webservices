package com.learning.spring.restful.microservices.restfulwebservices;

public class HelloWorldBean {
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public HelloWorldBean(String message) {
    this.message=message;
  }
}
