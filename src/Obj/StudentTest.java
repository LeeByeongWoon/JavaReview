package Obj;

class Student{
    private final int studentNum;
    private final String studentName;

    public Student ( int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentNum+" - "+studentName;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student std =(Student)obj;
        return this.studentNum == std.studentNum;
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student student= new Student(100,"std1");
        Student student2= new Student(100,"std1");

        System.out.println(student.getClass());
        System.out.println( student.equals(student2));

        //virtual address
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        // real address
        System.out.println(System.identityHashCode(student));
        System.out.println(System.identityHashCode(student2));
    }
}
