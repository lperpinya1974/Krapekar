/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krapeckar;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lluis Maria
 */
public class Krapeckar {
    static Scanner teclado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int numeroCasos;
            
        numeroCasos = teclado.nextInt();
        while (numeroCasos>0)
        {
            casoPrueba();
            numeroCasos--;
        }       
        
    }

    public static Integer[] convertirArray(int numero) {
        String temp = Integer.toString(numero);
        
        
        
        Integer[] newNumero = new Integer[4];
        for (int i = 0; i < 4; i++)
        {
           try
               { newNumero[i] = temp.charAt(i) - '0';}
               catch (Exception ex)
                       {
                       newNumero[i]=0;
                       }
               
        }

        return newNumero;
    }
        
        public static void casoPrueba()
        {
            int numeroInicial, numeroAsc, numeroDesc, cont=0;
        Integer[] arrayNumero;
        final int KRAPEKAR = 6174; 
         
        numeroInicial = teclado.nextInt();
      
       
                
        while (numeroInicial != KRAPEKAR && numeroInicial!=0)
        {
        arrayNumero = convertirArray(numeroInicial);
        Arrays.sort(arrayNumero);
        numeroAsc = convertirDigit(arrayNumero); 
        Arrays.sort(arrayNumero, Collections.reverseOrder());
        numeroDesc = convertirDigit(arrayNumero);
        numeroInicial = numeroAsc-numeroDesc;
        cont++;
       // System.out.println (numeroDesc + " - " + numeroAsc + " = " + numeroInicial);
               
               
        // TODO code application logic here
    }if (numeroInicial == 0) cont = 8;
        System.out.println (cont);
        
        
        
    }

    private static int convertirDigit(Integer[] arrayNumero) {
        int result = 0;
       for (int k = 0; k<=3; k++)
       {
           result += arrayNumero[k]*Math.pow(10, k);
       }
       return result;
    }

}
