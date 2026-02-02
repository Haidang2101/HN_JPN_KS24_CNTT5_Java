package BTTH;

public class Student {

    // ===== Instance variables (mỗi SV có riêng) =====
    private String id;
    private String name;

    // ===== Static variables (dùng chung) =====
    public static final String SCHOOL_NAME = "PTIT";
    private static int studentCount = 0;

    // ===== Constructor không tham số =====
    public Student() {
        studentCount++;
    }

    // ===== Constructor có tham số =====
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        studentCount++;
    }

    // ===== Getter / Setter =====
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.isEmpty()) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // ===== Instance method =====
    public void displayInfo() {
        System.out.println("-----------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("School Name: " + SCHOOL_NAME);
        System.out.println("-----------------------------------");
    }

    // ===== Static method =====
    public static void showTotalStudent() {
        System.out.println("Tổng số sinh viên: " + studentCount);
    }
}
