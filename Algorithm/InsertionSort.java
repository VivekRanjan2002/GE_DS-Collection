/*
a. Desc -> Reads in strings and prints them in sorted order using Insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List
 */
package org.example.Algorithm;
public class InsertionSort {
    /*
    @desc: Insertion sort algorithm on array by Repeatedly take an element
           from the unsorted part of the array and insert it into its correct position
          within the sorted part by shifting larger elements one position to the right
     @params: Array of String
     */
    void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        String[] arr = {"apple", "banana", "orange", "mango", "kiwi", "pineapple", "grape",
                "strawberry", "Peach", "Pear"};
        obj.insertionSort(arr);
        for(String st: arr) System.out.print(st+" ");
        //output: Peach, Pear, apple, banana, grape, kiwi, mango, orange, pineapple, strawberry

    }
}