import java.util.Scanner;

public class Manager extends Employee {

    private String position;
    private String department;


    public Manager() {
        super();
    }

    public Manager(String id, String name, int age, double credit,
                   String position, String department) {
        super(id, name, age, credit);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public void inputManager(Scanner sc) {
        super.inputData(sc);

        System.out.print("Nhap vi tri: ");
        position = sc.nextLine();

        System.out.print("Nhap phong ban: ");
        department = sc.nextLine();
    }

    public void calSalary() {
        salary = credit * baseSalary * 1.2;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Vi tri: " + position);
        System.out.println("Phong ban: " + department);
    }
}
