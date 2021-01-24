/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author sunilshetty
 */
/*enum: special class that represent a group of constants(unchangeable variables)

*/

public class JavaEnum {
    enum Level{
        Low,Medium,High
    }
    public static void main(String[]args)
    {
        Level mylev = Level.High;
        System.out.println(mylev);
    }
    
}
