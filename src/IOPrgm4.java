
import java.io.File;


public class IOPrgm4 {
    public static void main(String[] args){
        String path = "C:\\spiderman\\ioprg\\Cricketer.txt";
        
        File f;
        f = new File(path);
        
        if(f.exists()== true){
            if(f.isFile()== true){
                System.out.println("the give path contains a file");
            }
            else{
                System.out.println("The given path contails a folder");
            }
        }
        else{
            System.out.println("Invalid path");
        }
        
    }
    
}
