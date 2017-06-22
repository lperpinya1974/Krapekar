/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author lluis
 */
public class Herencia {
    
    private static double polinomio[];
    private static int grado;
    private static double numeroRectangulos;
    private static Scanner teclado;
    
    public static void main (String[] args)
    {
       while (entradaDatos())
       {
           System.out.println ("Grado: " + grado);
           System.out.println ("Número Rectángulos: " + numeroRectangulos);
          
     for (int cont=grado; cont >=0; cont--)
     {
         System.out.println (polinomio[cont]+" ");
     }
     procesarCaso();
       }   
       
       
    }

    private static boolean entradaDatos() {
     teclado = new Scanner(System.in);
     grado = teclado.nextInt();
     if (grado>=20) return false;
     
     polinomio = new double[grado+1];
     for (int cont=grado; cont >=0; cont--)
     {
         polinomio[cont] = teclado.nextDouble();
     }
     
     numeroRectangulos = teclado.nextDouble();
     return true;
     
    }

    private static void procesarCaso() {
        
        double base = 1/numeroRectangulos;
        double function, areaCain=0, areaAbel=0;
        String[] mensajes = {"CAIN", "ABEL", "JUSTO"};
        int mensaje = 2;
        
        
        for (double cont=0; cont<numeroRectangulos; cont++)
        {
            
          function =  evaluarPolinomio (cont*base);
        if (function < 0) function = 0;
        if (function>1) function = 1;
        
        areaCain += base * function;
        
        }
        
        areaAbel = 1 - areaCain;
        
        if (areaCain>areaAbel+0.001)  mensaje = 0;
                else if (areaAbel>areaCain+0.001) mensaje = 1;
                 
        
       System.out.println (mensajes[mensaje]);
       System.out.println ("Area CAin" + areaCain + "Area Abel" +areaAbel);
    }

    private static double evaluarPolinomio(double base) {
    
        double resultado = 0;
        
        for (int contador = 0; contador<=grado; contador++)
        {
            resultado += polinomio[contador]*Math.pow(base, contador);
        }
        return resultado;
        
    }
    
    
}
