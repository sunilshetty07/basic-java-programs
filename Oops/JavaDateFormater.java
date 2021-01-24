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
import java.time.*;
import java.time.format.DateTimeFormatter;
public class JavaDateFormater {
    public static void main(String[]args){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Before Formatting.. "+ldt);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        String formatteddate = ldt.format(dtf);
        System.out.println("After Format.. "+formatteddate);
    }
}
