
package com.brc.java_deitel.capituloVI;
// 6.25 Deitel
public class PrimeIndustry {
    public static void main(String[] args) {
        for(int i = 1; i < 20; i++) {
            if(isPrime(i)) {
                System.out.printf("%d ",i);
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        int divisors = 0; // if divisors > 2, then the number isn't prime anymore, the loop should end.
        
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                divisors++;
            }
            if(divisors > 2) {
                return false;
            }
        }
        return true;
    }
}