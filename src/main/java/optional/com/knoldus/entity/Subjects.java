package optional.com.knoldus.entity;
import java.util.List;

public class Subjects {
    private final String subject1;
    private final String subject2;
    private final String subject3;
    private final String subject4;

    public Subjects(String subject1, String subject2, String subject3, String subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    public String getSubject1(){
        return subject1;
    }

    public String getSubject2(){
        return subject2;
    }

    public String getSubject3(){
        return subject3;
    }

    public String getSubject4(){
        return subject4;
    }
    @Override
    public String toString() {
        return "Subjects{" + "Subject1=" + subject1 + ", Subject2=" + subject2
                + ", Subject3=" + subject3 + ", Subject4=" +subject4 + '}';
    }

}
