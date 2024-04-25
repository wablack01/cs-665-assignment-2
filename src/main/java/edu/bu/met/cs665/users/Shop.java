/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: Shop.java
 * Description: This class is responsible for the methods and attributes of a Shop.
 */

package edu.bu.met.cs665.users;

import edu.bu.met.cs665.resources.DeliveryRequest;
import edu.bu.met.cs665.resources.Order;
import edu.bu.met.cs665.interfaces.Publisher;
import edu.bu.met.cs665.interfaces.Subscriber;

import java.util.ArrayList;

/**
 * This is the Shop class.
 * This class is responsible for representing a shop that accepts
 * orders from customers and issues delivery requests to a delivery
 * management system
 */
public class Shop implements Publisher {

  private String name;
  private String address;
  private Order newOrder;
  private ArrayList<Subscriber> deliveryManagers = new ArrayList<>();

  /**
   * Create a shop with the given name
   */
  public Shop(String name, String address) {
    this.name = name;
    this.address = address;
  }

  /**
   * Getter for the shop's name
   * @return the shop's name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Getter for the shop's address
   * @return the shop's address
   */
  public String getAddress() {
    return this.address;
  }

  /**
   * Getter for the newest order
   *
   * @return the newest order
   */
  public Order getNewOrder() {
    return this.newOrder;
  }

  /**
   * Place an order with this Shop
   *
   * @param newOrder the order being place with the shop
   */
  public void placeOrder(Order newOrder) {
    this.newOrder = newOrder;
    this.notifySubscribers();
  };

  /**
   * Add a subscriber to the shop's list of subscriber.
   *
   * @param subscriber the subscriber to add
   */
  @Override
  public void subscribe(Subscriber subscriber) {
    this.deliveryManagers.add(subscriber);
  }

  /**
   * Remove a subscriber from the shops list of subscribers.
   *
   * @param subscriber the subscriber to remove
   */
  @Override
  public void unsubscribe(Subscriber subscriber) {
    this.deliveryManagers.remove(subscriber);
  }

  /**
   * Create a DeliveryRequest for the latest order and broadcast it
   * to all subscribers
   */
  @Override
  public void notifySubscribers() {
    DeliveryRequest deliveryRequest = new DeliveryRequest(this, newOrder);
    for (Subscriber manager : this.deliveryManagers) {
      manager.update(deliveryRequest);
    }
  }
}
