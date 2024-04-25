/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: Subscriber.java
 * Description: This interface is responsible for the methods of a Subsriber.
 */

package edu.bu.met.cs665.interfaces;

import edu.bu.met.cs665.resources.DeliveryRequest;

/**
 * This is the Subscriber interface.
 * This interface defines methods for interacting with a Subscriber object
 * within the observer pattern
 */
public interface Subscriber {
  /**
   * Update the subscriber with new data from publisher
   */
  void update(DeliveryRequest request);
}
