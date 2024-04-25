package edu.bu.met.cs665;

import edu.bu.met.cs665.resources.Order;
import edu.bu.met.cs665.users.Shop;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOrders {
  public TestOrders() {}

  /**
   * Test the store receives orders for the correct items
   */
  @Test
  public void testPlaceOrder() {
    Shop shop = new Shop("Starbucks", "700 Commonwealth Ave");
    Order order = new Order("Black Coffee", 3.50, "808 Commonwealth Ave");
    shop.placeOrder(order);
    assertEquals(order, shop.getNewOrder());
  }
}
