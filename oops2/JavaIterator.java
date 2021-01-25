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
/*iterator is an object that can be used to loop through collections, like ArrayList, HashSet etc.

*/
import java.util.*;
public class JavaIterator {
    public static void main(String[]args){
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Tata");
    cars.add("Maruti");
    cars.add("Volvo");
    cars.add("Honda");
    cars.add("Mazda");
    
    //iterator
    Iterator<String> it = cars.iterator();
    
    System.out.println("print the first item using next");
    System.out.println(it.next());
    
    System.out.println("looping through collection using iterator");
    while(it.hasNext())
    {
       System.out.println(it.next()); 
    }
    System.out.println("+++++++++++++++++++++++++++++++++++++++");
    
    LinkedList<Integer> num = new LinkedList<Integer>();
    num.add(20);
    num.add(10);
    num.add(5);
    num.add(25);
    num.add(15);
    num.add(7);
    System.out.println(num);
    Iterator<Integer> it1 = num.iterator();
    while(it1.hasNext())
    {
        int i = it1.next();
        if(i<10)
        {
            it1.remove();
        }
    }
    System.out.println(num);
    }
}
