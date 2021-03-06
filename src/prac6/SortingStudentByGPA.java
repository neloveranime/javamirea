package prac6;

public class SortingStudentByGPA extends Student implements Comparable<Student> {

    public SortingStudentByGPA(String name, int iD, int points) {
        super(name, iD, points);
    }

    @Override
    public int compareTo(Student o) {
        return this.points.compareTo(o.points);
    }
}