package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("a.txt")){
            System.out.println(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
