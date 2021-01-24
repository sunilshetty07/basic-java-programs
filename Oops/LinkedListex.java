/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

/**
 *
 * @author sunil shetty
 */
//almost identical to ArrayList
import java.util.*;
public class LinkedListex {
    public static void main(String[]args)
    {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Tesla");
        cars.add("Honda");
        cars.add("TATA");
        cars.add("BMW");
        System.out.println(cars);
        
        //it has same method as of ArrayList
        //additional methods
        cars.addFirst("Maruti");
        cars.addLast("Hyundai");
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        
        cars.removeFirst();
        System.out.println(cars);
        
        cars.removeLast();
        System.out.println(cars);
        
    }
}
