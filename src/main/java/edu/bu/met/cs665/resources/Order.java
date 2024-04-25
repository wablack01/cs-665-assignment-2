/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: Order.java
 * Description: This class is responsible for the methods and attributes of an Order.
 */

package edu.bu.met.cs665.resources;

/**
 * This is the Order class.
 * It represents the concept of a customer's order from a store. A Product
 * is selected from the store, and an order is sent to the store with
 * the product and delivery destination.
 */
public class Order {

  private String product;
  private double price;
  private String destination;

  /**
   * Create Order with given product and destination address
   */
  public Order(String product, double price, String destination) {
    this.product = product;
    this.price = price;
    this.destination = destination;
  }

  /**
   * Getter for the product associated with an order
   * @return the product this order is for
   */
  public String getProduct() {
    return product;
  }

  /**
   * Getter for the price of an order
   * @return the price of this order
   */
  public double getPrice() {
    return price;
  }

  /**
   * Getter for the destination address associated with an order
   * @return the destination of this order
   */
  public String getDestination() {
    return destination;
  }
}
