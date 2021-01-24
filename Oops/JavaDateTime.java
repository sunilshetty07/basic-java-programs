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

/*import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
*/
import java.time.*;
import java.time.format.DateTimeFormatter;
public class JavaDateTime {
    public static void main(String[]args){
        LocalDate myobj = LocalDate.now();
        System.out.println(myobj);//in yyyy-mm-dd format
        
        LocalTime t=LocalTime.now();
        System.out.println("Before formatting "+t);//in hh-mm-ss format
        DateTimeFormatter fo=DateTimeFormatter.ofPattern("ss:mm:hh");
        String Formatted = fo.format(t);
        System.out.println("After formatting: "+Formatted);
        
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);//yyyy-mm-dd-hh-mm-ss
        
        DateTimeFormatter fo1=DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String Formatted2 = fo1.format(dt);
        System.out.println("After formatting: "+Formatted2);
        
        DateTimeFormatter fo2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String Formatted3 = fo2.format(dt);
        System.out.println("After formatting: "+Formatted3);
        
        DateTimeFormatter fo3=DateTimeFormatter.ofPattern("e,MMM dd yyyy");
        String Formatted4 = fo3.format(dt);
        System.out.println("After formatting: "+Formatted4);
    }
    
}
