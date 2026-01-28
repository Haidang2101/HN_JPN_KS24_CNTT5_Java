import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b5 {

    public static void main(String[] args) {

        String[] logs = {
                "2026-01-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",

        };

        String regex = "(\\d{4}-\\d{2}-\\d{2})\\s\\|\\sUser:\\s(\\w+)\\s\\|\\sAction:\\s(\\w+)\\s\\|\\sBookID:\\s(\\w+)";
        Pattern pattern = Pattern.compile(regex);

        int soLuongBorrow = 0;
        int soLuongReturn = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.find()) {
                String ngay = matcher.group(1);
                String nguoiDung = matcher.group(2);
                String hanhDong = matcher.group(3);
                String maSach = matcher.group(4);

                // Thống kê
                if (hanhDong.equals("BORROW")) {
                    soLuongBorrow++;
                } else if (hanhDong.equals("RETURN")) {
                    soLuongReturn++;
                }

                // In thông tin tách được
                System.out.println("Ngày: " + ngay);
                System.out.println("Người dùng: " + nguoiDung);
                System.out.println("Hành động: " + hanhDong);
                System.out.println("Mã sách: " + maSach);
            }
        }

        // In thống kê
        System.out.println("Tổng số lần BORROW: " + soLuongBorrow);
        System.out.println("Tổng số lần RETURN: " + soLuongReturn);
    }
}
