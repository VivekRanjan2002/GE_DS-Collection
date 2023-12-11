/*
a. Desc -> Read .a List of Numbers from a file and arrange it ascending Order in a
Linked List. Take user input for a number, if found then pop the number out of the
list else insert the number in appropriate position
b. I/P -> Read from file the list of Numbers and take user input for a new number
c. Logic -> Create a Ordered Linked List having Numbers in ascending order.
d. O/P -> The List of Numbers to a File.
 */
package org.example.DS_Programs.OrderedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderedList orderedList = new OrderedList();
        try {
            File file = new File("C:\\Users\\91810\\IdeaProjects\\DS-Collections\\src\\main\\java\\org\\example\\DS_Programs\\OrderedList\\numbers.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int num = Integer.parseInt(scanner.nextLine());
                orderedList.insert(num);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        Scanner userInput = new Scanner(System.in);

        // Enter the number and search it in orderedList if not found then insert in it else delete it
        System.out.print("Enter a number: ");
        int userNumber = userInput.nextInt();
        if (orderedList.head != null) {
            Node temp = orderedList.head;
            boolean found = false;
            while (temp != null) {
                if (temp.data == userNumber) {
                    orderedList.delete(userNumber);
                    found = true;
                    break;
                }
                temp = temp.next;
            }
            if (!found) {
                orderedList.insert(userNumber);
            }
        } else {
            orderedList.insert(userNumber);
        }
       // display the current orderedList
        orderedList.displayList();
        // write current orderedList into file numbers.txt
        orderedList.writeToFile("C:\\Users\\91810\\IdeaProjects\\DS-Collections\\src\\main\\java\\org\\example\\DS_Programs\\OrderedList\\numbers.txt");
    }
}