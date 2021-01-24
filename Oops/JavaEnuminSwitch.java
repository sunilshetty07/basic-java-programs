/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author Sunil shetty
 */

enum Level{
    Low,High,Medium
}
public class JavaEnuminSwitch {
    public static void main(String[]args)
    {
        Level lev = Level.Medium;
        switch(lev)
        {
            case Low:
                System.out.println("Low level");
                break;
            case Medium:
                System.out.println("Medium level");
                break;
            case High:
                System.out.println("High level");
                break;
        }
        
        //loop through enum
        System.out.println("----------------------------------------------------");
        System.out.println("For Loop");
        System.out.println("----------------------------------------------------");
        for(Level myvar:Level.values())
        {
            System.out.println(myvar);
        }
    }
}
