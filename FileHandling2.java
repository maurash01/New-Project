import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 {
    public static void main(String[] args) {
        

        Scanner scnScanner = new Scanner(System.in);
        System.out.println("Enter the file name ");
        String filename = scnScanner.nextLine();
        File file = new File(filename+".txt");

        try{
            if (file.createNewFile()) {
                System.out.println("File is Created");
                
            }else{
                System.out.println("File Already Exists");
            }


            // 2. Write the data in our file 
            // Write the file using filename and extension 
            // Check the file exists with same name or not 
            if (file.exists()) {

                FileWriter writer = new FileWriter("filename"+".txt");
                System.out.println("Write the message in your file ");
                String message = scnScanner.nextLine();
    
                // to write message in your file 
                writer.write(message);
                writer.close();
            
                
            }else {
                System.out.println("File not found");
            }

            // 3. Read the file using scanner 

            Scanner reader = new Scanner(file);
            String data = "";
            while (reader.hasNextLine()){
                data = reader.nextLine();

            }
            System.out.println(data);

            // To Update the file 
            System.out.println("Enter to update your message : ");
            String  update = scnScanner.nextLine();
            FileWriter updateWriter = new FileWriter(file,true);
            updateWriter.append(" "+update);
            updateWriter.close();


            // Search the string exists in the file or not 
            System.out.println("Enter what you want to search ");
            String search = scnScanner.nextLine();
            if (data.contains(search)) {

                System.out.println("Found");
                
            }else{
                System.out.println("Not found");
            }


           

        } catch(IOException e){
            throw new RuntimeException(e);
        }


        
    }
    
}
