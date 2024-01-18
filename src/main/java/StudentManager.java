
import java.util.List;
import java.util.Scanner;


public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private final List<Student> studentList;
    private final StudentDao studentDao;


    public StudentManager() {
        studentDao = new StudentDao();
        studentList = studentDao.read();
    }
    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();

        byte age = inputAge();
        String address = inputAddress();
        String sdt = inputSdt();
        float diemToanMieng = inputDiemToanMieng();
        float diemToanKiemTra = inputDiemToanKiemTra();
        float diemToanCuoiKy = inputDiemToanCuoiKy();
        float diemNguVanMieng = inputDiemNguVanMieng();
        float diemNguVanKiemTra = inputDiemNguVanKiemTra();
        float diemNguVanCuoiKy = inputDiemNguVanCuoiKy();
        float diemTiengAnhMieng = inputDiemTiengAnhMieng();
        float diemTiengAnhKiemTra = inputDiemTiengAnhKiemTra();
        float diemTiengAnhCuoiKy = inputDiemTiengAnhCuoiKy();
        Student student = new Student(id, name, age, address, diemToanMieng, diemToanKiemTra, diemToanCuoiKy, diemNguVanMieng, diemNguVanKiemTra, diemNguVanCuoiKy,
                diemTiengAnhMieng, diemTiengAnhKiemTra, diemTiengAnhCuoiKy, sdt);
        studentList.add(student);
        studentDao.write(studentList);

    }

    private float inputDiemToanMieng() {
        System.out.print("Nhập điểm miệng Môn Toán: ");
        while (true) {
            try {
                float diemMieng = Float.parseFloat(scanner.nextLine());
                if (diemMieng < 0.0 || diemMieng > 10.0) {
                    throw new NumberFormatException();
                }
                return diemMieng;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm miệng: ");
            }
        }
    }
    private float inputDiemToanKiemTra() {
        System.out.print("Nhập điểm kiểm tra Môn Toán: ");
        while (true) {
            try {
                float diemKiemTra = Float.parseFloat(scanner.nextLine());
                if (diemKiemTra < 0.0 || diemKiemTra > 10.0) {
                    throw new NumberFormatException();
                }
                return diemKiemTra;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm kiểm tra: ");
            }
        }
    }
    public float inputDiemToanCuoiKy() {
        System.out.print("Nhập điểm cuối kỳ môn Toán: ");
        while (true) {
            try {
                float diemCuoiKy = Float.parseFloat(scanner.nextLine());
                if (diemCuoiKy < 0.0 || diemCuoiKy > 10.0) {
                    throw new NumberFormatException();
                }
                return diemCuoiKy;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm cuối kỳ môn Toán: ");
            }
        }
    }
    private float inputDiemNguVanMieng() {
        System.out.print("Nhập điểm miệng Môn Ngữ Văn: ");
        while (true) {
            try {
                float diemMieng = Float.parseFloat(scanner.nextLine());
                if (diemMieng < 0.0 || diemMieng > 10.0) {
                    throw new NumberFormatException();
                }
                return diemMieng;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm miệng: ");
            }
        }
    }
    private float inputDiemNguVanKiemTra() {
        System.out.print("Nhập điểm kiểm tra Môn Ngữ Văn: ");
        while (true) {
            try {
                float diemKiemTra = Float.parseFloat(scanner.nextLine());
                if (diemKiemTra < 0.0 || diemKiemTra > 10.0) {
                    throw new NumberFormatException();
                }
                return diemKiemTra;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm kiểm tra: ");
            }
        }
    }
    public float inputDiemNguVanCuoiKy() {
        System.out.print("Nhập điểm cuối kì môn Ngữ Văn: ");
        while (true) {
            try {
                float diemCuoiKi = Float.parseFloat(scanner.nextLine());
                if (diemCuoiKi < 0.0 || diemCuoiKi > 10.0) {
                    throw new NumberFormatException();
                }
                return diemCuoiKi;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm cuối kì: ");
            }
        }
    }
    private float inputDiemTiengAnhMieng() {
        System.out.print("Nhập điểm miệng Môn Tiếng Anh: ");
        while (true) {
            try {
                float diemMieng = Float.parseFloat(scanner.nextLine());
                if (diemMieng < 0.0 || diemMieng > 10.0) {
                    throw new NumberFormatException();
                }
                return diemMieng;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm miệng: ");
            }
        }
    }
    private float inputDiemTiengAnhKiemTra() {
        System.out.print("Nhập điểm kiểm tra Môn Tiếng Anh: ");
        while (true) {
            try {
                float diemKiemTra = Float.parseFloat(scanner.nextLine());
                if (diemKiemTra < 0.0 || diemKiemTra > 10.0) {
                    throw new NumberFormatException();
                }
                return diemKiemTra;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm kiểm tra: ");
            }
        }
    }
    public float inputDiemTiengAnhCuoiKy() {
        System.out.print("Nhập điểm cuối kì môn Tiếng Anh: ");
        while (true) {
            try {
                float diemCuoiKi = Float.parseFloat(scanner.nextLine());
                if (diemCuoiKi < 0.0 || diemCuoiKi > 10.0) {
                    throw new NumberFormatException();
                }
                return diemCuoiKi;
            } catch (NumberFormatException ex) {
                System.out.print("Sai định dạng! Nhập lại điểm cuối kì: ");
            }
        }
    }
    private float calculateDiemTrungBinhMonToan(float diemToanMieng, float diemToanKiemTra, float diemToanCuoiKi) {
        // Thực hiện tính toán theo công thức
        // Ví dụ: (diemMieng * 0.1) + (diemKiemTra * 0.3) + (diemCuoiKi * 0.6)
        // Thay đổi công thức theo yêu cầu cụ thể của bạn
        return (diemToanMieng * 0.1f) + (diemToanKiemTra * 0.3f) + (diemToanCuoiKi * 0.6f);
    }
    private float calculateDiemTrungBinhMonVan(float diemNguVanMieng, float diemNguVanKiemTra, float diemNguVanCuoiKi) {
        // Thực hiện tính toán theo công thức
        // Ví dụ: (diemMieng * 0.1) + (diemKiemTra * 0.3) + (diemCuoiKi * 0.6)
        // Thay đổi công thức theo yêu cầu cụ thể của bạn
        return (diemNguVanMieng * 0.1f) + (diemNguVanKiemTra * 0.3f) + (diemNguVanCuoiKi * 0.6f);
    }
    private float calculateDiemTrungBinhMonAnh(float diemTiengAnhMieng, float diemTiengAnhKiemTra, float diemTiengAnhCuoiKi) {
        // Thực hiện tính toán theo công thức
        // Ví dụ: (diemMieng * 0.1) + (diemKiemTra * 0.3) + (diemCuoiKi * 0.6)
        // Thay đổi công thức theo yêu cầu cụ thể của bạn
        return (diemTiengAnhMieng * 0.1f) + (diemTiengAnhKiemTra * 0.3f) + (diemTiengAnhCuoiKi * 0.6f);
    }
    private float calculateGPA(float diemTrungBinhMonToan,float diemTrungBinhMonVan,float diemTrungBinhMonAnh) {
        // Thực hiện tính toán GPA theo yêu cầu của bạn
        // Ví dụ: return diemTrungBinh / 2;
        // Thay đổi công thức theo yêu cầu cụ thể của bạn
        return (diemTrungBinhMonToan / 3) + (diemTrungBinhMonVan / 3) + (diemTrungBinhMonAnh / 3);
    }

    public void edit(int id) {
        boolean isExisted = false;

        for (Student student : studentList) {
            if (student.getId() == id) {
                isExisted = true;
                System.out.println("Chọn thông tin cần sửa:");
                System.out.println("1. Tên");
                System.out.println("2. Tuổi");
                System.out.println("3. Địa chỉ");
                System.out.println("4. Số ĐT");
                // Lưu trữ thông tin cũ trước thay đổi
                String oldName = student.getName();
                byte oldAge = student.getAge();
                String oldAddress = student.getAddress();
                String oldSdt = student.getSdt();
                int choice = inputChoice();
                System.out.println("Thông tin cũ:");

                switch (choice) {
                    case 1:
                        System.out.println("Tên: " + oldName);
                        break;
                    case 2:
                        System.out.println("Tuổi: " + oldAge);
                        break;
                    case 3:
                        System.out.println("Địa chỉ: " + oldAddress);
                        break;

                    case 4:
                        System.out.println("Số ĐT: " + oldSdt);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }

                // Nhập và hiển thị thông tin mới
                System.out.println("Nhập thông tin mới:");
                switch (choice) {
                    case 1:
                        student.setName(inputName());
                        break;
                    case 2:
                        student.setAge(inputAge());
                        break;
                    case 3:
                        student.setAddress(inputAddress());
                        break;

                    case 4:
                        student.setSdt(inputSdt());
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ");
                }

                break;
            }
        }

        if (!isExisted) {
            System.out.printf("id = %d không tồn tại.\n", id);
        } else {
            studentDao.write(studentList);
        }
    }

    private int inputChoice() {
        System.out.print("Nhập lựa chọn: ");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex) {
                System.out.print("Lỗi! Hãy nhập lại: ");
            }
        }
    }


    public void delete(int id) {
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                studentList.remove(student);
                updateStudentIds(); // Cập nhật lại ID sau khi xóa
                System.out.println("Đã xóa sinh viên có ID: " + id);
                break;
            }
        }
        if (student == null) {
            System.out.printf("ID = %d không tồn tại.\n", id);
        }
    }

    public void updateStudentIds() {
        int newSize = studentList.size();
        for (int i = 0; i < newSize; i++) {
            studentList.get(i).setId(i + 1);
        }
        studentDao.write(studentList);
    }

    public void sortStudentByGPA() {
        // Sử dụng trình so sánh SortStudentByGPA để sắp xếp danh sách theo GPA và tên
        studentList.sort(new SortStudentByGPA());
    }
    public void sortStudentById() {
        studentList.sort(new SortStudentById());
    }


    public void showSortedStudentsByGpa() {
        sortStudentByGPA();
        studentList.sort(new SortStudentByGPA());
        System.out.println("---------------------Danh sách sinh viên ---------------------------------------------------");
        System.out.format("%2s | %-30s | %2s | %-15s | %1s | %-10s%n", "ID", "Họ và tên", "Tuổi", "Địa chỉ", "GPA", "SDT");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Student student : studentList) {
            System.out.format("%2d | ", student.getId());
            int totalWidth = 30;
            String name = student.getName();
            int leftPadding = (totalWidth - name.length()) / 2;
            int rightPadding = totalWidth - name.length() - leftPadding;
            float diemTrungBinhMonToan = calculateDiemTrungBinhMonToan(student.getDiemToanMieng(), student.getDiemToanKiemTra(), student.getDiemToanCuoiKy());
            float diemTrungBinhMonVan = calculateDiemTrungBinhMonVan(student.getDiemNguVanMieng(), student.getDiemNguVanKiemTra(), student.getDiemNguVanCuoiKy());
            float diemTrungBinhMonAnh = calculateDiemTrungBinhMonAnh(student.getDiemTiengAnhMieng(), student.getDiemTiengAnhKiemTra(), student.getDiemTiengAnhCuoiKy());
            float gpa = calculateGPA(diemTrungBinhMonToan,diemTrungBinhMonVan,diemTrungBinhMonAnh);
            System.out.format("%" + leftPadding + "s%s%" + rightPadding + "s | ", "", name, "");
            System.out.format("%4d | ", student.getAge());
            System.out.format("%-15s | ", student.getAddress());
            System.out.format("%1.1f | ", gpa);
            System.out.format("%-10s%n", student.getSdt());
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void showSortedStudentsById() {
        sortStudentById();

        System.out.format("%2s | %-30s | %2s | %-15s | %-11s | %3s%n", "ID", "Họ và tên", "Tuổi", "Địa chỉ", "SDT", "GPA");
        System.out.println("------------------------------------------------------------------------------------------");
        for (Student student : studentList) {
            float diemTrungBinhMonToan = calculateDiemTrungBinhMonToan(student.getDiemToanMieng(), student.getDiemToanKiemTra(), student.getDiemToanCuoiKy());
            float diemTrungBinhMonVan = calculateDiemTrungBinhMonVan(student.getDiemNguVanMieng(), student.getDiemNguVanKiemTra(), student.getDiemNguVanCuoiKy());
            float diemTrungBinhMonAnh = calculateDiemTrungBinhMonAnh(student.getDiemTiengAnhMieng(), student.getDiemTiengAnhKiemTra(), student.getDiemTiengAnhCuoiKy());
            float gpa = calculateGPA(diemTrungBinhMonToan,diemTrungBinhMonVan,diemTrungBinhMonAnh);
            System.out.format("%2d | %-30s | %4s | %-15s |  %-10s | %1.2f%n",
                    student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getSdt(), gpa);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
    }
    public void showDiemById(int id) {
        Student student = findStudentById(id);
        if (student != null) {
            System.out.println("Điểm của sinh viên có id " + id + " là: ");
            float diemTrungBinhMonToan = calculateDiemTrungBinhMonToan(student.getDiemToanMieng(), student.getDiemToanKiemTra(), student.getDiemToanCuoiKy());
            float diemTrungBinhMonVan = calculateDiemTrungBinhMonVan(student.getDiemNguVanMieng(), student.getDiemNguVanKiemTra(), student.getDiemNguVanCuoiKy());
            float diemTrungBinhMonAnh = calculateDiemTrungBinhMonAnh(student.getDiemTiengAnhMieng(), student.getDiemTiengAnhKiemTra(), student.getDiemTiengAnhCuoiKy());

            System.out.format("%2s | %-30s | %10s | %10s | %10s | %10s | %10s | %10s | %10s | %10s| %10s| %10s| %10s| %10s%n",
                    "ID", "Họ và tên", "Miệng Toán", "KT Toán", "Cuối kì Toán", "TB Toán", "Miệng Văn", "KT Văn", "Cuối kì Văn", "TB Văn", "Miệng Anh", "KT Anh", "Cuối kì Anh", "TB Anh");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.format("%2d | %-30s | %10.1f | %10.1f | %12.1f | %10.1f | %10.1f | %10.1f | %11.1f |%10.1f |%10.1f |%10.1f |%11.1f |%10.1f%n",
                    student.getId(), student.getName(), student.getDiemToanMieng(), student.getDiemToanKiemTra(), student.getDiemToanCuoiKy(), diemTrungBinhMonToan,
                    student.getDiemNguVanMieng(), student.getDiemNguVanKiemTra(), student.getDiemNguVanCuoiKy(), diemTrungBinhMonVan,
                    student.getDiemTiengAnhMieng(), student.getDiemTiengAnhKiemTra(), student.getDiemTiengAnhCuoiKy(), diemTrungBinhMonAnh);
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
        } else {
            System.out.println("Không tìm thấy sinh viên có ID: " + id);
        }
    }
    private Student findStudentById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void showAllInfoWithDiemMon() {
        System.out.println("-------------------------------------------------------Danh sách sinh viên--------------------------------------------------------------------");
        System.out.format("%2s | %-20s | %10s | %10s | %10s | %10s | %10s | %10s | %10s | %10s| %10s| %10s| %10s| %10s%n",
                "ID", "Họ và tên",  "Miệng Toán", "KT Toán", "Cuối kì Toán", "TB Toán",  "Miệng Văn", "KT Văn", "Cuối kì Văn", "TB Văn",  "Miệng Anh", "KT Anh", "Cuối kì Anh", "TB Anh");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Student student : studentList) {
            float diemTrungBinhMonToan = calculateDiemTrungBinhMonToan(student.getDiemToanMieng(), student.getDiemToanKiemTra(), student.getDiemToanCuoiKy());
            float diemTrungBinhMonVan = calculateDiemTrungBinhMonVan(student.getDiemNguVanMieng(), student.getDiemNguVanKiemTra(), student.getDiemNguVanCuoiKy());
            float diemTrungBinhMonAnh = calculateDiemTrungBinhMonAnh(student.getDiemTiengAnhMieng(), student.getDiemTiengAnhKiemTra(), student.getDiemTiengAnhCuoiKy());
            System.out.format("%2s | %-20s | %10.1f | %10.1f | %12.1f | %10.1f | %10.1f | %10.1f | %11.1f |%10.1f |%10.1f |%10.1f |%11.1f |%10.1f%n",
                    student.getId(), student.getName(), student.getDiemToanMieng(), student.getDiemToanKiemTra(), student.getDiemToanCuoiKy(), diemTrungBinhMonToan,
                    student.getDiemNguVanMieng(), student.getDiemNguVanKiemTra(), student.getDiemNguVanCuoiKy(), diemTrungBinhMonVan,
                    student.getDiemTiengAnhMieng(), student.getDiemTiengAnhKiemTra(), student.getDiemTiengAnhCuoiKy(), diemTrungBinhMonAnh);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public int inputId() {
        System.out.print("Nhập ID: ");
        while (true) {
            try {
                return Integer.parseInt((scanner.nextLine()));
            } catch (NumberFormatException ex) {
                System.out.print("Lỗi! Hãy nhập lại: ");
            }
        }
    }
    private String inputName() {
        System.out.print("Nhập tên: ");
        return scanner.nextLine();
    }
    private String inputAddress() {
        System.out.print("Địa chỉ: ");
        return scanner.nextLine();
    }
    private byte inputAge() {
        System.out.print("Tuổi: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 || age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("Lỗi!Hãy nhập lại: ");
            }
        }
    }

    private String inputSdt() {
        System.out.print("Số ĐT: ");
        while (true) {
            try {
                String sdt = scanner.nextLine();
                // Kiểm tra xem chuỗi có hợp lệ là một số không
                Long.parseLong(sdt);
                if (sdt.length() == 10) {
                    return sdt;
                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException ex) {
                System.out.print("Lỗi! hãy nhập lại: ");
            }
        }
    }
    // getter && setter

}
