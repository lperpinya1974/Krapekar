/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.Scanner;

/**
 *
 * @author Lluis Maria
 */
public class Test {
    
    static Scanner teclado;
    static String[] dia = {"MARTES", "MIÉRCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO"};
    
    public static void main (String[] args)
    {
        
        Ventas ventas = new Ventas();
        while (leerEntrada(ventas))
        {
            procesarCaso(ventas);
        }
        
        
    }
    
    public static boolean leerEntrada(Ventas ventas)
    {
        double valor;
        teclado = new Scanner(System.in);
        
        for (int contador = 0; contador <6; contador++)
        {
            valor = teclado.nextDouble();
            if (valor == -1) return false;
            
            Paga entrada = new Paga (dia[contador], valor);
            ventas.getVentasSemana().add(entrada);
            
            
        }
        return true;
         
    }

    private static void procesarCaso(Ventas ventas) {
        
       double media = ventas.CalculaMediaSemanal();
       Paga[] maxmin = ventas.CalculaMaxMinSemanal();
       String domingo = (media > ventas.getVentasSemana().get(5).getValor() ? "NO": "SI" );
       
       System.out.println (maxmin[0].getDia()+ " "+maxmin[1].getDia()+ " "+ domingo);
    }
    
}
