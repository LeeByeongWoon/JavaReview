package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamT {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("fine.txt")){
            int i;
            while ((i = fis.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
