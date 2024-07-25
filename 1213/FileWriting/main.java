package FileWriting;

import java.io.FileWriter; 
import java.io.File; 
import java.util.Scanner; 
public class main {
    public static void main(String[] args) {


   
     
        try{
            FileWriter fw = new FileWriter("text.txt"); 
            String data = "hello"; 
            fw.write("Hello how are you"); 
            fw.close(); 


/* 
        File myFile = new File("text.txt"); 
        Scanner reader = new Scanner(myFile);
            while(reader.hasNext()){
                String data = reader.nextLine(); 
                System.out.println(data); 
            } 
            reader.close(); 
        
    
    */
        } catch(Exception e){
            System.out.println(e.getMessage()); 

        }
    }

}
