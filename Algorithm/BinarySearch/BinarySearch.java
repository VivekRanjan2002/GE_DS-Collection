/*
Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
 */
package org.example.Algorithm.BinarySearch;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        File file= new File("C:\\Users\\91810\\IdeaProjects\\DS-Collections\\src\\main\\java\\org\\example\\Algorithm\\BinarySearch\\words.txt");
        // creating BufferedReader object
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            String[] arr= new String[100];
            int cnt=0;
            while ((str = br.readLine()) != null) {
                for (String st : str.split(",")) {
                    st=st.trim();
                    if(cnt==arr.length){
                        arr=Arrays.copyOf(arr,2*arr.length);
                    }
                arr[cnt++]=st;
                }
            }
           arr= Arrays.copyOf(arr,cnt);
            // sorting the array
            Arrays.sort(arr);
            System.out.println("Index of kiwi is: "+binarySearch(arr,"kiwi"));    // 5
            System.out.println("Index of banana is: "+binarySearch(arr,"banana"));  // 3
            System.out.println("Index of Flower is: "+binarySearch(arr,"Flower"));  //-1
        }
        catch(Exception e){
            System.out.println("File not Found");
        }
    }
    /*
    @desc: binary search on words by repeatedly deciding the search interval size according
           to the comparison of target string with String at mid index
    @params: Array of String, Target String
    @return: int as index of target word if found else -1
     */
    public static int binarySearch(String[] words,String target){
        int left=0,right= words.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            int comparison= target.compareTo(words[mid]);

            if(comparison==0) return mid;
            else if(comparison>0) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
