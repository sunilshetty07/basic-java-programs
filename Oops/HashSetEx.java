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
//it is collection of item where every item is unique
//if you enter same value twice than it is considered as one
import java.util.*;
public class HashSetEx {
    public static void main(String[]args)
    {
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Tata");
        cars.add("Maruti");
        cars.add("Benz");
        cars.add("Tesla");
        cars.add("BMW");//repeated value
        System.out.println(cars);
        
        System.out.println("Checking if an item exists using contains method");
        System.out.println(cars.contains("Honda"));
        
        System.out.println("Removing item using remove method");
        cars.remove("Tesla");
        System.out.println("After removing: " +cars);
        System.out.println("to remove all the item");
        System.out.println("finding size:");
        System.out.println(cars.size());
        System.out.println("Looping");
        for(String i:cars)
        {
            System.out.println(i);
        }
        cars.clear();
        System.out.println("after removing all the item: "+cars);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        HashSet<Integer> num= new HashSet<Integer>();
        num.add(10);
        num.add(7);
        num.add(9);
        num.add(3);
        num.add(5);
        System.out.println(num);
        for(int i=1;i<=10;i++)
        {
            if(num.contains(i))
            {
                System.out.println(i+" was found in the set.");
            }
            else
            {
                System.out.println(i+" was not found in the set");
            }
        }
    }
    
}
