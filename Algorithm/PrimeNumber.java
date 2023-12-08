/*
Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 */
package org.example.Algorithm;
public class PrimeNumber {
    void PrintPrime(int l,int r){
        for(int i=l;i<=r;i++){
            if(isPrime(i)) System.out.print(i+" ");
        }
        return;
    }
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
