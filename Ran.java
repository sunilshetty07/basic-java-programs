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
import java.util.Random;
public class Ran {
        public static void main(String[]args)
    {
        int n;
        Scanner in=new Scanner(System.in);
        Random rand = new Random();
        System.out.println("enter the number");
        n= in.nextInt();
        for(int i=0;i<n;i++){
            int a=rand.nextInt(n);
            System.out.println("Random integer is:"+a);
        }
    }
    
}
