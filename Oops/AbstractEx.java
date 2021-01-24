/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author Sunilshetty
 */
/*abstraction: process of hiding certain details and showing only essential information to the user
1.Abstract class: restricted class cannot used to create objects
2.Abstract method: can only be used in abstract class and it does not have body. The body is provided by sub class
*/
abstract class AbstractEx {
    public abstract void animalsound();
    public void sleep()
    {
        System.out.println("Zzzz......");
    }
}
class Cat extends AbstractEx{
    public void animalsound()
    {
        System.out.println("The Cat says meow meow...");
    }
}
class MainClass1{
    public static void main(String[]args)
    {
        Cat myCat=new Cat();
        myCat.animalsound();
        myCat.sleep();
    }
}
