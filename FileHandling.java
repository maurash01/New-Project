import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {
        // File Handling work on file : Create, Read, Update, Delete, Access 

        // To create the file : filename and extension 

        File file = new File("Aman.txt");

        // to check the file is already and extension 
        try{
            if (file.createNewFile()) {
                System.out.println("File is Created");
                
            }else{
                System.out.println("File Already Exists");
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }

    }
    
}
