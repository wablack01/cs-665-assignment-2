package edu.bu.met.cs665;

import edu.bu.met.cs665.resources.DeliveryRequest;
import edu.bu.met.cs665.resources.Order;
import edu.bu.met.cs665.users.Driver;
import edu.bu.met.cs665.users.Shop;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDeliveryRequests {
  public TestDeliveryRequests(){}

  /**
   * Test that shops notify the delivery manager of new
   * DeliveryRequests and the order associated with
   * the request is correct
   */
  @Test
  public void testDeliveryManager() {
    String pickupName = "Starbucks";
    String pickupAddress = "700 Commonwealth Ave";
    String productName = "Black Coffee";
    double productPrice = 3.50;
    String deliveryDestination = "808 Commonwealth Ave";

    Shop shop = new Shop(pickupName, pickupAddress);
    Order order = new Order(productName, productPrice, deliveryDestination);
    DeliveryManager manager = new DeliveryManager();

    shop.subscribe(manager);
    shop.placeOrder(order);

    DeliveryRequest pendingRequest = manager.getNewRequest();
    assertEquals(pickupName, pendingRequest.getPickupName());
    assertEquals(pickupAddress, pendingRequest.getPickupAddress());
    assertEquals(productName, pendingRequest.getProduct());
    assertEquals(productPrice, pendingRequest.getPrice(), 0.0);
    assertEquals(deliveryDestination, pendingRequest.getDeliveryAddress());
  }

  /**
   * Test that DeliveryManager notify the drivers of new
   * DeliveryRequests and the order associated with
   * the request is correct
   */
  @Test
  public void testDriver() {
    String pickupName = "Starbucks";
    String pickupAddress = "700 Commonwealth Ave";
    String productName = "Black Coffee";
    double productPrice = 3.50;
    String deliveryDestination = "808 Commonwealth Ave";

    Shop shop = new Shop(pickupName, pickupAddress);
    Order order = new Order(productName, productPrice, deliveryDestination);
    DeliveryManager manager = new DeliveryManager();
    Driver[] drivers = {
            new Driver("Driver 1"),
            new Driver("Driver 2"),
            new Driver("Driver 3"),
            new Driver("Driver 4"),
            new Driver("Driver 5"),
    };

    for (Driver driver : drivers) {
      manager.subscribe(driver);
    }
    shop.subscribe(manager);
    shop.placeOrder(order);

    for (Driver driver : drivers) {
      DeliveryRequest pendingRequest = driver.getPendingRequest();
      assertEquals(pickupName, pendingRequest.getPickupName());
      assertEquals(pickupAddress, pendingRequest.getPickupAddress());
      assertEquals(productName, pendingRequest.getProduct());
      assertEquals(productPrice, pendingRequest.getPrice(), 0.0);
      assertEquals(deliveryDestination, pendingRequest.getDeliveryAddress());
    }
  }
}
