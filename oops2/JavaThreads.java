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
/*
Threads allows a program to operate more efficiently by doing multiple things at the same time
perform complicated task in background without interrupting the main program
*/
//two ways  to create a thread

// first method using extends
public class JavaThreads extends Thread {
    public static void main(String[]args)
    {
        JavaThreads thread = new JavaThreads();
        thread.start();
        System.out.println("this code is outside of the thread");
    }
    public void run()
        {
            System.out.println("This code running in a thread");
        }
    
}
