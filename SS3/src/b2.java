import java.util.Scanner;

public class b2 {

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Thép đa tôi thế đấy",
                "Đắc nhân tâm",
                "Tắt Đèn",
                "Game of Throne",
                "Số Đỏ"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int result = searchBooks(books, search);

        if (result != -1) {
            System.out.println("Tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }
}