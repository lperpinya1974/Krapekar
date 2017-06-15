/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esoterico;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lluis Maria
 */
public class Esoterico {
    
    private int lados = 0;
   
    private static Scanner scanner;
    private int[][] cuadrado;
    private int CM, CM2;
    private String resultado;
    private String[]lineaArray;
    private Integer[] intArray;
    
    
    
    
    
    public static void main (String[] args)
    {
        int lados;
        scanner = new Scanner(System.in);
        do
        {
            
        lados = scanner.nextInt();
        scanner.nextLine();
        if (lados != 0) casoPrueba(lados);
        }        
        while(lados!=0);
        
         
        
      
    }
    
    public static void casoPrueba(int lados)
    {
        String linea;
        scanner = new Scanner(System.in);
        Esoterico esoterico = new Esoterico();
        esoterico.lados = lados;
        linea = scanner.nextLine();
                
        esoterico.crearCuadrado(linea);
        esoterico.calcularCM();
        if (esoterico.isDiabolico()) { 
                  
                 if (esoterico.isEsoterico())  esoterico.resultado = "ESOTERICO"; 
                 else esoterico.resultado = "DIABOLICO";}
        else
            esoterico.resultado = "NO"; 
                    
        
        System.out.println (esoterico.resultado);
    }
    
    public  void crearCuadrado(String linea)
    {
         int contador = 0;
        cuadrado = new int[lados][lados];
         
        lineaArray = linea.split(" ");
        intArray = new Integer[lineaArray.length];
         
      
       
        
        for (int fila = 0; fila<lados; fila++)
            for (int columna = 0; columna <lados; columna++)
            {
               
                cuadrado[fila][columna] = Integer.valueOf(lineaArray[contador]);
                intArray[contador] = cuadrado[fila][columna];
                contador++;
                
            }
        
        
    }
    public  boolean isDiabolico ()
    {
        int suma = 0;
      /* suma files */
      
      for (int fila=0; fila<lados; fila++)
      {
      for (int columna=0; columna<lados; columna++)
      {
          suma += cuadrado[fila][columna];
      }
      /* S'ha sumat cada fila */
       if (suma != CM) return false; 
       else
           suma=0;
             
      }
      
      /* suma columnes */
      
       for (int columna=0; columna<lados; columna++)
      {
      for (int fila=0; fila<lados; fila++)
      {
          suma += cuadrado[fila][columna];
      }
      /* S'ha sumat cada fila */
       if (suma != CM) return false; 
       else
           suma=0;
             
      }
       
       return true;
            
    }

    private void calcularCM() {
         for (int fila = 0; fila<lados; fila++)
       {
           CM += cuadrado[fila][0];
       }
       CM2 = 4*CM/lados;
    }
    public boolean isEsoterico()
    {
        //TODO proglema: programa que mire que todos los números de una matriz son distintos!
      return (isCompleto() && comparaEsquinas() &&comparaCentro());
         
        
    }
    
    public boolean isCompleto()
    {
          Arrays.sort(intArray);
        for (int cont =0; cont<intArray.length-1; cont++)
        {
            if (intArray[cont]==intArray[cont+1]) return false;
        }
        if (intArray[0]==1 && intArray[intArray.length-1]==lados*lados) {
        } else {
            return false;
        }
                
        
        
        return true;
        
    }
    public int sumaEsquinas()
    {
        return cuadrado[0][0] + cuadrado[lados-1][lados-1] + cuadrado[lados-1][0] + cuadrado[0][lados-1];
    }
    
    public boolean comparaEsquinas()
    {
        return (sumaEsquinas()==CM2);
    }
    public boolean comparaCentro()
    {
        if (lados%2==0) 
            return (sumaCentroLateralPar()==2*CM2 && sumaCasillasCentralesPar()==CM2);
        else
            return( 4*cuadrado[lados/2][lados/2]==CM2 && sumaCentroLateralImpar() == CM2);
   

    }
    
    public int sumaCentroLateralPar()
    {
        
            
            return cuadrado[0][lados/2] + cuadrado[0][lados/2-1] +
            cuadrado[lados/2-1][0] + cuadrado[lados/2][0]+
            cuadrado[lados-1][lados/2-1]+cuadrado[lados-1][lados/2]+
            cuadrado[lados/2-1][lados-1] + cuadrado[lados/2][lados-1];
    }
    public int sumaCasillasCentralesPar()
    {
            
            return cuadrado[lados/2-1][lados/2-1] + cuadrado[lados/2-1][lados/2]+
                   cuadrado[lados/2][lados/2-1] + cuadrado[lados/2][lados/2];
    }
    
    public int sumaCentroLateralImpar()
    {
        return cuadrado[0][lados/2] + cuadrado[lados/2][0] + cuadrado[lados/2][lados-1] + cuadrado[lados-1][lados/2];
    }
}
