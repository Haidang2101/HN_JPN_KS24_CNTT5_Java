import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxLuot = -1;
        int minLuot = -1;
        int tongLuot = 0;
        int soNgayMoCua = 0;

        for (int ngay = 2; ngay <= 8; ngay++) {
            if (ngay == 8) {
                System.out.print("Nhap luot muon ngay Chu Nhat: ");
            } else {
                System.out.print("Nhap luot muon ngay Thu " + ngay + ": ");
            }

            int luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            if (maxLuot == -1) {
                maxLuot = luotMuon;
                minLuot = luotMuon;
            } else {
                if (luotMuon > maxLuot) {
                    maxLuot = luotMuon;
                }
                if (luotMuon < minLuot) {
                    minLuot = luotMuon;
                }
            }

            tongLuot += luotMuon;
            soNgayMoCua++;
        }

        System.out.println("\n--- KET QUA THONG KE ---");

        if (soNgayMoCua > 0) {
            double trungBinh = (double) tongLuot / soNgayMoCua;
            System.out.println("Luot muon cao nhat: " + maxLuot);
            System.out.println("Luot muon thap nhat: " + minLuot);
            System.out.println("Trung binh luot muon/ngay: " + trungBinh);
        } else {
            System.out.println("Khong co ngay nao mo cua de thong ke.");
        }
    }
}
