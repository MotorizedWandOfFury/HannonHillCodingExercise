
package src;

/**
 *
 * An implementation of the PrimeValidator interface.
 * This is the simplest way to determine if a given integer is prime. 
 * Should be about O(n).
 */
public class NaivePrimeValidator implements PrimeValidator {

    @Override
    public boolean isPrime(int n) {
        
        for(int i = 2; i < n; i++){
            if(n % i == 0 && i != n){
                return false;
            }
        }
        
        return true;
        
    }
    
}
