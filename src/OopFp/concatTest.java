package OopFp;

public class concatTest {
    public static void main(String[] args) {
        StringConcatImp str = new StringConcatImp();
        str.makeString("hello", "World");

        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("hello", "world");

        StringConcat2 concat2 = (s, s2) -> s + "," + s2;
        System.out.println(concat2.concat("con", "cat"));

    }
}
