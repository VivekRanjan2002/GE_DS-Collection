/*
a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List
 */
package org.example.Algorithm;
public class InsertionSort {
    public static void main(String[] args) {
        String[] arr={"apple", "banana", "orange", "mango", "kiwi", "pineapple", "grape",
                "strawberry" ,"Peach","Pear"};
        arr=insertionSort(arr);
        for(String st:arr) System.out.print(st+" ");
        //output: Peach, Pear, apple, banana, grape, kiwi, mango, orange, pineapple, strawberry
    }
    public static String[] insertionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // loop for arr.length round
            // swapping adjacent pair in each round
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
