import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double usdPrice = scanner.nextDouble();

        System.out.print("Nhập tỷ giá (kiểu float): ");
        float exchangeRate = scanner.nextFloat();

        double vndExact = usdPrice * exchangeRate;
        long vndRounded = (long) vndExact;

        System.out.println("Giá chính xác (số thực): " + vndExact);
        System.out.println("Giá làm tròn để thanh toán (long): " + vndRounded);

        scanner.close();
    }
}
