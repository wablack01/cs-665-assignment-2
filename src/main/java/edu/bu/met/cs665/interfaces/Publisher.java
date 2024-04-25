/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/022/2024
 * File Name: Publisher.java
 * Description: This interface is responsible for the methods of a Publisher.
 */

package edu.bu.met.cs665.interfaces;

/**
 * This is the Publisher interface.
 * This interface defines methods for interacting with a Publisher object
 * within the observer pattern
 */
public interface Publisher {
  /**
   * Add a subscriber to this publisher
   */
  void subscribe(Subscriber subscriber);

  /**
   * Remove a subscriber from this publisher
   */
  void unsubscribe(Subscriber subscriber);

  /**
   * Notify all subscribers of some state/data change
   */
  void notifySubscribers();
}
