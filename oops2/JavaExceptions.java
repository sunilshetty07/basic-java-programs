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
public class JavaExceptions {
    public static void main(String[]args){
        //int[] mynum={1,2,3};
        //System.out.println(mynum[5]);//raise array index out of range error
        
        //using try catch
        try
        {
            int[] num={1,2,3};
            System.out.println(num[5]);
        }
        catch(Exception e){
            System.out.println("Some thing went wrong");
        }
        finally{//optinal it lets you execute code after try catch regardless of the result
            System.out.println("try catch is executed");
        }
        System.out.println("WELCOME");
        
        //throw keyword is used to create a custom error
        //program to throw an exception if age is below 18(print access denied) else print access granted
        checkAge(17);
    }
    static void checkAge(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Access Denied! - you must be atleast 18 years old");
        }
        else
            System.out.println("Access granted");
        
    }
    
}
