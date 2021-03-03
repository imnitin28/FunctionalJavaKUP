package optional.com.knoldus.service;
import optional.com.knoldus.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class GetSubjectOfRoomxyzImpl implements GetSubjectOfRoomxyzInterface {
    public void getSubjectOfClassXYZ(List<Student> list)
    {
        System.out.println("******Subjects of students associated with a room that has roomID xyz******");
        List<Student> student1 = list.stream().
                filter(l->l.getRoomID().
                        equals("xyz")).filter(l->!l.subjectIsEmpty()).
                collect(Collectors.toList());
        System.out.println(student1);
    }
}