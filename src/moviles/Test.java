/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviles;

import java.util.Scanner;

/**
 *
 * @author Lluis Maria
 */
public class Test {
    
  public static Arbre arbre;
    
    public static void main (String[] args)
    {
        Scanner scanner;
        String line;
        
          arbre = new Arbre();
      
        scanner = new Scanner(System.in);
        line = scanner.nextLine();
        while (!(line.equals("0 0 0 0")))
        {
            
            procesarEntrada(line);
            line = scanner.nextLine();
        }
    }

    private static void procesarEntrada(String line) {
       
        String[] lineArray;
        lineArray = line.split(" ");
         
        
           
           Movil test = new Movil(null, null);
           Nodo esquerre = new Nodo (Integer.valueOf(lineArray[0]), Integer.valueOf(lineArray[1]), test);
           Nodo dret = new Nodo (Integer.valueOf(lineArray[2]), Integer.valueOf(lineArray[3]), test);
           test.setDret(dret);
           test.setEsquerre(esquerre);
           arbre.addMovil(test, arbre.getOrigen());
           System.out.println("afegit");
        
    }
    
    
}
