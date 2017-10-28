package com.primes;

import java.util.ArrayList;
import java.util.List;

/**
 Two static methods that finds primes.
 */
public class PrimeCalculator {



    public static List findAllPrimesForGivenNumber(int number){

        //List containing all primes
        List<Integer> primes = new ArrayList<>();

        for(int i = 1; i <= number; i++){
            if(isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }


    private static boolean isPrime(int number){
        if(number < 2) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        for(int i = 3; i * i <= number; i++)
            if(number % i == 0) return false;
        return true;
    }
}
