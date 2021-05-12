package InnerClass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    private class InClass {
        int iNum = 100;

        void inTest() {
            System.out.println("outClass num =" + num);
            System.out.println("outClass sNum =" + sNum);
            System.out.println("innerClass iNum =" + iNum);
        }
    }

    public void usingClass() {
        inClass.inTest();
    }
    static class InnerStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("inClass num =" + iNum);
            System.out.println("outClass sNum =" + sNum);
            System.out.println("innerClass iNum =" + sInNum);
        }
        static void sTest(){
            System.out.println("outClass sNum =" + sNum);
            System.out.println("innerClass iNum =" + sInNum);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        OutClass.InnerStaticClass staticClass = new OutClass.InnerStaticClass();
        staticClass.inTest();
    }
}
