/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author Sunil Shetty
 */

import java.util.Scanner;
public class JavaUserInput {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter user name:");
        String name=in.nextLine();//for string
        System.out.println("Enter your age:");
        int age = in.nextInt();
        System.out.println("enter your salary");
        double salary= in.nextDouble();
        System.out.println("------------------------");
        System.out.println("your entered details are: ");
        System.out.println("-------------------------");
        System.out.println("entered name: "+name);
        System.out.println("entered age: "+age);
        System.out.println("entered salary: "+salary);
    }
    
}
