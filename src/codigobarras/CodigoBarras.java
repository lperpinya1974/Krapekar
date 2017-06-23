/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigobarras;

import java.util.Scanner;

/**
 *
 * @author lluis
 */
public class CodigoBarras {
    
     
    private static String entrada;
    private static Scanner teclado;
    
    
    public static void main (String[] args)
    {
        teclado = new Scanner (System.in);
        
        while (leerDatos())
        {
            procesarCaso();
        }
    }

    private static boolean leerDatos() {
        
        entrada = teclado.nextLine();
        
        if (entrada.equals("0")) return false;
        
        else
            
            return true;
                   
        
    }

    private static void procesarCaso() {
        
        if (entrada.length()<=8)  
            if (validarEan())
                System.out.println ("SI");
            else
                System.out.println ("NO");
        
    }

    private static boolean validarEan() {
        
        int digitControl = 0, numberControl = 0; int contadorInverso = 0;
        
        digitControl =  entrada.charAt(entrada.length()-1) - 48;
     for (int cont=entrada.length()-2; cont>=0; cont--)
     {
         contadorInverso++;
         numberControl += (contadorInverso%2==0)? entrada.charAt(cont)-48: (entrada.charAt(cont)-48)*3;
     }
     
     numberControl = 10 - (numberControl%10);
     
     if (numberControl == 10 ) numberControl = 0;
     
     return (digitControl == numberControl);
    }
    
}
