 

class Cricketer{
    String name;
    int runs;
    float avg;
    boolean ismarried;
    
    Cricketer(String name,int runs, float avg, boolean ismarried){
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
public class IOSerialisationPrgm1 {
    public static void main(String[] args){
        Cricketer ck;
        ck = new Cricketer("Sachin", 40000 ,25.5f, true);
        ck.disp();
    }
    
}
