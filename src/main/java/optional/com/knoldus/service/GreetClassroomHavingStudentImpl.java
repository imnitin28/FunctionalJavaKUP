package optional.com.knoldus.service;

import optional.com.knoldus.entity.Student;

import java.util.List;

public class GreetClassroomHavingStudentImpl implements GreetClassroomHavingStudent {

    @Override
    public void greetClassroomHavingStudent(List<Student> people) {
        System.out.println("*****Print hello Student if a room has students associated*****");
        people.forEach((p) -> {
            if(p.getSubjects().isPresent() && !p.getName().isEmpty())
            {
                System.out.println("Hello " + p.getName());
            }
        });
    }
}
