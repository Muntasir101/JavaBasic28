package files;

import java.io.*;


public class writeFile_demo {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir")+"\\src\\files\\demo.txt";

        FileOutputStream fs = new FileOutputStream(filePath);

        String text = "Rose";

        fs.write(text.getBytes());
        fs.flush();
        System.out.println("Successfully write file ");
    }
}
