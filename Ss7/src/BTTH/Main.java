package BTTH;

public class Main {
    public static void main(String[] args) {

        // ===== Tạo các đối tượng Student =====
        Student s1 = new Student("1", "Đỗ Hồng Kỳ");
        Student s2 = new Student("2", "Nguyễn Văn Hiếu");
        Student s3 = new Student("3", "Trần Thị Khánh Huyền");

        // ===== Hiển thị thông tin từng sinh viên =====
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        // ===== Gọi phương thức static =====
        Student.showTotalStudent();
    }
}
