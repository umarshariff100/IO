import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 

class Keepers implements Serializable {
     String name;
     transient int runs;
     transient float avg;
    boolean ismarried;
    
    Keepers(String name,int runs, float avg, boolean ismarried){
        this.name = name;
        this.runs = runs;
        this.avg = avg;
        this.ismarried = ismarried;
    }
    
    void disp(){
        System.out.println(name);
        System.out.println(runs);
        System.out.println(avg);
        System.out.println(ismarried);
    }
}
public class SelSerial3a {
    public static void main(String[] args) throws IOException{
        Keepers ck;
        ck = new Keepers("Samsung", 40000 ,25.5f, true);
        ck.disp();
        
        String path = "C:\\spiderman\\ioprg\\Keeper.txt";
        FileOutputStream fos = new FileOutputStream(path);
        
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(ck);
        
        bos.flush();
        
        
    }
    
}



