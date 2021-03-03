package optional.com.knoldus.entity;
import java.util.List;
import java.util.Optional;

public interface StudentInterface {
    public String getName();
    public int getRollNumber();
    public Optional<List<String>> getSubjects();
   // public Optional<List<String>> classRoom();
    public boolean subjectIsEmpty();
}
