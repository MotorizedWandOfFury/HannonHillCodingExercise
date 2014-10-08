/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ping
 */
public class NaivePrimeValidatorTest {
    
    public NaivePrimeValidatorTest() {
    }

    /**
     * Test of isPrime method, of class NaivePrimeValidator.
     */
    @Test
    public void testIsPrime() {
        System.out.println("Testing isPrime on prime numbers");
        NaivePrimeValidator validator = new NaivePrimeValidator();
        
        assertTrue(validator.isPrime(2));
        assertTrue(validator.isPrime(3));
        assertTrue(validator.isPrime(5));
        assertTrue(validator.isPrime(7));
        assertTrue(validator.isPrime(11));
    }
    
    @Test
    public void testIsNotPrime() {
        System.out.println("Testing isPrime on composite numbers");
        NaivePrimeValidator validator = new NaivePrimeValidator();
        
        assertFalse(validator.isPrime(6));
        assertFalse(validator.isPrime(12));
        assertFalse(validator.isPrime(18));
        assertFalse(validator.isPrime(120));
        assertFalse(validator.isPrime(121));
    }
}
