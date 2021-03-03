package optional.com.knoldus.service;

import optional.com.knoldus.entity.Student;

import java.util.List;

public class StudentWithRoomThatHasNoSubjectImpl implements StudentWithRoomThatHasNoSubject{
    @Override
    public void studentWithRoomThatHasNoSubject(List<Student> people) {
        System.out.println("*****Students associated with a room that have no subjects associated*****");
        people.stream().forEach((p) -> {
            if (!p.getSubjects().isPresent())
            {
                System.out.println("Name: " + p.getName() + " || rollNumber: " + p.getRollNumber());
            }
        });
    }
}
