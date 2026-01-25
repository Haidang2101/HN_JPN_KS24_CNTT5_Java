import java.util.Scanner;

public class btth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        int bookID = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Nhập tên sách: ");
        String title = scanner.nextLine();

        System.out.print("Nhập giá nhập: ");
        double price = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int quantity = scanner.nextInt();

        System.out.print("Sách còn trong kho? (true/false): ");
        boolean isAvailable = scanner.nextBoolean();

        double totalValue = price * quantity;
        boolean isLargeStock = quantity > 100;
        boolean canBorrow = isAvailable && quantity > 0;

        System.out.println("\n===== BÁO CÁO TÌNH TRẠNG SÁCH =====");
        System.out.println("Mã sách: " + bookID);
        System.out.println("Tên sách: " + title);
        System.out.printf("Giá nhập: %.2f\n", price);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng giá trị kho: %.2f\n", totalValue);
        System.out.println("Kho lớn (>100 sách): " + isLargeStock);
        System.out.println("Trạng thái: " + (isAvailable ? "Còn hàng" : "Hết hàng"));
        System.out.println("Có thể mượn: " + canBorrow);
        scanner.close();
    }
}
