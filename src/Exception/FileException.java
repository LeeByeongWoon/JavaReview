package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public static void main(String[] args) {
        FileInputStream fis = null;
//        try (fis){
//            fis = new FileInputStream("a.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        System.out.println("end");
    }
}
