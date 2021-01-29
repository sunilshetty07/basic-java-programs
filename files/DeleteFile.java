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
public class DeleteFile {
    public static void main(String[]args){
        File obj = new File("sunil.txt");
        if(obj.delete()){
            System.out.println(obj.getName()+" deleted successfully.");
        }else
        {
            System.out.println("failed to delete the file: "+obj.getName());
        }
    }
}
