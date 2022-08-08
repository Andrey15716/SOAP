package by.teachmeskills.soap.repository;

import by.teachmeskills.soap.model.Student;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {
    private static final List<Student> students = new ArrayList<>();

    @PostConstruct
    public void initData() {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Ivanov");
        student.setAge(30);
        student.setSex("MALE");
        students.add(student);
    }

    public Student getStudentByName(String name) {
        Student result = null;

        for (Student student : students) {
            if (name.equals(student.getName())) {
                result = student;
            }
        }
        return result;
    }
}
