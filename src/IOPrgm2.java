
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

///data has not been transfered to output file 
public class IOPrgm2 {
    public static void main(String[] args){
        String path1 = "C:\\spiderman\\ioprg\\input.txt";
        String path2 = "C:\\spiderman\\ioprg\\output.txt";
        
        
        FileReader fr = null;
        FileWriter fw = null;
        
        int temp = 0;
        
        try{
        System.out.println("Process Started");
        fr = new FileReader(path1);
        fw =  new FileWriter(path2);
        
        while ((temp = fr.read())!= -1){
            fw.write(temp);
        }
        
        System.out.println("Process completed");
        }
        
        catch (IOException e){
            System.out.println("Data transfer Failed");
        }
        
        
    }
    
}
