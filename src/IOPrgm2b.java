
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPrgm2b {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path1 = "C:\\spiderman\\ioprg\\input.txt";
        String path2 = "C:\\spiderman\\ioprg\\output.txt";

        FileReader fr = null;
        FileWriter fw = null;

        int temp = 0;

        try {

            System.out.println("Process Started");
            fr = new FileReader(path1);
            fw = new FileWriter(path2);

            while ((temp = fr.read()) != -1) {
                fw.write(temp);
            }

            System.out.println("Process completed");
        } catch (IOException e) {
            System.out.println("Data transfer Failed");
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException f) {
                System.out.println("unable to close resourse");
            }

        }
    }
}
