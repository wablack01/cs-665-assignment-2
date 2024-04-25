/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: Driver.java
 * Description: This class is responsible for the methods and attributes of a Driver.
 */

package edu.bu.met.cs665.users;

import edu.bu.met.cs665.resources.DeliveryRequest;
import edu.bu.met.cs665.interfaces.Subscriber;

/**
 * This is the Driver class.
 * This class is responsible for representing a Driver who can fulfill
 * delivery requests issued by Shops and DeliveryManagers
 */
public class Driver implements Subscriber {
  private String name;
  private DeliveryRequest pendingRequest;

  /**
   * Create a driver with the given name
   */
  public Driver(String name){
    this.name = name;
  }

  /**
   * Getter for the pending DeliveryRequest
   * @return the pending delivery request
   */
  public DeliveryRequest getPendingRequest() {
    return this.pendingRequest;
  }

  /**
   * Handle a DeliveryRequest from the management system
   *
   * @param request the DeliveryRequest received from the management system
   */
  @Override
  public void update(DeliveryRequest request) {
    pendingRequest = request;
    System.out.println(name + " received delivery request");
  }
}
