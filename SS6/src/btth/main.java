public class main {
    public static void main(String[] args) {

        // ===== Khởi tạo 2 tài khoản =====
        BankAccount Dang = new BankAccount(
                "0987654321",
                "Nguyễn Hải Đăng",
                100
        );

        BankAccount Hieu = new BankAccount(
                "0123456789",
                "Nguyễn Văn Hiếu",
                50000000
        );

        // ===== Trước giao dịch =====
        System.out.println("THÔNG TIN TRƯỚC GIAO DỊCH");
        Dang.display();
        Hieu.display();

        // ===== Thực hiện giao dịch =====
        Dang.deposit(20000000);
        Dang.withdraw(30000000);

        Hieu.withdraw(60000000); // không đủ tiền
        Hieu.deposit(10000000);

        // ===== Sau giao dịch =====
        System.out.println("\nTHÔNG TIN SAU GIAO DỊCH");
        Dang.display();
        Hieu.display();
    }
}
