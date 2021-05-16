package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamT {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo = new FileOutputStream("out.txt");
        byte data = 65;
        for (int i = 0; i < 26; i++) {
            fo.write(data);
            data++;
        }
        FileInputStream fi = new FileInputStream("out.txt");
        int i;
        while ((i = fi.read()) != -1) {
            System.out.print((char) i);
        }
    }
}
