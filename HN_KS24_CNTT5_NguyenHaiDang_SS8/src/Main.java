import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] danhSach = new Student[100];
        int soLuong = 0;

        int chon;

        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực (chưa làm xong)");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("=================================");
            System.out.print("Hãy chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {

                case 1:
                    System.out.print("Nhập số lượng sinh viên cần thêm: ");
                    soLuong = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < soLuong; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1));

                        System.out.print("Nhập mã SV: ");
                        String id = sc.nextLine();

                        while (!id.startsWith("SV") || id.length() != 5) {
                            System.out.print("Hãy nhập lại mã SV (VD: SV001): ");
                            id = sc.nextLine();
                        }

                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();

                        System.out.print("Nhập điểm: ");
                        double score = sc.nextDouble();
                        sc.nextLine();

                        danhSach[i] = new Student(id, name, score);
                    }
                    break;

                case 2:
                    System.out.println("===== DANH SÁCH SINH VIÊN =====");
                    for (int i = 0; i < soLuong; i++) {
                        System.out.println(danhSach[i]);
                    }
                    break;

                case 3:
                    break;

                case 4:
                    for (int i = 0; i < soLuong - 1; i++) {
                        for (int j = i + 1; j < soLuong; j++) {
                            if (getMucDo(danhSach[i]) < getMucDo(danhSach[j])) {
                                Student temp = danhSach[i];
                                danhSach[i] = danhSach[j];
                                danhSach[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã Sắp Sếp song!");
                    break;

                case 5:
                    System.out.println("Thoát chương Trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (chon != 5);
    }

    // ===== Hàm hỗ trợ sắp xếp học lực =====
    public static int getMucDo(Student sv) {
        if (sv.getRank().equals("Giỏi")) {
            return 3;
        } else if (sv.getRank().equals("Khá")) {
            return 2;
        } else {
            return 1;
        }
    }
}
