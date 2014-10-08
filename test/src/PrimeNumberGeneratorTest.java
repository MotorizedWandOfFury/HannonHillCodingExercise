/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Ping
 */
public class PrimeNumberGeneratorTest {
    
    public PrimeNumberGeneratorTest() {
    }

    /**
     * Test of getPrimeNumbers method, of class PrimeNumberGenerator.
     */
    @Test
    public void testGetPrimeNumbers() {
        System.out.println("Testing Prime Number Generation");
        java.util.ArrayList<Integer> primes = PrimeNumberGenerator.getPrimeNumbers(12, new NaivePrimeValidator());
        assertTrue(primes.size() == 5);
        assertTrue(primes.contains(2));
        assertTrue(primes.contains(3));
        assertTrue(primes.contains(5));
        assertTrue(primes.contains(7));
        assertTrue(primes.contains(11));
    }
    
}
