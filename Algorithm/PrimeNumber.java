/*
Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 */
package org.example.Algorithm;
public class PrimeNumber {
    /*
    @desc: print prime numbers that lies within a given range
    @params: starting point and ending point
     */
    void PrintPrime(int l,int r){
        for(int i=l;i<=r;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
        return;
    }
    /*
    @desc: compute whether a number is prime or not
    @params: int number
    @return: boolean value if prime then true else false
     */
     boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
     }

    public static void main(String[] args) {
        PrimeNumber pn= new PrimeNumber();
        pn.PrintPrime(0,1000);
    }
}
