import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    static final int Max =100;
    static String[] danhSach = new String[Max];
    static int soLuong= 0;

    static Scanner sc = new Scanner(System.in);
    static Pattern mssvPattern = Pattern.compile("^B\\d{7}$");

    public static void main(String[] args){

        int choice;

        do{
            hienThiMenu();
            choice= Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    hienThi();
                    break;
                case 2:
                    themMoi();
                    break;
                case 3:
                    capNhat();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    timKiem();
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Hay chọn lại");
            }

        }while (choice  != 6);
    }
    // Hiển thị menu
    static void hienThiMenu() {
        System.out.println("\n===== QUẢN LÝ MÃ SỐ SINH VIêN =====");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV theo vị trí");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("6. Thoát");
        System.out.print("Chọn: ");
    }
    //Hiển thị
    static void hienThi() {
        if (soLuong == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        for (int i = 0; i < soLuong; i++) {
            System.out.println(i + " - " + danhSach[i]);
        }
    }
    // Thêm mới
    static void themMoi() {
        if (soLuong >= Max) {
            System.out.println("Danh sách đã đầy!");
            return;
        }

        String mssv;
        do {
            System.out.print("Nhập MSSV mới: ");
            mssv = sc.nextLine();

            Matcher matcher = mssvPattern.matcher(mssv);
            if (!matcher.matches()) {
                System.out.println("MSSV không hợp lệ! (VD: B2101234)");
            } else {
                break;
            }
        } while (true);

        danhSach[soLuong++] = mssv;
        System.out.println("Thêm MSSV thành công!");
    }
    // Cập Nhật
    static void capNhat() {
        System.out.print("Nhập vị trí cần sửa: ");
        int index = Integer.parseInt(sc.nextLine());

        if (index < 0 || index >= soLuong) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }

        String mssvMoi;
        do {
            System.out.print("Nhập MSSV mới: ");
            mssvMoi = sc.nextLine();

            if (!mssvPattern.matcher(mssvMoi).matches()) {
                System.out.println("MSSV không hợp lệ!");
            } else {
                break;
            }
        } while (true);

        danhSach[index] = mssvMoi;
        System.out.println("Cập nhật thành công!");
    }
    // Xóa
    static void xoa(){
        System.out.print("Nhập MSSV cần xóa: ");
        String mssv = sc.nextLine();

        int viTri = -1;
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].equals(mssv)) {
                viTri = i;
                break;
            }
        }

        if (viTri == -1) {
            System.out.println("Không tìm thấy MSSV!");
            return;
        }
        for (int i = viTri; i < soLuong - 1; i++) {
            danhSach[i] = danhSach[i + 1];
        }

        danhSach[--soLuong] = null;
        System.out.println("Xóa thành công!");
    }
    //Tìm Kiếm
    static void timKiem(){
    }
}