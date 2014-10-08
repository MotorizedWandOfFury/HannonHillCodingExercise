
package src;

import java.util.ArrayList;

/**
 *
 * Generates a list of prime numbers less than a given number. The class takes
 * an implementation of  PrimeValidator to determine whether a number is prime.
 */
public class PrimeNumberGenerator {
    static ArrayList<Integer> getPrimeNumbers(int n, PrimeValidator validator){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i = 2; i < n; i ++){
            if(validator.isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
}
