
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 

class Batsman implements Serializable {
    String name;
    int runs;
    float avg;
    boolean ismarried;
    
    Batsman(String name,int runs, float avg, boolean ismarried){
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
public class IOSerialisationsrc1 {
    public static void main(String[] args) throws IOException{
        Batsman ck;
        ck = new Batsman("Samsung", 40000 ,25.5f, true);
        ck.disp();
        
        String path = "C:\\spiderman\\ioprg\\input.txt";
        FileOutputStream fos = new FileOutputStream(path);
        
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(ck);
        
        bos.flush();
        
        
    }
    
}



