/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAA;

/**
 *
 * @author sunilshetty07
 */
import java.util.*;
public class Calculator {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        float a,b,res;
        int val;
        System.out.println("enter the value of a");
        a=in.nextFloat();
        System.out.println("enter the value of b");
        b=in.nextFloat();
        System.out.println("1-->add\n2-->subtract\n3-->multiplication\n4-->division\n5-->exponent");
        System.out.println("Enter your choice:");
        val=in.nextInt();
        while (val==0 || val>5)
        {
          System.out.println("Please enter number between 1 and 5");
          val=in.nextInt();
        }
        switch(val)
        {
            case 1:res=a+b;
            System.out.println("addition of "+a+" and "+b+" is: "+res);
            break;
            case 2:res=a-b;
            System.out.println("Subtraction of "+a+" and "+b+" is: "+res);
            break;
            case 3:res=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is: "+res);
            break;
            case 4:
            try
                {
                    res=a/b;
                    System.out.println("result of division is:"+res);
                }
            catch(ArithmeticException e)
                {
                     System.out.println("Exceptin:"+e);
            
                }
            break;
            case 5:
                res=(int)Math.pow(a, b);
                System.out.println(res);
                break;
        }
        
    }
    
}
