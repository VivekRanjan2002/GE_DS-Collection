/*
a. Desc -> Create a Program which creates Banking Cash Counter where people
        come in to deposit Cash and withdraw Cash. Have an input panel to add people
        to Queue to either deposit or withdraw money and dequeue the people. Maintain
        the Cash Balance.
b. I/P -> Panel to add People to Queue to Deposit or Withdraw Money and dequeue
c. Logic -> Write a Queue Class to enqueue and dequeue people to either deposit
        or withdraw money and maintain the cash balance
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.
*/
package org.example.DS_Programs.BankingCash;
import java.util.*;
public class BankingCash {
    static int cashBalance = 10000;
   /*
   @desc: add the deposit amount in cash balance and remove particular person from queue
   @params: Queue and deposited amount
    */
    public static void deposit(Queue queue, int amount) {
        cashBalance += amount;
        System.out.println("Deposited: $" + amount + " | Cash Balance: $" + cashBalance);

    }
   /*
   @desc: withdraw the money from cash balance if possible and remove particular
          person from queue
   @params: Queue and withdrawal amount
    */
    public static void withdraw(Queue queue, int amount) {
        if (cashBalance >= amount) {
            cashBalance -= amount;
            System.out.println("Withdrawn: $" + amount + " | Cash Balance: $" + cashBalance);
        } else {
            System.out.println("Insufficient funds!");
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue(10); // Capacity of the queue

        // Simulating people arriving at the cash counter
        queue.enqueue(1); // Person 1 arrives to deposit
        queue.enqueue(2); // Person 2 arrives to withdraw
        queue.enqueue(3); // Person 3 arrives to deposit

        while (!queue.isEmpty()) {
            int choice = queue.dequeue();
            if (choice == 1) {
                // Deposit
                int depositAmount = 500; // Example deposit amount
                deposit(queue, depositAmount);
            } else if (choice == 2) {
                // Withdraw
                int withdrawAmount = 300; // Example withdrawal amount
                withdraw(queue, withdrawAmount);
            } else {
                System.out.println("Invalid choice!");
            }
        }

        /*
        output received:
        Deposited: $500 | Cash Balance: $10500
        Withdrawn: $300 | Cash Balance: $10200
        Invalid choice!
         */
    }
}
