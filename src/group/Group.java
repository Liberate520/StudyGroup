package group;

import student.Student;

import java.util.Iterator;
import java.util.List;

public interface Group<E> extends Iterable<E>{
    void addStudent(E student);
    List<E> getStudentList();
}
