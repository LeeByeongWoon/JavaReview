package ToyProject;

import java.util.ArrayList;

public class Subject {
    private final String name;
    private final int subjectId;
    private int gradeType;

    private ArrayList<Student> studentList = new ArrayList<>();
    public String getName() {
        return name;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    Subject(String name, int subjectId){
        this.name = name;
        this.subjectId = subjectId;
        this.gradeType = 0;
    }

    public void register(Student student){
        studentList.add(student);
    }
}
