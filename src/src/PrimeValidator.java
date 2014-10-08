
package src;

/**
 *
 * This interface exists to allow users of this API to choose how they wish to 
 * check for primality. For example, via Fermat's Little Theorem.
 */
public interface PrimeValidator {
    public boolean isPrime(int n);
}
