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
interface FirstInterface{
    public void myFirstMethod();
}

interface SecondInterface
{
public void mySecondMethod();
}

class demo1 implements FirstInterface
{
    public void myFirstMethod()
    {
        System.out.println("First method.....");
    }
}

class demo implements FirstInterface,SecondInterface{
    public void myFirstMethod()
    {
        System.out.println("First method executed");
    }
    public void mySecondMethod()
    {
        System.out.println("Second method executed");
    }
}

public class JavaMultipleInterface {
    public static void main(String[]args)
    {
        demo d = new demo();
        demo1 d1 = new demo1();
        d.myFirstMethod();
        d.mySecondMethod();
        d1.myFirstMethod();
    }
    
}
