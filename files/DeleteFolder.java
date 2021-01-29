package files;

/**
 *
 * @author Sunil Shetty
 */
import java.io.*;
public class DeleteFolder {
    public static void main(String[]args){
        File obj = new File("D:\\file");
        System.out.println(obj.exists());
        if(obj.exists()){
            if(obj.delete())
            {
                System.out.println("folder deleted successfully");
            }else{
                System.out.println("failed to delete the folder");
            }
        }else{
            System.out.println("Folder does not exist.");
        }
    }
}
