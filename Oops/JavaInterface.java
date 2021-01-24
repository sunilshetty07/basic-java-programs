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
/*Interface: is a completely abstract class that is used to group related methods with empty bodies.
->interface method does not have body
->here we are using implements instead of extends
*/
//interface
interface Animal1{
  public void animalsound();
public void sleep();  
}

class pig1 implements Animal1{
    public void animalsound()
    {
        System.out.println("the pig say: wee wee...");
    }
    public void sleep()
    {
        System.out.println("Zzz....");
    }
} 
public class JavaInterface {
    public static void main(String[]args)
    {
        pig1 mypig = new pig1();
        mypig.animalsound();
        mypig.sleep();
    }
    
}
