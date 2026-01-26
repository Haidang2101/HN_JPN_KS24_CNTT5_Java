import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của bạn: ");
        int tuoi = sc.nextInt();

        System.out.print("Nhập số sách đang mượn: ");
        int soSachDangMuon = sc.nextInt();

        // Kiểm tra điều kiện
        if (tuoi >= 18 && soSachDangMuon < 3) {
            System.out.println("Kết quả: Bạn ĐỦ ĐIỀU KIỆN mượn sách quý hiếm.");
        } else {
            System.out.println("Kết quả: Không đủ điều kiện.");

            if (tuoi < 18) {
                System.out.println("- Lý do: Bạn phải từ 18 tuổi trở lên.");
            } else if (soSachDangMuon >= 3) {
                System.out.println("- Lý do: Bạn đã mượn tối đa 3 cuốn.");
            }
        }
    }
}
