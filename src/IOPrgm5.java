
import java.io.File;

public class IOPrgm5 {

    public static void main(String[] args) {
        String path = "C:\\spiderman\\ioprg\\Cricketer.txt";

        File f;
        f = new File(path);
        System.out.println(f.canExecute());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getParent());
        System.out.println(f.getParentFile());
        System.out.println(f.getName());
    }

}
