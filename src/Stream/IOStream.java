package Stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class IOStream {
    public static void main(String[] args) {


        InputStreamReader isr = new InputStreamReader(System.in);
        int i;
        try {
            while((i = isr.read()) != '\n'){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
