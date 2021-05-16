package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fis = new FileReader("fine.txt"); // 문자단위 스트림
        try(fis) {
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
