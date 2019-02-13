import java.io.*; 
class Van implements Serializable { 
    static int age; 
    String name; 
    int year; 
  
    public Van() 
    { 
        System.out.println("Default Constructor called"); 
    } 
  
    Van(String n, int y) 
    { 
        name = n; 
        year = y; 
        age = 10; 
    } 
    public void writeObject(ObjectOutputStream out)  
                              throws IOException 
    { 
        out.writeObject(name); 
        out.writeInt(age); 
        out.writeInt(year); 
    } 
    public void readObject(ObjectInputStream in)  
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
  
public class SerializableSrc1 { 
    public static void main(String[] args) 
    { 
        Van car = new Van("Dhoni", 2000); 
        Van newcar = null; 
  
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

