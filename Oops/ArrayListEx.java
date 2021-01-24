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
import java.util.*;
public class ArrayListEx {
    public static void main(String[]args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW"); //adding item
        cars.add("BENZ");
        cars.add("VOLVO");
        System.out.println(cars);
        //accessing an item
        System.out.println(cars.get(0));
        
        //change an item
        cars.set(0,"TESLA");
        System.out.println(cars);
        
        //remove an item
        cars.remove(2);
        System.out.println(cars);
        
        //finding arraylist size
        System.out.println(cars.size());
        
        //Loop through an arraylist
        for(int i=0;i<cars.size();i++)
        {
            System.out.println(cars.get(i));
        }
        
        //for-each loop
        for(String i:cars)
        {
            System.out.println(i);
        }
        
        //sorting
        cars.add("HONDA");
        cars.add("TATA");
        cars.add("Land rover");
        System.out.println("before sort");
        System.out.println(cars);
        
        Collections.sort(cars);
        for(int i=0;i<cars.size();i++)
        {
            System.out.println(cars.get(i));
        }
        
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(10);
        Numbers.add(20);
        Numbers.add(50);
        Numbers.add(30);
        Numbers.add(5);
        Numbers.add(25);
        System.out.println("Before sort");
        for(int i:Numbers)
        {
            System.out.println(i);
        }
        Collections.sort(Numbers);
        System.out.println("After sort");
        for(int i=0;i<Numbers.size();i++)
        {
            System.out.println(Numbers.get(i));
        }
        
    }
    
}
