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
    
    public static int testNumber;
    public static int error;
    public static Scanner keyboard;
    public static boolean aristotenes[];
    /* els nombres primers seran els que tinguin false, llevat del 0 i del 1 */
    
    
    public static void main (String[] args)
    {
        keyboard = new Scanner(System.in);
        while (readData())
        {
           System.out.println (testCase());
        }
    }

    public static boolean readData() {
        
        testNumber = keyboard.nextInt();
        error = keyboard.nextInt();
        
        if (testNumber == 0 && error ==0) return false;
        else
            return true;
    }

    public static String testCase() {
        
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
    
    public static int calculateNumberOfPrimes()
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
    public static boolean isPrime(int number)
    {
        for (int cont=2; cont<=Math.sqrt(number); cont++)
        {
            if (number%cont == 0) return false;
            
        }
        return true;
    }
    
    public static double calculateGaussAprox()
    {
        return 1/Math.log(testNumber);
    }
    public static void filterAristotenes ()
    {
        double max = Math.sqrt(testNumber);
        for (int cont=2; cont<=max; cont++)
            if (!aristotenes[cont])
            {
                for (int test=cont*2; test <=testNumber; test+=cont)
                {
                    aristotenes[test]=true;
                }
            }
        
            
        }
    }
    
    