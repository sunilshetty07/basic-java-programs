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
import java.util.Scanner;
public class Fact {
    public static void main(String[]args)
    {
        int n,sum=1;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        if(n==0||n==1)
        {
            System.out.println("facorial of "+n+"is:"+1);
        }
        else
        {
        for(int i=n;i>=1;i--)
        {
            sum*=i;
        }
        System.out.println("facorial of"+n+"is:"+sum);
        }
    }
    
}
