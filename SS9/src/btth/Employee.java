import java.util.Scanner;

public class Employee {

    // ===== Thuộc tính =====
    protected String id;          // Mã nhân viên
    protected String name;        // Tên
    protected int age;            // Tuổi
    protected double credit;      // Hệ số lương
    protected double baseSalary;  // Lương cơ bản
    protected double salary;      // Lương thực nhận

    // ===== Constructor không tham số =====
    public Employee() {
        baseSalary = 1300000;
    }

    // ===== Constructor đầy đủ tham số =====
    public Employee(String id, String name, int age, double credit) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.credit = credit;
        this.baseSalary = 1300000;
    }

    // ===== Getter / Setter =====
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // ===== Nhập dữ liệu =====
    public void inputData(Scanner sc) {
        // ID
        System.out.print("Nhap ma nhan vien (E***): ");
        id = sc.nextLine();
        while (!id.startsWith("E") || id.length() != 4) {
            System.out.print("Nhap lai ma nhan vien: ");
            id = sc.nextLine();
        }

        // Name
        System.out.print("Nhap ten nhan vien: ");
        name = sc.nextLine();
        while (name.length() < 8 || name.length() > 50) {
            System.out.print("Nhap lai ten (8-50 ky tu): ");
            name = sc.nextLine();
        }

        // Age
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        while (age < 18) {
            System.out.print("Tuoi phai >= 18. Nhap lai: ");
            age = sc.nextInt();
        }

        // Credit
        System.out.print("Nhap he so luong: ");
        credit = sc.nextDouble();
        while (credit <= 0) {
            System.out.print("He so luong > 0. Nhap lai: ");
            credit = sc.nextDouble();
        }
        sc.nextLine();
    }

    // ===== Tính lương =====
    public void calSalary() {
        salary = credit * baseSalary;
    }

    // ===== Hiển thị =====
    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("He so luong: " + credit);
        System.out.println("Luong: " + salary);
    }
}
