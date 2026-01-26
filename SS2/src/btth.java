import java.util.Scanner;

public class btth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int luaChon;

        while (true) {
            System.out.println("\n===== MENU QUAN LY THU VIEN =====");
            System.out.println("1. Tinh tien phat tra sach muon");
            System.out.println("2. Dang ky the muon sach VIP");
            System.out.println("3. Thong ke sach nhap kho");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    // ===== CHUC NANG 1 =====
                    int soSach;
                    int tongTienPhat = 0;

                    System.out.print("Nhap so luong sach phai tra: ");
                    soSach = sc.nextInt();

                    for (int i = 1; i <= soSach; i++) {
                        System.out.print("Nhap so ngay qua han cua sach thu " + i + ": ");
                        int ngayTre = sc.nextInt();

                        if (ngayTre <= 0) {
                            continue;
                        }

                        if (ngayTre <= 5) {
                            tongTienPhat += ngayTre * 2000;
                        } else {
                            tongTienPhat += 5 * 2000 + (ngayTre - 5) * 5000;
                        }
                    }

                    System.out.println("Tong tien phat: " + tongTienPhat + " VND");
                    break;

                case 2:
                    // ===== CHUC NANG 2 =====
                    System.out.print("Nhap tuoi: ");
                    int age = sc.nextInt();

                    System.out.print("Nhap so sach da muon trong thang: ");
                    int quantityBorrow = sc.nextInt();

                    System.out.print("Co the uu tien khong? (1-Co | 0-Khong): ");
                    int priorityInput = sc.nextInt();
                    boolean isPriority = (priorityInput == 1);

                    if ((age >= 18 && quantityBorrow >= 10) || isPriority) {
                        System.out.println("Ket qua: Du tieu chuan nang cap VIP");
                    } else {
                        System.out.println("Ket qua: Chua du tieu chuan");
                    }
                    break;

                case 3:
                    // ===== CHUC NANG 3 =====
                    int demSach = 0;
                    int maSach;

                    do {
                        System.out.print("Nhap ma sach moi (>0, 0 de dung): ");
                        maSach = sc.nextInt();

                        if (maSach < 0) {
                            System.out.println("Ma khong hop le. Moi nhap lai!");
                            continue;
                        }

                        if (maSach == 0) {
                            break;
                        }

                        demSach++;
                    } while (true);

                    System.out.println("Tong so sach hop le da nhap: " + demSach);
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh!");
                    return;

                default:
                    System.out.println("Lua chon khong hop le. Moi nhap lai!");
            }
        }
    }
}
