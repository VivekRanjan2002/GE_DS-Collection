/*
Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves
independently, and then merge the results to sort the full array. To sort a[lo, hi),
we use the following recursive strategy:
 Base case: If the subarray length is 0 or 1, it is already sorted.
Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the
two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted
result.
 */
package org.example.Algorithm;
public class MergeSort {
    /*
    @desc:Merge sort algorithm on String by dividing arr in two half and calling
          half recursively and then merging both half in place
    @params: Array of String , starting index, ending index
     */
    public void mergesort(String arr[], int l, int r) {
        if(r-l<=1) return;
        if(l<r) {
            int mid = l + (r - l) / 2;
            //sorting both half
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, r);

            // merge both half
            merge(arr, l, mid, r);
        }
    }
    /*
    @desc:sort the given interval size of array in increasing order
    @params: Array of String , Starting index, Mid index, Ending index
     */
    public void merge(String arr[], int l, int mid, int r) {
        // first half arr
        int n1 = mid - l + 1;
        //second half arr
        int n2 = r - mid;
        // creating new temp array
        String[] temp1 = new String[n1];
        String[] temp2 = new String[n2];
        int k = l;
        for (int i = 0; i < n1; i++) {
            temp1[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            temp2[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if ((temp2[j].compareTo(temp1[i]))>=0 ) {
                arr[k++] = temp1[i++];
            } else {
                arr[k++] = temp2[j++];
            }
        }
        while (i < n1) {
            arr[k++] = temp1[i++];
        }
        while (j < n2) arr[k++] = temp2[j++];
    }

    public static void main(String[] args) {
      MergeSort mg= new MergeSort();
        String[] arr = {"apple", "banana", "orange", "mango", "kiwi", "pineapple", "grape",
                "strawberry", "Peach", "Pear"};
      mg.mergesort(arr,0, arr.length-1);
      for(String i:arr) System.out.print(i+" ");  // Peach Pear apple banana mango kiwi orange pineapple grape strawberry
    }
}