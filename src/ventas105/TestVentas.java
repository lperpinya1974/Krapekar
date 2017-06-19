/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas105;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lluis Maria
 */
public class TestVentas {
    
   static ArrayList <Paga> ventasSemana;
   static Scanner teclado;
   static String[] dia = {"MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"};
    
    public static void main (String[] args)
    {
        
        while (leerEntrada())
        {
            procesarCaso();
        }
    }

    private static double CalculaMediaSemanal() {
        
         double suma = 0;
      for (int contador=0; contador<6; contador++)
      {
          suma += ventasSemana.get(contador).getValor();
      }
      
      return suma/6;
        
    }

    private static Paga[] CalculaMaxMinSemanal() {
         Paga maximo = ventasSemana.get(0);
        Paga minimo = ventasSemana.get(0);
        int numMaximo = 0, numMinimo = 0;
         
          for (int contador=1; contador<6; contador++)
      {
           if (maximo.getValor()== ventasSemana.get(contador).getValor()) numMaximo++;
         if (maximo.getValor() < ventasSemana.get(contador).getValor())
         {
          maximo = ventasSemana.get(contador);}
         
        
          if (minimo.getValor()== ventasSemana.get(contador).getValor()) numMinimo++;
         if (minimo.getValor() > ventasSemana.get(contador).getValor())
         { minimo = ventasSemana.get(contador);}
      }
        Paga maxmin[] = {maximo, minimo};
        if (numMaximo>0) maxmin[0].setDia("EMPATE");
        if (numMinimo>0) maxmin[1].setDia("EMPATE");
        return maxmin; 
    }
    private static class Paga {
        String dia;
        double valor;
        
         public Paga(String dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }
             public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    }
    
    
     public static boolean leerEntrada()
    {
        double valor;
        teclado = new Scanner(System.in);
        ventasSemana = new ArrayList();
        
        for (int contador = 0; contador <6; contador++)
        {
            valor = teclado.nextDouble();
            if (valor == -1) return false;
            
            Paga entrada = new Paga (dia[contador], valor);
            ventasSemana.add(entrada);
            
            
        }
        return true;
         
    }
     
       private static void procesarCaso() {
        
       double media = CalculaMediaSemanal();
       Paga[] maxmin =CalculaMaxMinSemanal();
       String domingo = (media > ventasSemana.get(5).getValor() ? "NO": "SI" );
       
       System.out.println (maxmin[0].getDia()+ " "+maxmin[1].getDia()+ " "+ domingo);
    }
}
