/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

/**
 *
 * @author Sunil Shetty
 */
//wrapper class provide a way to use primitive data types as objects
import java.util.*;
public class JavaWrapperClass {
    public static void main(String[]args){
        //creating wrapper objects
        Integer myInt=5;
        Double myDouble=5.99;
        Character myChar = 'a';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        
        /*here we are using wrapper object so we have different methods 
        to get the value associated with the corresponding wrapper object
        */
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        
        //toString() used to convert wrapper object to string
        Integer myint=150;
        String mystring = myint.toString();
        System.out.println(mystring.length());
        System.out.println(mystring);
    }
    
}
