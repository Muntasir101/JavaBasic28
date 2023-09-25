package files;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class readFile_demo {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir")+"\\src\\files\\home.txt";

        BufferedReader br =  new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
