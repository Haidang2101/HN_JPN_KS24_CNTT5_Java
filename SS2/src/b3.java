import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soLuongSach;
        int soNgayTre;
        int tongTienPhat = 0;
        final int TIEN_PHAT_MOI_NGAY = 5000;

        System.out.print("Nhap so luong sach tra muon: ");
        soLuongSach = sc.nextInt();

        for (int i = 1; i <= soLuongSach; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            soNgayTre = sc.nextInt();

            tongTienPhat += soNgayTre * TIEN_PHAT_MOI_NGAY;
        }

        System.out.println("===> Tong tien phat: " + tongTienPhat + " VND");
    }
}
