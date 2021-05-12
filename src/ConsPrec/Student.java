package ConsPrec;

public class Student {
    public static int Identify =1000;
    public int studentId;
    private final String name;
    private final String address;

    Student (String name, String address){
        this.name = name;
        this.address = address;
        studentId = Identify;
        Identify++;
    }
    public void showInfo(){
        System.out.println(Identify);
        System.out.println("아이디: "+studentId);
        System.out.println("이름: "+name);
        System.out.println("주소: "+address);
    }
}
