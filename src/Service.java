import group.Group;
import group.comparators.StudentComparatorById;
import group.comparators.StudentComparatorByName;
import student.Student;

public class Service {
    private int id;
    private Group group;

    public Service(Group group) {
        this.group = group;
    }

    public void addStudent(String name){
        Student student = new Student(id++, name);
        group.addStudent(student);
    }

    public void sortByName(){
        group.getStudentList().sort(new StudentComparatorByName());
    }

    public void sortById(){
        group.getStudentList().sort(new StudentComparatorById());
    }
}
