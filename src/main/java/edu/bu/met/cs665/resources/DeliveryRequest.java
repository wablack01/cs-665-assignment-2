/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: DeliveryRequest.java
 * Description: This class is responsible for the methods and attributes of a DeliveryRequest.
 */

package edu.bu.met.cs665.resources;

import edu.bu.met.cs665.resources.Order;
import edu.bu.met.cs665.users.Shop;

/**
 * This is the DeliveryRequest class.
 * This class is responsible for representing a delivery request from
 * a Shop to a DeliveryManager system.
 */
public class DeliveryRequest {
  private Shop shop;
  private Order order;

  /**
   * Create DeliveryRequest with the given Shop and Order
   */
  public DeliveryRequest(Shop shop, Order order) {
    this.shop = shop;
    this.order = order;
  }

  /**
   * Getter for the name of the shop that issued the DeliveryRequest
   *
   * @return the shop's name
   */
  public String getPickupName() {
    return this.shop.getName();
  }

  /**
   * Getter for the address of the shop that issued the DeliveryRequest
   *
   * @return the shop's address
   */
  public String getPickupAddress() {
    return this.shop.getAddress();
  }

  /**
   * Getter for the address to deliver the order
   *
   * @return the order's destination address
   */
  public String getDeliveryAddress() {
    return this.order.getDestination();
  }

  /**
   * Getter for the name of the product associated with the order
   *
   * @return the name of the product
   */

  public String getProduct() {
    return this.order.getProduct();
  }

  /**
   * Getter for the price of the order associated with this delivery
   *
   * @return the price of the order
   */
  public double getPrice() {
    return this.order.getPrice();
  }
}
