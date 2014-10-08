
package src;

import java.util.ArrayList;

public class FunctionCheck {
    
    /**
     * 
     * Uses the NaivePrimeValidator class as the default PrimeValidator
     * @param secret An implementation of the Secret interface, encapsulating a function
     * @param given A given integer
     * @return "True" if function is additive, else false
     */
    public static boolean isAdditiveFunction(Secret secret, int given){
        
        return isAdditiveFunction(secret, given, new NaivePrimeValidator());
    }
    /**
     * 
     * Determines if a given mathematical function encapsulated in an 
     * implementation of Secret is an additive function. 
     * It determines this by generating a list of prime numbers less than the
     * given integer. It then iterates through this list checking to see if 
     * any primes fail the Secret(x + y) = Secret(x) + Secret(y) test.
     * 
     * @param secret An implementation of the Secret interface, encapsulating a function
     * @param given A given integer
     * @param validator An implementation of the PrimeValidtor interface
     * @return "True" if function is additive, else false
     */
    public static boolean isAdditiveFunction(Secret secret, int given, PrimeValidator validator){
        //So we get a list of at least two primes
        if(given < 4){ 
            throw new IllegalArgumentException("Please input a value >= 4");
        }
        
        ArrayList<Integer> primeNumbers = PrimeNumberGenerator.getPrimeNumbers(given, validator);
        
        for(int i = 0; i < primeNumbers.size()-1; i++){
            int x = primeNumbers.get(i);
            int y = primeNumbers.get(i+1);
            
            if(secret.function(x + y) != (secret.function(x) + secret.function(y))){
                return false;
            }
        }
        
        return true;
    }
    
    
}
