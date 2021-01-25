/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops2;

/**
 *
 * @author Sunil shetty
 */
//2nd method
public class JavaThread2 implements Runnable{
    public static void main(String[]args)
    {
        JavaThread2 obj = new JavaThread2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is running outside of the thread");
    }
    public void run()
    {
        System.out.println("This code running inside of the thread");
    }
    
}
