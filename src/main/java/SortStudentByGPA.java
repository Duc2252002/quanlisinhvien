import java.util.Comparator;

public class SortStudentByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Sắp xếp theo GPA tăng dần
        int gpaCompare = Float.compare(student1.getGpa(), student2.getGpa());

        // Nếu GPA khác nhau, trả về kết quả so sánh GPA
        if (gpaCompare != 0) {
            return gpaCompare;
        } else {
            // Nếu GPA bằng nhau, tiếp tục so sánh theo tên
            return student1.getName().compareTo(student2.getName());
        }
    }
}
