package optional.com.knoldus.unit;
import optional.com.knoldus.DatabaseModel.ClassroomInfo;
import optional.com.knoldus.DatabaseModel.ClassroomInfoImpl;
import optional.com.knoldus.entity.Student;
import optional.com.knoldus.service.GetSubjectOfRoomxyzImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GetSubjectOfRoom_xyzImplTest {
    ClassroomInfo classroomInfo = new ClassroomInfoImpl();
    List<Student> studentList = classroomInfo.insertClassroomInfo();
    @Test
    public void testGetSubjectOfRoom_xyzImpl()
    {
        GetSubjectOfRoomxyzImpl getSubjectOfRoom_xyz = new GetSubjectOfRoomxyzImpl();
        getSubjectOfRoom_xyz.getSubjectOfClassXYZ(studentList);
        Assert.assertTrue(!studentList.isEmpty());
    }
}
