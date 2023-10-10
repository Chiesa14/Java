package rw.ac.rca.mis;

public class Student extends Person{
     public String school;
    public String grade;
    public  String combination;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCombination() {
        return combination;
    }

    public void setCombination(String combination) {
        this.combination = combination;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                ", combination='" + combination + '\'' +
                '}';
    }
}
