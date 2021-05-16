package Stream;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long millisecond = 0;
        FileInputStream fis = new FileInputStream("z.zip");
        BufferedInputStream bis = new BufferedInputStream(fis); //buffer 로 속도 향상

        FileOutputStream fos = new FileOutputStream("copy.zip");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        millisecond = System.currentTimeMillis();

        int i;
        while((i = bis.read())!=-1){
            bos.write(i);
        }
        millisecond = System.currentTimeMillis() - millisecond;

        System.out.println("time rate: "+millisecond);
    }
}
