package ca.caledi.primefactorsservice.service;

import ca.caledi.primefactorsservice.service.PrimeFactorsService;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class PrimeFactorsServiceTest {

    private PrimeFactorsService primeFactorService = new PrimeFactorsService();

    @Test
    public void testWhen2Return2() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(2l);
        assertEquals(1, primes.size());
        assertEquals(1, primes.get(2l).intValue());
    };

    @Test
    public void testWhen3Return3() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(3l);
        assertEquals(1, primes.size());
        assertEquals(1, primes.get(3l).intValue());
    };

    @Test
    public void testWhen4Return2_2() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(4l);
        assertEquals(1, primes.size());
        assertEquals(2, primes.get(2l).intValue());
    };

    @Test
    public void testWhen5Return5() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(5l);
        assertEquals(1, primes.size());
        assertEquals(1, primes.get(5l).intValue());
    };

    @Test
    public void testWhen6Return2_3() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(6l);
        assertEquals(2, primes.size());
        assertEquals(1, primes.get(2l).intValue());
        assertEquals(1, primes.get(3l).intValue());
    };

    @Test
    public void testWhen7Return7() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(7l);
        assertEquals(1, primes.size());
        assertEquals(1, primes.get(7l).intValue());
    };

    @Test
    public void testWhen8Return2_2_2() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(8l);
        assertEquals(1, primes.size());
        assertEquals(3, primes.get(2l).intValue());
    };

    @Test
    public void testWhen11Return11() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(11l);
        assertEquals(1, primes.size());
        assertEquals(1, primes.get(11l).intValue());
    };

    @Test
    public void testWhen1000Return2_2_2_5_5_5() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(1000l);
        assertEquals(2, primes.size());
        assertEquals(3, primes.get(2l).intValue());
        assertEquals(3, primes.get(5l).intValue());
    };

    @Test
    public void testWhen600851475143Return11() {
        Map<Long, Integer> primes = primeFactorService.getPrimes(600851475143l);
        assertEquals(4, primes.size());
        assertEquals(1, primes.get(71l).intValue());
        assertEquals(1, primes.get(839l).intValue());
        assertEquals(1, primes.get(1471l).intValue());
        assertEquals(1, primes.get(6857l).intValue());
    };
}