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
public class gauss {
    
    private static int testNumber;
    private static int error;
    private static Scanner keyboard;
    
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
        
        numberOfPrimes = calculateNumberOfPrimes();
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
    
    
}
