import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentId;

        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.add();
                    break;
                case "2":
                    studentId = studentManager.inputId();
                    studentManager.edit(studentId);
                    break;
                case "3":
                    studentId = studentManager.inputId();
                    studentManager.delete(studentId);
                    break;
                case "4":
                    studentManager.sortStudentByGPA();
                    studentManager.showSortedStudentsByGpa();
                    break;
                case "5":
                    studentManager.sortStudentById();
                    studentManager.showSortedStudentsById();
                    break;
                case "6":
                    int studentIdForDiem = studentManager.inputId();
                    studentManager.showDiemById(studentIdForDiem);
                    break;
                case "7":
                    // Thêm dòng này để hiển thị thông tin của tất cả sinh viên (bao gồm điểm các môn)
                    studentManager.showAllInfoWithDiemMon();
                    break;
                case "0":
                    System.out.println("Thoát!");
                    exit = true;
                    break;
                default:
                    System.out.println("\n" +
                            "không hợp lệ! vui lòng chọn hành động trong menu bên dưới:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("+---------------------Menu------------------------+");
        System.out.println("| 1. Thêm sinh viên.                              |");
        System.out.println("| 2. Sửa thông tin sinh viên theo id .            |");
        System.out.println("| 3. Xóa sinh viên theo id.                       |");
        System.out.println("| 4. Sắp xếp sinh viên theo gpa .                 |");
        System.out.println("| 5. Hiển thị danh sách sinh viên.                |");
        System.out.println("| 6. Hiển thị điểm của sinh viên theo id.         |");
        System.out.println("| 7. Hiển thị điểm toàn sinh viên.                |");
        System.out.println("| 0. Thoát.                                       |");
        System.out.println("+-------------------------------------------------+");
        System.out.print("Chọn nội dung mong muốn(0-7): ");
    }
}
