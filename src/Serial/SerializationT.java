package Serial;

import java.io.*;

class Person implements Serializable {
    String name;
    transient String job;

    public Person() {
    }

    ;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + "," + job;
    }
}

public class SerializationT {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("person1", "normal");
        Person person2 = new Person("person2", "normal");
        Person person3 = new Person("person3", "normal");
        String json = String.format("{\"name\":\"%s\",\"job\":\"%s\"}", person1.name, person1.job);
        String json2 = String.format("{\"name\":\"%s\",\"job\":\"%s\"}", person2.name, person2.job);
        String json3 = String.format("{\"name\":\"%s\",\"job\":\"%s\"}", person2.name, person2.job);
        FileOutputStream fos = new FileOutputStream("serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(json);
        oos.writeObject(json2);
        oos.writeObject(json3);

        FileInputStream fis = new FileInputStream("serial.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        String no1 = (String) ois.readObject();
        String no2 = (String) ois.readObject();
        String no3 = (String) ois.readObject();

        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);
    }
}
