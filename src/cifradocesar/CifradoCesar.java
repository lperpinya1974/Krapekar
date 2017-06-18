/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradocesar;

import java.util.Arrays;
import java.util.List;
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
        int[] numVocals = {0};
        
        
        Scanner scanner = new Scanner(System.in);
        int firstDigit = 0, offset = 0;
        
        while (cifrado)
        {
           numVocals[0]=0;  
           line = scanner.nextLine();
           firstDigit= line.codePointAt(0);
           offset = 112 - firstDigit;
           lineDecode = decode (line, offset, numVocals);
        //   System.out.println(lineDecode);
           System.out.println(numVocals[0]);
           if (lineDecode.equals("FIN"))  cifrado = false;
           
        }
        
    }
               
        public static String decode (String line, int offset, int[] numVocals)
        {
            List <Character> vocales = Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
            List <Character> completo = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
            , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
            
            String result="";
            char character, caseCharacter;
            for (int contador = 1; contador<line.length(); contador++)
            {
                character = line.charAt(contador);
                caseCharacter = (char) (character +32);
                if (completo.contains(character)|| completo.contains(caseCharacter)) {
                  
                    if ((offset>0) && ((character+offset>122) || (character+offset>90 && character<=90))) character = (char) (character + offset -26);
                    else
                        if ((offset<0) && ((character+offset<65) || (character+offset<97 && character>=97)))  character = (char) (character + offset -26);
                    
                        else
                                 character += offset;
                               
                
                
                
                
                }
                
                result +=character;
                if (vocales.contains(character)) numVocals[0]++; 
                }
            
            
            return result;
        }
        
       
    }
    

