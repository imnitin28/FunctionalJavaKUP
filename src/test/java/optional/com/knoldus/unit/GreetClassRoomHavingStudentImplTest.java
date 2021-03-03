package optional.com.knoldus.unit;

import optional.com.knoldus.DatabaseModel.ClassroomInfo;
import optional.com.knoldus.DatabaseModel.ClassroomInfoImpl;
import optional.com.knoldus.entity.Student;
import optional.com.knoldus.service.GetSubjectOfRoomxyzImpl;
import optional.com.knoldus.service.GreetClassroomHavingStudentImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GreetClassRoomHavingStudentImplTest {
    ClassroomInfo classroomInfo = new ClassroomInfoImpl();
    List<Student> studentList = classroomInfo.insertClassroomInfo();
    @Test
    public void greetClassRoomHavingStudentImpltest()
    {
        GreetClassroomHavingStudentImpl greetClassroomHavingStudent = new GreetClassroomHavingStudentImpl();
        greetClassroomHavingStudent.greetClassroomHavingStudent(studentList);
        Assert.assertTrue(!studentList.isEmpty());
    }
}
