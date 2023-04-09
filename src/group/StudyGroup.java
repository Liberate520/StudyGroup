package group;

import student.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E extends GroupElement> implements Group<E>{
    private List<E> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student){
        student.getName();
        studentList.add(student);
    }

    public List<E> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
    }
}
