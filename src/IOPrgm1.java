
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOPrgm1 {
    public static void main(String[] args){
        String path1 = "C://spiderman//ioprg//input.txt";
        String path2 = "C://spiderman//ioprg//output.txt";
        
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        int temp = 0;
        try{
        System.out.println("Process Started");
        fis = new FileInputStream(path1);
        fos=  new FileOutputStream(path2);
        
        while ((temp = fis.read())!= -1){
            fos.write(temp);
        }
        System.out.println("Process Strated");
        }
        
        catch (IOException e){
            System.out.println("Data transfer Failed");
        }
        
        finally{
            try{
                fis.close();
                fos.close();
            }
            catch(IOException f){
                System.out.println("Unable to claen up resources");
            }
        }
    }
    
}
