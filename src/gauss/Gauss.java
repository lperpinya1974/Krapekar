/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauss;

import java.util.Scanner;

/**
 *
 * @author Lluis_2
 */
public class Gauss {
    
    private static int testNumber;
    private static int error;
    private static Scanner keyboard;
    private static boolean aristotenes[];
    /* els nombres primers seran els que tinguin false, llevat del 0 i del 1 */
    
    
    public static void main (String[] args)
    {
        keyboard = new Scanner(System.in);
        while (readData())
        {
           System.out.println (testCase());
        }
    }

    private static boolean readData() {
        
        testNumber = keyboard.nextInt();
        error = keyboard.nextInt();
        
        if (testNumber == 0 && error ==0) return false;
        else
            return true;
    }

    private static String testCase() {
        
        int numberOfPrimes = 0;
        double calculatedError, estimatedError;
        String message;
        aristotenes = new boolean[testNumber+1];
        filterAristotenes();
        // numberOfPrimes = calculateNumberOfPrimes(); sense Aristotenes
       numberOfPrimes = calculateNumberOfPrimes2();
        calculatedError = calculateGaussAprox();
        estimatedError = Math.abs((double) (calculateNumberOfPrimes()*1.0/testNumber) - calculateGaussAprox());
       
       
                
        message = (estimatedError>1./Math.pow(10, error))?  "Mayor" : "Menor";
        return message;
        
    }
    
    private static int calculateNumberOfPrimes()
    {
        int numberOfPrimes = 0;
        for (int number=2; number<testNumber;number++)
        {
            if (isPrime(number)) numberOfPrimes++;
        }
        return numberOfPrimes;
    }
     private static int calculateNumberOfPrimes2()
    {
        int numberOfPrimes = 0;
        for (int number=2; number<testNumber;number++)
        {
           if (aristotenes[number]) numberOfPrimes++;
        }
        return numberOfPrimes;
    }
    private static boolean isPrime(int number)
    {
        for (int cont=2; cont<=Math.sqrt(number); cont++)
        {
            if (number%cont == 0) return false;
            
        }
        return true;
    }
    
    private static double calculateGaussAprox()
    {
        return 1/Math.log(testNumber);
    }
    private static void filterAristotenes ()
    {
        for (int cont=2; cont<=Math.sqrt(testNumber); cont++)
            if (!aristotenes[cont])
            {
                for (int test=cont*2; test <=testNumber; test+=cont)
                {
                    aristotenes[test]=true;
                }
            }
        
            
        }
    }
    
    

