/**
 * @author jchips12
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   *
   * @param someone
   *          person name
   * @return string containing Hello + someone
   */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
