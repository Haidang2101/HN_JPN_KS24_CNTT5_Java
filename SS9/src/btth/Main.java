import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] list = new Employee[100];
        int current = 0;
        int choice;

        do {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhap thong tin nhan vien");
            System.out.println("2. Nhap thong tin quan ly");
            System.out.println("3. Tinh luong");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Sap xep theo luong giam dan");
            System.out.println("6. Dem so nhan vien va quan ly");
            System.out.println("7. Tim kiem theo ten");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Nhap so nhan vien: ");
                    int n1 = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n1; i++) {
                        Employee e = new Employee();
                        e.inputData(sc);
                        list[current++] = e;
                    }
                    break;

                case 2:
                    System.out.print("Nhap so quan ly: ");
                    int n2 = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n2; i++) {
                        Manager m = new Manager();
                        m.inputManager(sc);
                        list[current++] = m;
                    }
                    break;

                case 3:
                    for (int i = 0; i < current; i++) {
                        list[i].calSalary(); // đa hình
                    }
                    System.out.println("Da tinh luong xong!");
                    break;

                case 4:
                    for (int i = 0; i < current; i++) {
                        list[i].displayData();
                        System.out.println("---------------------");
                    }
                    break;

                case 5:
                    for (int i = 0; i < current - 1; i++) {
                        for (int j = i + 1; j < current; j++) {
                            if (list[i].getSalary() < list[j].getSalary()) {
                                Employee temp = list[i];
                                list[i] = list[j];
                                list[j] = temp;
                            }
                        }
                    }
                    System.out.println("Da sap xep!");
                    break;

                case 6:
                    int empCount = 0;
                    int managerCount = 0;

                    for (int i = 0; i < current; i++) {
                        if (list[i] instanceof Manager) {
                            managerCount++;
                        } else {
                            empCount++;
                        }
                    }

                    System.out.println("So nhan vien: " + empCount);
                    System.out.println("So quan ly: " + managerCount);
                    break;

                case 7:
                    System.out.print("Nhap ten can tim: ");
                    String key = sc.nextLine();

                    for (int i = 0; i < current; i++) {
                        if (list[i].getName().contains(key)) {
                            list[i].displayData();
                            System.out.println("---------------------");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon sai!");
            }

        } while (choice != 8);
    }
}
