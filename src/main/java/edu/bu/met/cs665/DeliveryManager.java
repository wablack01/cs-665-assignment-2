/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: DeliveryManager.java
 * Description: This class is responsible for the methods and attributes of a DeliveryManager.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.interfaces.Publisher;
import edu.bu.met.cs665.interfaces.Subscriber;
import edu.bu.met.cs665.resources.DeliveryRequest;

import java.util.ArrayList;

/**
 * This is the DeliveryManager class.
 * This class is responsible for representing a delivery manager system
 * that receives delivery requests from shops and broadcasts them to
 * drivers who can deliver them.
 */
public class DeliveryManager implements Publisher, Subscriber {

  private ArrayList<Subscriber> drivers = new ArrayList<>();
  private DeliveryRequest newRequest = null;

  /**
   * Getter for the newest DeliveryRequest
   * @return the new delivery request from the shop
   */
  public DeliveryRequest getNewRequest() {
    return this.newRequest;
  }

  /**
   * Add a subscriber to the management system list of subscriber.
   *
   * @param subscriber the subscriber to add
   */
  @Override
  public void subscribe(Subscriber subscriber) {
    this.drivers.add(subscriber);
  }

  /**
   * Remove a subscriber from the management system's list of subscribers
   *
   * @param subscriber the subscriber to remove
   */
  @Override
  public void unsubscribe(Subscriber subscriber) {
    this.drivers.remove(subscriber);
  }

  /**
   * Notify all subscribers of a delivery request
   */
  @Override
  public void notifySubscribers() {
    for (Subscriber driver : this.drivers) {
      driver.update(newRequest);
    }
  }

  /**
   * Handle the new DeliveryRequest from a shop
   */
  @Override
  public void update(DeliveryRequest request) {
    this.newRequest = request;
    this.notifySubscribers();
  }
}
