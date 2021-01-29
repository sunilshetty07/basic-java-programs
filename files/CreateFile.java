/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

/**
 *
 * @author SUnil Shetty
 */
import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[]args){
        try
        {
            File myobj = new File("sunil.txt");
            if(myobj.createNewFile())
            {
                System.out.println("File created: "+myobj.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("An Error occured: "+e);
            e.printStackTrace();
        } 
        
    }
}