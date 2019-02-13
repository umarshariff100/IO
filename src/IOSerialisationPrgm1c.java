
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 

class Cricketer2 implements Serializable {
    String name;
    int runs;
    float avg;
    boolean ismarried;
    
    Cricketer2(String name,int runs, float avg, boolean ismarried){
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
public class IOSerialisationPrgm1c {
    public static void main(String[] args) throws IOException{
        Cricketer2 ck;
        ck = new Cricketer2("Sachin", 40000 ,25.5f, true);
        ck.disp();
        
        String path = "C:\\spiderman\\ioprg\\input1.txt";
        FileOutputStream fos = new FileOutputStream(path);
        
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(ck);
        
        
        
        
    }
    
}



