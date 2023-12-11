package org.example.DS_Programs.OrderedList;
import java.io.*;
import java.util.*;
class OrderedList {
    Node head;
    OrderedList() {
        this.head = null;
    }
    /*
    @desc: insert data in orderedList
     */
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) { // when data is smallest one or only one node
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    /*
    @desc: delete particular node from orderedList
     */
    void delete(int data) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == data) { // delete the starting node
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Element not found in the list.");
            return;
        }
        prev.next = temp.next;
    }
    /*
    @desc: display each nodes of the orderedList
     */
    void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
   /*
   @desc: write the nodes of the orderedList to the file
    */
    void writeToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Node current = head;
            while (current != null) {
                bufferedWriter.write(String.valueOf(current.data));
                bufferedWriter.newLine();
                current = current.next;
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}


