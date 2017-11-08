package ca.caledi.primefactorsservice.controller;

import ca.caledi.primefactorsservice.service.PrimeFactorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PrimeFactorsServiceController {

    @Autowired
    private PrimeFactorsService primeFactorsService;

    @RequestMapping("/getPrimeFactors")
    public Map<Long, Integer> getPrimeFactors(@RequestParam("number") Long number) {
        return primeFactorsService.getPrimes(number);
    }
}
