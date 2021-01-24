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
//hashmap stores item in key-value pairs key=index, value=object
import java.util.*;
public class HashMapEx {
    public static void main(String[]args)
    {
        HashMap<String,String> city= new HashMap<String,String>();
        //add item using put
        city.put("England","London");
        city.put("India", "Delhi");
        city.put("Germany","Berlin");
        city.put("USA","Washington DC");
        System.out.println(city);
        System.out.println(city.get("India"));
        System.out.println(city.remove("Germany"));
        String n = city.remove("USA");
        System.out.println("item removed "+n);
        System.out.println(city);
        System.out.println("Size is "+city.size());
        
        //loop
        for(String i:city.values())
        {
            System.out.println(i);
        }
        //print keys and values
        for(String i:city.keySet())
        {
            System.out.println("Key: "+i+" values: "+city.get(i));
        }
        
        
        HashMap<String,Integer> cars=new HashMap<String,Integer>();
        cars.put("Tesla",1);
        cars.put("TATA",2);
        cars.put("Honda", 3);
        cars.put("Maruti", 4);
        for(String i:cars.keySet())
        {
            System.out.println("Key: "+i+" Values: "+cars.get(i));
        }
    }
}
