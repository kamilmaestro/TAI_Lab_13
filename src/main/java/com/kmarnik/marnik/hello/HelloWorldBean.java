package com.kmarnik.marnik.hello;

class HelloWorldBean {

  private final String message;

  HelloWorldBean(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public String toString() {
    return "HelloWorldBean{" +
        "message='" + message + '\'' +
        '}';
  }
}
