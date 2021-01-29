/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

/**
 *
 * @author Sunil Shetty
 */
import java.io.*;
import java.util.*;
public class ReadFile {
    public static void main(String[]args){
        File obj = new File("sunil.txt");
        try{
            Scanner myReader = new Scanner(obj);
            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error occured: ");
            e.printStackTrace();
        }
        System.out.println("whether file is exists: "+obj.exists());
        System.out.println("can read "+obj.getName()+" "+obj.canRead());
        System.out.println("Can write "+obj.getName()+" "+obj.canWrite());
        System.out.println("path of "+obj.getName()+" is "+obj.getAbsolutePath());
        System.out.println("length of "+obj.getName()+" file is "+obj.length()+" bytes");
        System.out.println("array of file in directory "+obj.getName()+" is "+obj.list());
        
    }
    
}
