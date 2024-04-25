/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: Main.java
 * Description: Main class demonstrates functionality of the application.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.resources.Order;
import edu.bu.met.cs665.users.Driver;
import edu.bu.met.cs665.users.Shop;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    Shop shop = new Shop("Nordstrom", "808 comm ave");
    DeliveryManager manager = new DeliveryManager();
    Driver driver1 = new Driver("driver1");
    Driver driver2 = new Driver("driver2");
    Order order = new Order("Couch", 100, "137 D st");

    manager.subscribe(driver1);
    manager.subscribe(driver2);
    shop.subscribe(manager);


    shop.placeOrder(order);
  }

}
