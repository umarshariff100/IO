import java.io.*; 
class Car implements Externalizable { 
    static int age; 
    String name; 
    int year; 
  
    
    Car(String n, int y) 
    { 
        name = n; 
        year = y; 
        age = 10; 
    } 
    @Override
    
    public void writeExternal(ObjectOutput out)  
                              throws IOException 
    { 
        out.writeObject(name); 
        out.writeInt(age); 
        out.writeInt(year); 
    } 
    @Override
    public void readExternal(ObjectInput in)  
       throws IOException, ClassNotFoundException 
    { 
        name = (String)in.readObject(); 
        year = in.readInt(); 
        age = in.readInt(); 
    } 
    @Override
    public String toString() 
    { 
        return ("Name: " + name + "\n" +  
               "Year: " + year + "\n" +  
               "Age: " + age); 
    } 
   
       void disp(){
        System.out.println(name);
        System.out.println(year);
        System.out.println(age);
       
        
    }
} 
  
public class ExternalizableSrc1 { 
    public static void main(String[] args) 
    { 
        Car car = new Car("Shubham", 1995); 
        Car newcar = null; 
  
        // Serialize the car 
        try { 
            String path = "C:\\spiderman\\ioprg\\Batsman.txt";
            FileOutputStream fo; 
            fo = new FileOutputStream(path);
            ObjectOutputStream so = new ObjectOutputStream(fo); 
            so.writeObject(car); 
            so.flush(); 
        } 
        catch (IOException e) { 
            System.out.println(e); 
        } 
        car.disp();
  
        // Deserializa the car 
        
    } 
} 