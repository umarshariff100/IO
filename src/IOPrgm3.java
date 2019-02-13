
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class IOPrgm3 {
    public static void main(String[] args) throws IOException{
         String path1 = "C:\\spiderman\\ioprg\\Cricketer.txt";
        String path2 = "C:\\spiderman\\ioprg\\output1.txt";
        
        FileReader fr = null;
        FileWriter fw = null;
        
        String temp = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        System.out.println("Process started");
        fr = new FileReader(path1);
        fw = new FileWriter(path2);
        
        br = new BufferedReader(fr);
        bw = new BufferedWriter(fw);
        
        
        while ((temp = br.readLine())!= null){
            bw.write(temp);
        }
        
        br.close();
        fr.close();
        
        bw.close();
        fw.close();
        
        System.out.println("Process completed");
    }
    
    
}
