package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrowsException {
    public void loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class<?> c = Class.forName(className);
    }

    public static void main(String[] args) {
        TrowsException test = new TrowsException();
        try{
            test.loadClass("a.txt","java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
