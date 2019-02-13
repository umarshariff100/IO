
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 


class Cricketer1 implements Serializable {
    String name;
    int runs;
    float avg;
    boolean isMarried;
    
    Cricketer1(String name,int runs, float avg, boolean isMarried){
        this.name = name;
        this.runs = runs;
        this.avg = avg;
        this.isMarried = isMarried;
    }
    
    void disp(){
        System.out.println(name);
        System.out.println(runs);
        System.out.println(avg);
        System.out.println(isMarried);
    }
}
public class IOSerialisationPrgm1b {
    public static void main(String[] args) throws IOException{
        Cricketer1 ck;
        ck = new Cricketer1("Umar", 40000 ,25.5f, true);
        ck.disp();
        
        String path = "C:\\spiderman\\ioprg\\input1.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ck);
        
    }
    
}

