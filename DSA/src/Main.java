import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Student.collegeName="Gehu";
       Student student= new Student();
       student.name="Yogesh";
       List<Student> list = new ArrayList<>();
       list.add(student);
        System.out.println(list);
    }
}
