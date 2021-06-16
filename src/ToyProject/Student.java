package ToyProject;

import java.util.ArrayList;

public class Student {
    final String name;
    final int studentId;
    Subject major;
    private ArrayList<Score> scoreList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }

    Student(String name, int studentId, Subject major){
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    public void addSubjectScore(Score score){
        scoreList.add(score);
    }
}
