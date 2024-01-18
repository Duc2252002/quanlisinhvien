import java.util.Comparator;

public class SortStudentById implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Sắp xếp theo ID tăng dần
        return Integer.compare(student1.getId(), student2.getId());
    }
}




