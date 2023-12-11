/*
Write static functions to return all permutations of a String using iterative method and
Recursion method. Check if the arrays returned by two string functions are equal.
 */

package org.example.Algorithm;
import java.util.ArrayList;
import java.util.List;
public class StringPermutaion {
    public static void main(String[] args) {
        String st="abc";
      ArrayList<String> RecRes= recPermutation("abc",0,2);
        System.out.println(RecRes);
        ArrayList<String> IterRes=iterativePermutation(st);
        System.out.println(IterRes);
        // comparing both arraylist
        System.out.println(IterRes.equals(RecRes));
    }
    /*
    @desc: compute the possible permutation of string recursively
    @params: string st, starting index, ending index
    @return: Arraylist of String which contain the permutations of string
     */
    public static ArrayList<String> recPermutation(String st,int l,int r){
      ArrayList<String> result= new ArrayList<>();
      if(l==r) {
          result.add(st);
          return result;
      }
      else{
          for(int i=l;i<=r;i++){
              char[] chararray= st.toCharArray();
              char temp= chararray[i];
              chararray[i]=chararray[l];
              chararray[l]=temp;
              result.addAll(recPermutation(String.valueOf(chararray),l+1,r));
          }
      }
      return result;
    }
    /*
    @desc: compute the possible permutations of string iteratively
    @params: string st
    @return: ArrayList of String which contains the possible permutations of string
     */
    public static  ArrayList<String> iterativePermutation(String str){
        ArrayList<String> result= new ArrayList<>();
        result.add("");
        for(char ch: str.toCharArray()){
            ArrayList<String> current = new ArrayList<>();
            for(String st: result) {
                for (int i = 0; i <= st.length(); i++) {
                    String temp = st.substring(0, i) + ch + st.substring(i);
                    current.add(temp);
                }
            }
            result=current;
        }
        return result;
    }
}
