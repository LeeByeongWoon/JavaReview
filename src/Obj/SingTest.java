package Obj;

class Sing {
    private String title;
    private String singer;

    public Sing(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return title + " , " + singer;
    }
}

public class SingTest {
    public static void main(String[] args) {
        Sing sing = new Sing("blueming", "IU");

        System.out.println(sing.toString());

        String str = new String("Test");
        System.out.println(str.toString());
    }
}


