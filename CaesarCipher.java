/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAA;

import java.util.Scanner;

/**
 *
 * @author sunilshetty07
 */

class CaesarCipher 
{ 

    // Encrypts text using a shift od s 

    public static StringBuffer encrypt(String text, int s) 

    { 

        StringBuffer result= new StringBuffer(); 

  

        for (int i=0; i<text.length(); i++) 

        { 

            if (Character.isUpperCase(text.charAt(i))) 

            { 

                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65); 

                result.append(ch); 

            } 

            else

            { 

                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97); 

                result.append(ch); 

            } 

        } 

        return result; 

    } 

  

    // Driver code 

    public static void main(String[] args) 

    { 
        Scanner in=new Scanner(System.in);
        String text;
         System.out.println("enter a string");
         
         text=in.nextLine();
         System.out.println("enter the no.of shift");
         int s=in.nextInt();
        System.out.println("Text  : " + text); 

        System.out.println("Shift : " + s); 

        System.out.println("Cipher: " + encrypt(text, s)); 

    } 
} 
