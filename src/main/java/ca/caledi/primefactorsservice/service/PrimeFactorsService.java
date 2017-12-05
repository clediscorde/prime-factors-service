package ca.caledi.primefactorsservice.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PrimeFactorsService {

    public Map<Long, Integer> getPrimes(Long number) {
        Map<Long, Integer> primes = new HashMap<Long, Integer>();

        for(long lastPrime = 2; lastPrime <= number; lastPrime++) {
            while(number % lastPrime == 0)  {
                if(!primes.containsKey(lastPrime)) {
                    primes.put(lastPrime, 1);
                } else {
                    primes.put(lastPrime, primes.get(lastPrime) + 1);
                }
                number = number / lastPrime;
            }
        }

        return primes;
    }
}
