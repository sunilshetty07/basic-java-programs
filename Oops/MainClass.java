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
//nested class 
class OuterClass{
    int x=10;
    class InnerClass{
        int y=5;
        
    }
    static class InnerClass1
    {
        int z=20;
    }
}
public class MainClass {
    public static void main(String[]args)
    {
        OuterClass oc=new OuterClass(); //creating object :normal way
        OuterClass.InnerClass ic=oc.new InnerClass(); //first write outer class with dot and write innerclass
        //in new write outerclass object dot new(oc.new)
        System.out.println(ic.y+oc.x);
        
        //for static class
        OuterClass.InnerClass1 ic1=new OuterClass.InnerClass1(); //for static class declare like this
        //OuterClass.InnerClass1 ic1 = oc.new InnerClass1();  :error : qualified new of static class
        System.out.println(ic.y+oc.x+ic1.z);
        
    }
}
