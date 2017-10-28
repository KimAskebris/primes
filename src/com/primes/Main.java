package com.primes;

import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * This program finds all primes withun a given value
 */

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        out.println("Ange ett valfritt tal och så ger jag dig alla primtal");
        out.println("Skriv in tal: ");
        int number = scan.nextInt();
        List<Integer> primes = PrimeCalculator.findAllPrimesForGivenNumber(number);
        System.out.println(primes);
        System.out.print("ANTAL PRIMTAL: " + primes.size());
    }
}
