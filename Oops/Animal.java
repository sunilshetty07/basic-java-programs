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
//program for polymorphism
//ability of an object to take on many forms
public class Animal {
    public void animalsound()
    {
        System.out.println("This how animal sounds");
    }
}
class pig extends Animal
    {
        public void animalsound()
            {
                System.out.println("wee eee");
            } 
    }
class dog extends Animal
{
     public void animalsound()
    {
        System.out.println("bow bow");
    }
}
class mymainclass
{
    public static void main(String[]args)
    {
        Animal myAnimal=new Animal();
        Animal myPig = new pig();
        Animal myDog = new dog();
        
        myAnimal.animalsound();
        myPig.animalsound();
        myDog.animalsound();
    }
}
