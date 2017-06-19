/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.ArrayList;

/**
 *
 * @author Lluis Maria
 */
public class Ventas {
    
  private  ArrayList <Paga> ventasSemana;
  
  
  public double CalculaMediaSemanal()
  {
      double suma = 0;
      for (int contador=0; contador<6; contador++)
      {
          suma += ventasSemana.get(contador).getValor();
      }
      
      return suma/6;
  }

    public ArrayList<Paga> getVentasSemana() {
        return ventasSemana;
    }

    public void setVentasSemana(ArrayList<Paga> ventasSemana) {
        this.ventasSemana = ventasSemana;
    }
    
    public Paga[] CalculaMaxMinSemanal()
    {
        
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

    public Ventas() {
        ventasSemana = new ArrayList<Paga>();
    }
    
    
}

