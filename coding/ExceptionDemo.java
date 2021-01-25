/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAA;

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[]args)
    {
        int a,b,res;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the numners a and b");
        a=in.nextInt();
        b=in.nextInt();
        try
        {
            res=a/b;
            System.out.println("result of division is:"+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exceptin:"+e);
            
        }
    }
    
}
