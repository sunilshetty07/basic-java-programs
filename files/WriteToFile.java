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
public class WriteToFile {
    public static void main(String[]args){
        try{
            FileWriter fr=new FileWriter("sunil.txt");
            fr.write("Hello my name is Sunil. I completed my engineering in 2020. Happy coding :)");
            fr.close();
            System.out.println("Successfully wrote the file.");
            
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }   
}
