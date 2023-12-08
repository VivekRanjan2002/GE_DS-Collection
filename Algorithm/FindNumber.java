/*
Desc -> takes a command-line argument N, asks you to think of a number
between 0 and N-1, where N = 2^n, and always guesses the answer with n
questions.
b. I/P -> the Number N and then recursively ask true/false if the number is between
a high and low value
c. Logic -> Use Binary Search to find the number
d. O/P -> Print the intermediary number and the final answer
 */
package org.example.Algorithm;
import java.util.Scanner;
public class FindNumber {
    int  guessNumber(int low,int high,Scanner scanner){
        if(low==high) return low;
        if(low>high) return -1;
        int mid= low+(high-low)/2;
        System.out.println("Press true if your number is between "+low+" and "+mid +" else false");
        boolean response= scanner.nextBoolean();
        if(response){
          return  guessNumber(low,mid,scanner);
        }
        else return guessNumber(mid+1,high,scanner);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Type Number: ");
        int n= scanner.nextInt();
        int range= (int) Math.pow(2,n);
        FindNumber fn= new FindNumber();
        System.out.println(fn.guessNumber(0,range-1,scanner));
    }
}
