import java.io.Serializable;

public class Student implements Serializable, Comparable<Student> {
    private int id;
    private String name;
    private byte age;
    private String address;
    /* điểm trung bình của sinh viên */
    private float gpa;

    private String sdt;

    private final float diemToanMieng;
    private final float diemToanKiemTra;
    private final float diemToanCuoiKy;

    private final float diemNguVanMieng;
    private final float diemNguVanKiemTra;
    private final float diemNguVanCuoiKy;

    private final float diemTiengAnhMieng;
    private final float diemTiengAnhKiemTra;
    private final float diemTiengAnhCuoiKy;

    public Student(int id, String name, byte age, String address,
                   float diemToanMieng, float diemToanKiemTra, float diemToanCuoiKy, float diemNguVanMieng, float diemNguVanKiemTra, float diemNguVanCuoiKy,
                   float diemTiengAnhMieng, float diemTiengAnhKiemTra, float diemTiengAnhCuoiKy, String sdt) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;

        this.diemToanMieng = diemToanMieng;
        this.diemToanKiemTra = diemToanKiemTra;
        this.diemToanCuoiKy = diemToanCuoiKy;

        this.diemNguVanMieng = diemNguVanMieng;
        this.diemNguVanKiemTra = diemNguVanKiemTra;
        this.diemNguVanCuoiKy = diemNguVanCuoiKy;

        this.diemTiengAnhMieng = diemTiengAnhMieng;
        this.diemTiengAnhKiemTra = diemTiengAnhKiemTra;
        this.diemTiengAnhCuoiKy = diemTiengAnhCuoiKy;

        this.sdt = sdt;
    }


    @Override
    public int compareTo(Student student) {
        // Triển khai so sánh ID tăng dần
        return Integer.compare(this.id, student.getId());
    }

    // Getter và setter cho ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public float getDiemToanMieng() {
        return diemToanMieng;
    }

    public float getDiemToanKiemTra() {
        return diemToanKiemTra;
    }

    public float getDiemToanCuoiKy() {
        return diemToanCuoiKy;
    }

    public float getDiemNguVanMieng() {
        return diemNguVanMieng;
    }

    public float getDiemNguVanKiemTra() {
        return diemNguVanKiemTra;
    }

    public float getDiemNguVanCuoiKy() {
        return diemNguVanCuoiKy;
    }

    public float getDiemTiengAnhMieng() {
        return diemTiengAnhMieng;
    }

    public float getDiemTiengAnhKiemTra() {
        return diemTiengAnhKiemTra;
    }

    public float getDiemTiengAnhCuoiKy() {
        return diemTiengAnhCuoiKy;
    }

    public float getGpa() {
        return gpa;
    }


    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }


}
