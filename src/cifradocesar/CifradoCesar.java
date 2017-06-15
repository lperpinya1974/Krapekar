/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocesar;

import java.util.Scanner;

/**
 *
 * @author Lluis_2
 */
public class CifradoCesar {
   
     
    public static void main (String[] args)
    {
        boolean cifrado = true;
        String line;
        String lineDecode;
       
        
        
        Scanner scanner = new Scanner(System.in);
        int firstDigit = 0, offset = 0;
        
        while (cifrado)
        {
            cifrado = false;
           line = scanner.nextLine();
           firstDigit= line.codePointAt(0);
           offset = 112 - firstDigit;
           lineDecode = decode (line, offset);
           System.out.println(lineDecode);
           if (lineDecode.equals("FIN"))  cifrado = true;
           
        }
        
    }
               
        public static String decode (String line, int offset)
        {
            String result="";
            char character;
            for (int contador = 1; contador<line.length(); contador++)
            {
                character = line.charAt(contador);
                character += offset;
                result +=character;
            }
            return result;
        }
        
    }
    

