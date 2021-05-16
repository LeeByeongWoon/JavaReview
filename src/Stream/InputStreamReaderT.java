package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderT {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fine.txt");
        InputStreamReader isr = new InputStreamReader(fis);// 보조 스트림
        int i;
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
