import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        int checkDigit = sumOfFirstThreeNumber % 10;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + checkDigit);

        boolean isValid = (checkDigit == units);

        if (isValid) {
            System.out.println("Kết quả kiểm tra mã sách: HỢP LỆ");
        } else {
            System.out.println("Kết quả kiểm tra mã sách: SAI MÃ");
        }
    }
}
