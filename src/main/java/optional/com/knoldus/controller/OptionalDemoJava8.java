package optional.com.knoldus.controller;

import optional.com.knoldus.DatabaseModel.ClassroomInfo;
import optional.com.knoldus.DatabaseModel.ClassroomInfoImpl;
import optional.com.knoldus.entity.Student;
import optional.com.knoldus.service.*;

import java.util.List;

public class OptionalDemoJava8 {
    public static void main(String[] args) {
        ClassroomInfo classroomInfo = new ClassroomInfoImpl();
        List<Student> studentList = classroomInfo.insertClassroomInfo();
        //Find the students associated with a room that have no subjects associated.
        StudentWithRoomThatHasNoSubject studentWithRoomThatHasNoSubject = new StudentWithRoomThatHasNoSubjectImpl();
        studentWithRoomThatHasNoSubject.studentWithRoomThatHasNoSubject(studentList);

        //Subjects of students associated with a room that has roomID xyz
        GetSubjectOfRoomxyzInterface getSubjectOfRoomxyzInterface = new GetSubjectOfRoomxyzImpl();
        getSubjectOfRoomxyzInterface.getSubjectOfClassXYZ(studentList);

        //print "hello Student" if a room has students associated.
        GreetClassroomHavingStudent greetClassroomHavingStudent = new GreetClassroomHavingStudentImpl();
        greetClassroomHavingStudent.greetClassroomHavingStudent(studentList);
    }
}
