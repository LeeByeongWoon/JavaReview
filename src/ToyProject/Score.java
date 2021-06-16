package ToyProject;

public class Score {
    int studentId;
    Subject subject;
    int subjectScore;

    public Score( int studentId, Subject subject, int subjectScore){
        this.studentId = studentId;
        this.subject = subject;
        this.subjectScore = subjectScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getSubjectScore() {
        return subjectScore;
    }

    public void setSubjectScore(int subjectScore) {
        this.subjectScore = subjectScore;
    }
}
