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
    private static String[] countries = {"EEUU", "Bulgaria", "Inglaterra", "Irlanda", "Portugal", "Noruega", "Venezuela", "Cuba", "India"};
    private static String[] countryCodes = {"0", "380", "50", "539", "560", "70", "759", "850", "890"};
    
    
    
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
        
           
        String exit="";
        String country;
        
                        
            if (validarEan())
               exit = "SI";
            else
               exit = "NO";
        if ((entrada.length()>8) && exit.equals("SI"))
                                
        {  exit += " " + getCountry();}
            System.out.println (exit);
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
    private static String getCountry ()
    {
        for (int contador = 0; contador<countryCodes.length; contador++)
        {
        {
            if (countryCodes[contador].equals(entrada.substring (0,countryCodes[contador].length())))
                return  countries[contador];
        }
        }
        return "Desconocido";
       
       
    }

}